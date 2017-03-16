/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.pr;
import java.util.Scanner;

/**
 *
 * @author Priyanka
 */
public class CallByRef {
   int member;

	public void inc(CallByRef p1)
	{
	p1.member++;
	System.out.println("Value of (Formal Parameter) in Method:"+p1.member);
	}

	public static void main(String arg[])
	{

	CallByRef ob1=new CallByRef();
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value:");
	ob1.member=scan.nextInt();

	ob1.inc(ob1);

	System.out.println("Value of (Actual Parameter) in Main:"+ob1.member);	

	}
} 
