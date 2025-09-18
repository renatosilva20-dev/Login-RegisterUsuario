package com.renatooliveira.USER_LOGIN.controller;


import org.springframework.ui.Model;
import com.renatooliveira.USER_LOGIN.exceptions.UserNotFoundException;
import com.renatooliveira.USER_LOGIN.model.User;
import com.renatooliveira.USER_LOGIN.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
@RequestMapping
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showRegistrationPage(@ModelAttribute("user") User user) {
        return "register";
    }
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
    @GetMapping("/welcome")
    public String showWelcomePage(){
        return "welcome";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        userRepository.save(user);

        System.out.println("Usuário registrado com sucesso: " + user.getUsername());

        return "redirect:/login";
    }
    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) {
                return "redirect:/welcome";
            }
        }
        model.addAttribute("error", "Credenciais inválidas. Por favor, tente novamente.");
        return "login";
    }
}