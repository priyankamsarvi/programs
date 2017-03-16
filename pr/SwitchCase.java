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
public class SwitchCase {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
			String ch;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a Character");
			ch=scan.next();

			switch(ch)
			{
				case "A":
				case "a":
					System.out.println("Vowel");
				break;
				case "E":
					System.out.println("Vowel");
				break;
				case "I":
					System.out.println("Vowel");
				break;
				case "O":
					System.out.println("Vowel");
				break;
				case "U":
					System.out.println("Vowel");
				break;
				default:
					System.out.println("Consonant");
			}
	}
}
