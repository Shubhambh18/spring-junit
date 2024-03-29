package com.example.demo.test;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.config.AppConfig;
import com.example.demo.controller.WelcomeController;
import com.example.demo.service.LoanEligibility;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TestWelcomeController {

	private MockMvc mock;
	
	@Autowired
	private WelcomeController controller;
	
//	@Mock
//	private LoanEligibility service;
	
	@Before
	public void setup() throws Exception {						//userdefined method
		this.mock = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void testGetMessage() throws Exception {
		this.mock.perform(get("/greet")).andExpect(status().isOk()).andExpect(content().string("testing"));
	}
	
	@Test
	public void testGetEligibility() throws Exception{
		//when(service.checkEligibility(200000.00,"govt")).thenReturn(500000.0);
//		mock.perform(get("/check").param("yearlyIncome","220000").
//				param("employment", "govt")).
//		andExpect(content().string("700000.00"));
		mock.perform(get("/check/{yearlyIncome}/{employment}",200000.00,"govt")).
		andExpect(status().isOk()).
		andExpect(content().string("700000.0"));
	}
}