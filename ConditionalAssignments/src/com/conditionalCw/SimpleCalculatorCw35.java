package com.conditionalCw;
import java.util.Scanner;

public class SimpleCalculatorCw35 {
	
	public static void main(String args[]){
		
		
		
		Scanner sc =new Scanner(System.in);
		while(true){
		
	    
		
		int a,b,c,choice;
		System.out.println("write a choice to perform the operation");
		System.out.println("1:Addition 2:subtract 3:multiply 4:divide 5:exit");
		choice=sc.nextInt();
		
		
		if(choice==5)
		{
			break;
		}
		System.out.println("enter a two number for the mathematical operatioon");
	    
		a=sc.nextInt();
		b=sc.nextInt();
		switch(choice)
		{ 
		  case 1:
		    
		  c=a+b;
		  System.out.println("Addition= "+c);
		  break;
		  
		  case 2:
		   c=a-b;
		   System.out.println("subtraction= "+c);
		   break;
		   
		  case 3:
		   c=a*b;
		   System.out.println("multiply= "+c);
		   break;
		   
		  case 4:
		  c=a/b;
		  System.out.println("division= "+c);
		  
		  default:
	      System.out.println("you enter a invalid choice");
	      	  
		}
		}
	
	}

}
