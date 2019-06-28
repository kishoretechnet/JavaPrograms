package datainput;
import java.io.*;
public class sample {
	String name;
	int m1,m2,m3,tot;
    float avg;
    DataInputStream a=new DataInputStream(System.in);
    void getdata()throws IOException
    {
    	System.out.println("ENTER UR NAME:");
    	String name=a.readLine();
    	System.out.println("ENTER 3 MARKS:");
    	m1=Integer.parseInt(a.readLine());
    	m2=Integer.parseInt(a.readLine());
    	m3=Integer.parseInt(a.readLine());
    	tot=m1+m2+m3;
    	avg=tot/3;
    } 
    
    
    void putdata()
    {
    	System.out.println(" NAME:"+name);
    	System.out.println(" MARKS:\t"+m1+m2+m3);
    	System.out.println("TOTAL:"+tot);
    	System.out.println("AVERAGE:"+avg);
    	
    }
	public static void main(String[] args) throws IOException
	{
		sample ki=new sample();
		ki.getdata();
		ki.putdata();// TODO Auto-generated method stub

	}

}
