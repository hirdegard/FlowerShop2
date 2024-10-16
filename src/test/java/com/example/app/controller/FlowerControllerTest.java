package com.example.app.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class FlowerControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@Test
	void testList() throws Exception {
		mockMvc.perform(get("/flower"))
		.andExpect(status().isOk())
		.andExpect(view().name("flowers/list"));
	}

	@Test
	void testAddGet() throws Exception{
		mockMvc.perform(get("/flower/add"))
		.andExpect(status().isOk())
		.andExpect(view().name("flowers/add"));
	}

	@Test
	void testAddPost() throws Exception {
		mockMvc.perform(post("/flower/add"))
		.andExpect(status().is3xxRedirection())
		.andExpect(view().name("redirect:/flower/addDone"));
	}

	@Test
	void testAddDone() throws Exception{
		mockMvc.perform(get("/flower/addDone"))
			.andExpect(status().isOk())
			.andExpect(view().name("flowers/addDone"));
	}

	
}
