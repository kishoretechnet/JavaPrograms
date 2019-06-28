package collegeprgs;

public class complex {
	float real,img;
	complex()
	{
	}
	complex(float r,float i)
	{
		real=r;
		img=i;
	}
	void display()
	{
		System.out.println(real+"+i"+img);
	}
	complex add(complex c2)
	{
		complex res=new complex();
		res.real=real+c2.real;
		res.img=img+c2.img;
		return res;
	}
	complex sub(complex c2)
	{
		complex res=new complex();
		res.real=real-c2.real;
		res.img=img-c2.img;
		return res;
	}
	
	public static void main(String[] args) {
	complex c1=new complex(12.3f,6.3f);
	complex c2=new complex(8.3f,3.4f);
	System.out.println("c1 value is");
	c1.display();
	System.out.println("c2 value is");
	c2.display();
	complex c3=new complex();
	System.out.println("ADDITION VALUE IS:");
	c3=c1.add(c2);
	c3.display();
	System.out.println("SUBTRACTION VALUE IS:");
	c3=c1.sub(c2);
	c3.display();
		}

}
