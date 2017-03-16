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
public class LeapYear {
    public static void main(String args[]){
		int year;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Year");
		year=scan.nextInt();

		if(year%100==0)
		{
			if(year%400==0)
				System.out.println("Leap Year");
			else
				System.out.println("Not a Leap Year");
		}
		else
		{
			if(year%4==0)
				System.out.println("Leap Year");
			else
				System.out.println("Not a Leap Year");
		}

		
		
		
		
		
		
}
}
