package com.company;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class M2ChallengeNdomNdzahHonorineApplicationTests {


//	@Test
//	public void shouldEchoInputInValidRange() throws Exception {
//		// Arrange - not necessary
//		// Act
//		mockMvc.perform(get("/echo/1"))
//				.andDo(print())
//				.andExpect(status().isOk())
//				.andExpect(content().string("1"));    // Assert
//	}
//
//	@Test
//	public void shouldRespondWithUnprocessableEntityWhenInputIsOutOfRange() throws Exception {
//		// Arrange - not necessary
//		// Act
//		mockMvc.perform(get("/echo/12"))
//				.andDo(print())
//				.andExpect(status().isUnprocessableEntity());  // Assert
//	}
//
//	@Test
//	public void shouldRespondWithNotAcceptableWhenInputIsFive() throws Exception {
//		mockMvc.perform(get("/echo/5"))         // Act
//				.andDo(print())
//				.andExpect(status().isNotAcceptable());   // Assert
//	}






}
