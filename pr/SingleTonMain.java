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
public class SingleTonMain {
    public static void main(String arg[])
	{
	SingleTon obj=SingleTon.getInstance();

	obj.display();
	}
}
	//class scope member
	
    

