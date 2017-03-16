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
public class Adding {
   
    public static void main(String arg[]){
        int a,b,res;
       Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of a");
        a=scan.nextInt();
        System.out.println("enter the value of b");
        b=scan.nextInt();
        res=a+b;
         System.out.println(" the Result is:" +res);   
    }
}
