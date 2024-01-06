package com.mycompany.app.emailvalidationtest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

import com.mycompany.app.email.EmailValidator;

import junit.framework.Assert;

public class EmailValidationTest {
	
	@Test
	public void test_valid_email()
	{
		
		EmailValidator emailValidator = new EmailValidator();
		assertTrue(emailValidator.isValidEmail("abc@company.com"));
		
	}
	
	@Test
	public void test_valid_corporate_email()
	{
		
		EmailValidator emailValidator = new EmailValidator();
		assertTrue(emailValidator.isCorporateEmail("abc@company.com"));
		
	}
	
	@Test
	public void test_valid_email_and_corporate()
	{
		
		EmailValidator emailValidator = new EmailValidator();
		assertEquals(emailValidator.isValidEmail("abc@company.com"),emailValidator.isCorporateEmail("abc@company.com"));
		
	}
}
