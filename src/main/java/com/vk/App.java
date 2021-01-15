package com.vk;

import com.vk1.Human;

public class App extends Human{
	
	public static void main(String[] args)
	{
	App obj=new App();
	obj.setName("MgThet Ko Hein");
	obj.setAge(19);
	obj.setHeight(6.2);
	
	System.out.println(obj.getName());
	System.out.println(obj.getAge()+" yrs old");
	System.out.println(obj.getHeight()+" inches");
	
	}
	}
	