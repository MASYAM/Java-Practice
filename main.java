package core_practice;
import java.io.*;
import java.util.*;

public class main {

	
	main()
	{
		System.out.println("he he he");
	}
	
	public static void display()
	{
		System.out.println("hi hi hi");
	}
	
	public static void main(String x[])
	{
		new main().display();
		
		int aaa[] = new int[5];
		
		for(int i=0;i<aaa.length-1;i++)
		{
			  System.out.println("ha");
			  System.out.println(aaa);
		}
	
		
		
	}
	
	/*
	 String[][] buses = {
	            { "Green Line", "Desh Travels", "Hanif Enterprize" },//0
	            {"1","2","3","4","5","6","7","8","9","10"},//1
	         };

	    for (int i = 0; i < buses[0].length; i++) 
	    {
		       System.out.print(buses[0][i] + ": ");
		       
		       for (int j = 0; j < buses[1].length; j++) 
		       {
		            System.out.print(buses[1][j] + " ");
		       }
		       System.out.println();
	    }
	*/
	
	/*
	   public static void main(String args[])
	   {
	      // Call method with variable args  
		  printMax(34, 3, 3, 2, 56.5);
	      printMax(new double[]{1, 2, 3});
	   }

	   public static void printMax( double... numbers) 
	   {
		      if (numbers.length == 0) {
		        System.out.println("No argument passed");
		        return;
		      }
	   
		     double result = numbers[0];
	
		     for (int i = 1; i <  numbers.length; i++)
		      if (numbers[i] >  result)
		      result = numbers[i];
		      System.out.println("The max value is " + result);
	  }
	*/
	
}
