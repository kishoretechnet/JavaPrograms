import java.io.*;
public class copybytes
{
	public static void main(String arg[])throws Exception
	{
	FileInputStream in =null;
	FileOutputStream out =null;
	try
	{
		in=new FileInputStream("xanadu.txt");
		out=new FileOutputStream("outagain.txt");
		int c;
		while((c=in.read())!=-1)
		{
			out.write(c);
		}
	}
	finally
	{
		if(in!=null)
		{
			in.close();
		}
		if(out!=null)
		{
			out.close();
		}
	}
	}
}
