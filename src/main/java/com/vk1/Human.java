package com.vk1;

public class Human {
	 private String name;
	 private int age;
     private double height;
     
     protected void setName(String name)
     {
    	 this.name=name;	 
     }
     protected String getName()
     {
    	 return name;
     }
     
     public void setAge(int a)
     {
    	 this.age=a;
     }
     public int getAge()
     {
    	 return age;
     }
     public void setHeight(double h)
     {
    	 height=h;
     }
     public double getHeight()
     {
    	 return height;
     }
}
