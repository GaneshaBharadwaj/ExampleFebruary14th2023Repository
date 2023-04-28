package com.sgtesting.tests;

public class ExecuteAutoITScript {

	public static void main(String[] args) {
		executeScript();

	}
	
	private static void executeScript()
	{
		try
		{
		//	Runtime o=new Runtime();
			Runtime runtime=Runtime.getRuntime();
			runtime.exec("E:\\ExampleAutomation\\AutoIT\\WriteContentAndSaveFile.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
