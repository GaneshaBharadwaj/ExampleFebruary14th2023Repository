package com.sgtesting.users;

public class Users {
	
	
	@Test
	public void createUser()
	{
		System.out.println("The User demoUser1 has created successfully");
	}

	@Test
	public void modifyUser()
	{
		System.out.println("The User demoUser1 has modified successfully");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("The User demoUser1 has deleted successfully");
	}
	
	@BeforeClass
	public void setup()
	{
		System.out.println("Launch Browser, Navigate URL and Login into the Application");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout from the Application and Close the Application");
		System.out.println("+++++++++++++++++++++++++++");
	}
}
