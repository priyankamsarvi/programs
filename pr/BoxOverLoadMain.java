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
public class BoxOverLoadMain {
    
	public static void main(String arg[])
	{
	BoxOverLoad ob1=new BoxOverLoad();
	BoxOverLoad ob2=new BoxOverLoad(10);
	BoxOverLoad ob3=new BoxOverLoad(10,11,12);

	System.out.println("Volume of Default Box:"+ob1.volume());
	System.out.println("Volume of Square Box:"+ob2.volume());
	System.out.println("Volume of UserDefined Box:"+ob3.volume());

	}
}

