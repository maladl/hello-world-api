package com.example.helloworldapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        if ("admin".equals(user.getUsername()) && "admin1234!".equals(user.getPassword())) {
            return "login enabled";
        } else {
            return "error";
        }
    }

    static class User {
        private String username;
        private String password;

        // Getters and Setters

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
