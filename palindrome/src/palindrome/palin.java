package palindrome;


import java.util.*;

public class palin {

	public static void mains(String[] args) {
		String msg=Arrays.toString(args).replaceAll("\\[","").replaceAll("//]","");
		msg=msg.replaceAll("[A-Za-z]", "").toLowerCase();
		String rer=new StringBuilder(msg).reverse().toString();
		if(msg.equals(rer))
		{
			System.out.println("not palindrome");
		}
		else
		{
			System.out.println(" palindrome");
		}
		
	}
		
}
