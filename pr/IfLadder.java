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
public class IfLadder {
    public static void main(String[] args){
		int var1,var2,var3;

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the First Value:");
		var1=scan.nextInt();
		System.out.println("Enter the Second Value:");
		var2=scan.nextInt();
		System.out.println("Enter the Third Value:");
		var3=scan.nextInt();

		if(var1>var2 && var1>var3)
		{
			System.out.println("First Number is Biggest");
		}
		else if(var2>var3)
		{
			System.out.println("Second Number is Biggest");
		}	
		else
		{
			System.out.println("Third Number is Biggest");
		}
		
		}
	}
	
	
    

