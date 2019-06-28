package ifelsestatement;
import java.util.*;
public class sample {
	int n;
	Scanner f1=new Scanner(System.in);
	void get()
	{
	System.out.println("enter the value:");
	n=f1.nextInt();
     if(n>40) {
		System.out.println("passed in exam");
	}
	else
	{
		System.out.println("failed in exam");
	}
	}
	public static void main(String arg[])
	{
		sample a=new sample();
		a.get();
	}

}
