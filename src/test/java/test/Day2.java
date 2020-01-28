package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@BeforeTest
	public void setup()
	{
		System.out.println("This is the setup for the code for Day2");
	}
	
	
	@Test
	public void test1Home()
	{
		System.out.println("This is the method for test1Home");
	}
	
	@Test
	public void test2Home()
	{
		System.out.println("This is the method for test2Home");
	}
	
	@Test
	public void test3Home()
	{
		System.out.println("This is the method for test3Home");
	}
	
	@Test
	public void test4Home()
	{
		System.out.println("This is the method for test4Home");
	}
	
}
