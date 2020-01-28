package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {

	
	@BeforeTest
	public void setup()
	{
		System.out.println("This is the setup for the code for Day3");
	}
	
	@Test
	public void test1Setup()
	{
		System.out.println("This is the method for test1Setup");
	}
	
	@Test
	public void test2Setup()
	{
		System.out.println("This is the method for test2Setup");
	}
	
	@Test
	public void test3Setup()
	{
		System.out.println("This is the method for test3Setup");
	}
	
	@Test
	public void test4Setup()
	{
		System.out.println("This is the method for test4Setup");
	}
	
}
