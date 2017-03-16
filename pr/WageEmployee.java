/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.pr;

/**
 *
 * @author Priyanka
 */
public class WageEmployee extends Employee {
   
	int wage;

	public WageEmployee()
	{
	System.out.println("Sub Class Constructor");
	wage=2000;
	}

	public void show()
	{
	System.out.println("Wage:"+wage);
	}

	public static void main(String arg[])
	{
	WageEmployee obj1=new WageEmployee();
	
	obj1.display();
	obj1.show();
	}
}
    
