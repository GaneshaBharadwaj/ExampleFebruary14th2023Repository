package com.sgtesting.Reflection;

import java.lang.reflect.Method;

public class Case1 {

	public static void main(String[] args) {
		Sampledemo obj=new Sampledemo();
		
		try
		{
			Method a[]=obj.getClass().getDeclaredMethods();
			for(int i=0;i<a.length;i++)
				
			{
				String b=a[i].getName();
				System.out.println(b);
				a[i].invoke(obj);
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
