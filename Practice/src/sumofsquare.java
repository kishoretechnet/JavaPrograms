import java.util.*;
 
public class sumofsquare {
 
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	getvalues(n);
}
 
public static void getvalues(int n) 
{
	int a = n;
	int rem = 0;
	int sum = 0;
	while (a != 0) 
	{
		rem = a % 10;
		sum = sum + (rem * rem);
		a = a / 10;
	}
System.out.println(sum);
}
}