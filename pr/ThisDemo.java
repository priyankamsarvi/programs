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
public class ThisDemo {
    int myvar;
	public ThisDemo(int myvar)
	{
	this.myvar=myvar;
	}
	public void displayMyVar()
	{
	System.out.println("Value :"+myvar);
	}
	public static void main(String arg[])
	{
	ThisDemo obj1=new ThisDemo(10);
	obj1.displayMyVar();
	}
}

    
