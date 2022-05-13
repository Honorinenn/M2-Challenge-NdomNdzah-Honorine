package com.company.controllers;


import com.company.models.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.bytebuddy.implementation.bytecode.Addition;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(MathSolutionController.class)
public class MathSolutionControllerTest {

    // Wiring in the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() {
        // This is the standard set up method that runs before each test. It's typically used for instantiating test
        // objects. We don't have to do anything special for mockMvc since it's Autowired. We will however be using
        // setUp() in the future.
    }


    // Tests for Add Endpoint
    @Test
    public void ShouldReturnSuccessfulResponseForAdd() throws Exception {
        MathSolution inputMathSolution = new MathSolution(3, 4,5, "add", 9);
        String inputJson = mapper.writeValueAsString(inputMathSolution);

        MathSolution outputMathSolution = new MathSolution(3, 4, 5, "add", 9);
        String outputJson = mapper.writeValueAsString(outputMathSolution);

        mockMvc.perform(
                        post("/add")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(MockMvcResultMatchers.content().json(outputJson));

    }




    // Tests for subtract Endpoint
    @Test
    public void ShouldReturnSuccessfulResponseForSubtract() throws Exception {
        MathSolution inputMathSolution = new MathSolution(5, 10,6, "subtract", 4);
        String inputJson = mapper.writeValueAsString(inputMathSolution);

        MathSolution outputMathSolution = new MathSolution(5, 10, 6, "subtract", 4);
        String outputJson = mapper.writeValueAsString(outputMathSolution);

        mockMvc.perform(
                        post("/subtract")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(MockMvcResultMatchers.content().json(outputJson));

    }



    // Tests for Multiply Endpoint
    @Test
    public void ShouldReturnSuccessfulResponseForMultiply() throws Exception {
        MathSolution inputMathSolution = new MathSolution(6, 7,7, "multiply", 49);
        String inputJson = mapper.writeValueAsString(inputMathSolution);

        MathSolution outputMathSolution = new MathSolution(6, 7, 7, "multiply", 49);
        String outputJson = mapper.writeValueAsString(outputMathSolution);

        mockMvc.perform(
                        post("/multiply")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(MockMvcResultMatchers.content().json(outputJson));

    }

    // Tests for Divide Endpoint
    @Test
    public void ShouldReturnSuccessfulResponse() throws Exception {
        MathSolution inputMathSolution = new MathSolution(7, 64,4, "divide", 16);
        String inputJson = mapper.writeValueAsString(inputMathSolution);

        MathSolution outputMathSolution = new MathSolution(7, 64, 4, "divide", 16);
        String outputJson = mapper.writeValueAsString(outputMathSolution);

        mockMvc.perform(
                        post("/divide")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(MockMvcResultMatchers.content().json(outputJson));

    }










}
