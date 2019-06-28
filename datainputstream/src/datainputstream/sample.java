package datainputstream;

import java.io.*;

public class sample {
int pid;
float f1;
String name;
DataInputStream dis=new DataInputStream(System.in);
void get1() throws IOException
{
	System.out.println("enter the value:");
	pid=Integer.parseInt(dis.readLine());
	System.out.println("enter the value:");
	f1=Float.parseFloat(dis.readLine());
	System.out.println("enter the name:");
	name=dis.readLine();
	
}
public static void main(String[] args) throws IOException{
sample a=new sample();
a.get1();
	}

}
