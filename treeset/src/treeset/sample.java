package treeset;

import java.util.*;

public class sample {
TreeSet<String> list1=new TreeSet<>();
void input()
{
	list1.add("a");
	list1.add("b");
	list1.add("c");
	Iterator<String> h=list1.iterator();
	while(h.hasNext())
	{
		System.out.println("List value is:"+h.next());
	}
	System.out.println("Size of list:"+list1.size());
	System.out.println("Remove a list:"+list1.remove("a"));
	System.out.println("Size of list:"+list1.size());
	System.out.println("Containing of list:"+list1.contains("a"));
	
}
	public static void main(String[] args)
	{
		sample dis=new sample();
		dis.input();
	}

}
