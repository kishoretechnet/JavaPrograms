package area;

import java.io.DataInputStream;

public class volume {
	int l,b;
void rectangle()throws Exception
{
	DataInputStream a=new DataInputStream(System.in);
	System.out.println("value of length and breadth:");
	l=Integer.parseInt(a.readLine());
	b=Integer.parseInt(a.readLine());
	int rec=l*b;
	System.out.println(rec);
	
}
	public static void main(String[] args)throws Exception {
		volume ans=new volume();
		ans.rectangle();

	}

}
