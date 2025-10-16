package com.renatooliveira.USER_LOGIN.security;

import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.objenesis.strategy.StdInstantiatorStrategy;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.renatooliveira.USER_LOGIN.model.User;
@Service
public class TokenService{
    @Value("${api.security.token.secret}")
    private String secret;
    private Instant generateExpiresDate(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("UTC-03"));
    }

    public String generateToken(User user){
        try{
            Algorithm algorithm = Algorithm.HMAC256(secret);

            String token = JWT.create()
                .withIssuer("LOGIN-REGISTERUSUARIO")
                .withSubject(user.getUsername())
                .withExpiresAt(this.generateExpiresDate())
                .sign(algorithm);
            return token;
        } catch (JWTCreationException exception){
            throw new RuntimeException("Auth Error");
        }
    }
    
    public String validateToken(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
            .withIssuer("LOGIN-REGISTERUSUARIO")
            .build()
            .verify(token)
            .getSubject();
        } catch (JWTVerificationException exception) {
            throw new RuntimeException("Validation error");
        }
    }
}