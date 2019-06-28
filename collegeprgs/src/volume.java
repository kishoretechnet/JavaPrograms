import java.io.DataInputStream;
import java.io.IOException;

public class volume {
	int l,b,rectangle;
	float pi=3.14f,r,h,cube;
	DataInputStream dis=new DataInputStream(System.in);
	void rectangle(int l,int b) throws NumberFormatException, IOException
	{
		System.out.print("ENTER L VALUE:");
		l=Integer.parseInt(dis.readLine());
		System.out.println("ENTER B VALUE:");
		b=Integer.parseInt(dis.readLine());
		rectangle=l*b;
		System.out.println("VALUE:"+rectangle);
			}
	void cube(float r,float h) throws NumberFormatException, IOException
	{
		System.out.println("ENTER R VALUE:");
		r=Integer.parseInt(dis.readLine());
		System.out.println("ENTER H VALUE:");
		h=Integer.parseInt(dis.readLine());
		cube=pi*r*r*h;
		System.out.print("VALUE:"+cube);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		int l=4,b=5;
		float r=9,h=4;
		volume k=new volume();
		k.rectangle(l,b);
		k.cube(r,h);
	}

}
