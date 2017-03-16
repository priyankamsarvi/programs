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
public class CallByValue {
   
	public void inc(int val)
	{
	val++;
	System.out.println("Value of val(Formal Parameter) in Method:"+val);
	}

	public static void main(String arg[])
	{

	CallByValue ob1=new CallByValue();
	
	int var1;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value:");
	var1=scan.nextInt();
	ob1.inc(var1);

	System.out.println("Value of var1(Actual Parameter) in Main:"+var1);	

	}
}
 
    

