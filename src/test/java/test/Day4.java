package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {

	
	@BeforeTest
	public void setup()
	{
		System.out.println("This is the setup for the code for Day4");
	}
	
	@Test
	public void test1Default()
	{
		System.out.println("This is the method for test1Default");
	}
	
	@Test
	public void Mobiletest2Default()
	{
		System.out.println("This is the method for Mobiletest2Default");
	}
	
	@Test
	public void Mobiletest3Default()
	{
		System.out.println("This is the method for Mobiletest3Default");
	}
	
	@Test
	public void test4Default()
	{
		System.out.println("This is the method for test4Default");
	}
	
}
