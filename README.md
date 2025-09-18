# 🔐 USER-LOGIN

Aplicação **Spring Boot** para gerenciamento de usuários, com funcionalidades de **registro, login e listagem**.  
O projeto inclui páginas web com **Thymeleaf**, controle de autenticação e persistência de dados.

---

## 🚀 Tecnologias Utilizadas

- **Java 17+**  
- **Spring Boot** 
- **Maven**  
- **Thymeleaf** 
- **H2 Database** 
- **CSS & JS** 

---

## 📂 Estrutura do Projeto

```bash
USER-LOGIN/
├── src/main/java/com/renatooliveira/USER_LOGIN/
│   ├── controller/        
│   ├── model/             
│   ├── repositories/      
│   ├── service/           
│   └── UserLoginApplication.java  
│
├── src/main/resources/
│   ├── templates/         
│   ├── static/            
│   └── application.yml    
│
├── pom.xml                
└── README.md              
```

---

## ⚙️ Como Rodar o Projeto

### Pré-requisitos
- **Java 17+** instalado  
- **Maven** configurado  

### Passos
```bash
# Clone o repositório
git clone https://github.com/renatosilva20-dev/Login-RegisterUsuario.git

# Acesse a pasta do projeto
cd USER-LOGIN

# Compile e rode a aplicação
./mvnw spring-boot:run
```

A aplicação ficará disponível em:  
👉 `http://localhost:8080`

---

## 📖 Funcionalidades

- ✅ Registro de novo usuário  
- ✅ Login de usuário existente  
- ✅ Listagem de usuários cadastrados  
- ✅ Página de boas-vindas personalizada  

---

## 🧪 Testes

O projeto contém testes automatizados em:  
```
src/test/java/com/renatooliveira/USER_LOGIN/
```

Para rodar:
```bash
./mvnw test
```

---

## 🤝 Contribuindo

Contribuições são bem-vindas!  
Para contribuir:  

1. Faça um **fork**  
2. Crie uma **branch** (`git checkout -b minha-feature`)  
3. Commit suas mudanças (`git commit -m 'feat: nova feature'`)  
4. Faça o **push** (`git push origin minha-feature`)  
5. Abra um **Pull Request**  

---

## 📜 Licença

Este projeto está sob a licença **MIT**.  
