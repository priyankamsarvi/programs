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
public class ConDemo {
    
	private final String name;
     
    public ConDemo(String str){
        this.name = str;
        System.out.println("I am inside parameterized constructor.");
        System.out.println("The parameter value is: "+str);
    }
     
    public static void main(String a[]){
       ConDemo mpc = new ConDemo("priya sarvi");
    }
}
