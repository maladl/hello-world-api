package com.example.helloworldapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class LoginControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testLoginSuccess() throws Exception {
        String userJson = "{\"username\":\"admin\",\"password\":\"admin1234!\"}";

        mockMvc.perform(MockMvcRequestBuilders.post("/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string("login enabled"));
    }

    @Test
    public void testLoginFailure() throws Exception {
        String userJson = "{\"username\":\"admin\",\"password\":\"wrongpassword\"}";

        mockMvc.perform(MockMvcRequestBuilders.post("/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string("error"));
    }
}
