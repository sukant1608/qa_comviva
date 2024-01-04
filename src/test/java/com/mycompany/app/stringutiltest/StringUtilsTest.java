package com.mycompany.app.stringutiltest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import com.mycompany.app.stringfunctions.StringUtils;

public class StringUtilsTest {
	
	@BeforeAll
	public void setup()
	{
		System.out.println("Setup");
	}

	@Test
	public void test_reverse_string()
	{
		StringUtils stringUtils = new StringUtils();
		assertEquals(stringUtils.reverse("Sukant"), "tnakuS");
		
	}
	
	@Test
	public void test_palindrom()
	{
		StringUtils stringUtils = new StringUtils();
		assertEquals(stringUtils.isPalindrome("sukant"),stringUtils.isPalindrome("tnakus"));
	}
	
	@Test
	public void test_concatenate()
	{
		StringUtils stringUtils = new StringUtils();
		assertEquals(stringUtils.concatenate("first", "second"),"firstsecond");
	}
	
	@Test
	public void test_occurance()
	{
		StringUtils stringUtils = new StringUtils();
		assertEquals(stringUtils.countOccurrences("Sukant", 'a'), 1);
	}
}
