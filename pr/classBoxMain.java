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
public class classBoxMain {

    private static int width;
    private static int height;
    private static int depth;

	public static void main(String arg[])
	{
         
	//creation of the object
	Box obj=new Box();
        Scanner s=new Scanner(System.in);
	//Initializing the object
        System.out.print("enter the width of box");
        obj.width=s.nextInt();
	System.out.print("enter the height of box");
        obj.height=s.nextInt();
	System.out.println("Enter the depth of box");
        obj.depth=s.nextInt();
       	double volume;
	volume=obj.width*obj.height*obj.depth;

	System.out.println("Volume of Box:"+volume);

	}


    
}
    

