package scanner;

import java.util.Scanner;

public class sample {
int a;
Scanner f1=new Scanner(System.in);
void input()
{
	System.out.println("enter the no:");
	a=f1.nextInt();
}
void calc()
{
	if(a%2==0)
	{
		System.out.println("Even"+a);
	}
	else
	{
		System.out.println("odd"+a);
		
	}
}
	public static void main(String[] args) {
	sample g=new sample();
	g.input();
	g.calc();

	}

}
