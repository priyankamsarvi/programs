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
public class OddEven {
    public static void main(String[] args) {
		
		int num1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		num1=scan.nextInt();
		switch(num1%2)
		{
			case 0:
				System.out.println("Odd Number");
			break;
			case 1:
				System.out.println("Even Number");
			break;
		}
	}

    
}
