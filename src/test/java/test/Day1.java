package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	
	@BeforeTest
	public void setup()
	{
		System.out.println("This is the setup for the code for Day1");
	}
	
	@Test
	public void test1Login()
	{
		System.out.println("This is the method for test1Login");
	}
	
	@Test
	public void test2Login()
	{
		System.out.println("This is the method for test2Login");
	}
	
	@Test
	public void test3Login()
	{
		System.out.println("This is the method for test3Login");
	}
	
	@Test
	public void test4Login()
	{
		System.out.println("This is the method for test4Login");
	}
	
}
