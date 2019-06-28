package ifelseladder;

import java.util.Scanner;

public class sample {
int n;
Scanner f1=new Scanner(System.in);
void get()
{
	System.out.println("enter the value:");
	n=f1.nextInt();
	if(n>40)
	{if(n>60)
	{if(n>90)
	   System.out.println("distinction");
	
	else
	
		System.out.println("student is first class");
	
	}
	else
	{
		System.out.println("avg");
	}
	}
	else 
	{
		System.out.println("fail");
	}
	}
		

	public static void main(String[] args) {
sample a=new sample();
a.get();
	}

}
