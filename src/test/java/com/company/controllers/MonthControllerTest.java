package com.company.controllers;

import net.bytebuddy.implementation.bytecode.Addition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {

    @Autowired
    MockMvc mockMvc;

    //Tests for Month Endpoint
    @Test
    public void shouldReturnSuccessfulResponse() throws Exception {
        mockMvc.perform(get("/month/6"))         // Act
                .andDo(print())
                .andExpect(status().isOk());   // Assert
    }

    @Test
    public void shouldRespondWithUnprocessableEntityWhenInputIsOutOfRange() throws Exception {
        // Arrange - not necessary
        // Act
        mockMvc.perform(get("/month/14"))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());  // Assert
    }

    //Tests for Random Month Endpoint
    @Test
    public void shouldGiveSuccessfulResponse() throws Exception {
        mockMvc.perform(get("/randomMonth"))         // Act
                .andDo(print())
                .andExpect(status().isOk());   // Assert
    }

    @Test
    public void forMonthsServedAtRandom() throws Exception {
        // Arrange - not necessary
        // Act
        mockMvc.perform(get("/randomMonth"))
                .andDo(print())
                .andExpect(status().isOk());
    }





}