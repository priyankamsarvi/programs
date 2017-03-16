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
public class SingleTon 
{
private static final SingleTon obj=new SingleTon();

	private SingleTon()
	{
	}

	public static SingleTon getInstance()
	{
	return obj;
	}

	public void display()
	{
	System.out.println("Hello from Display Method");
	}

}

    

