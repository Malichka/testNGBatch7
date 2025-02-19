package com.syntax.class01;

import org.testng.annotations.Test;

public class TestNgIntro {

	@Test //test is a main annotation that identifies how many tests we will be running
	public void testOne() {
		System.out.println("I am test 1");
	}
	
	@Test //we use this annotation to mark a method as a test method
	public void testTwo() {
		System.out.println("I am test 2");
	}
	
	@Test
	public void testThree() {
		System.out.println("I am test 3");
	}
	
	@Test
	public void testFour() {
        System.out.println("I am test 4");
        
	} 
	//all test methods will get executed in alphabetical order
}
