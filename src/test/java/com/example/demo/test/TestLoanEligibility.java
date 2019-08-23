package com.example.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.config.AppConfig;
import com.example.demo.service.LoanEligibility;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TestLoanEligibility {

	@Autowired
	private LoanEligibility service;
	
	@Test
	public void testEligibilityForBusiness() {
		double actual = service.checkEligibility(200000, "business");
		double expected = 500000.00;
		
		assertEquals(expected, actual,0);
		
		
	}
	
	@Test
	public void testEligibilityForGovt() {
		double actual2 = service.checkEligibility(200000, "govt");
		double expected2 = 700000.00;
		
		assertEquals(expected2, actual2,0);
	}
	
}
