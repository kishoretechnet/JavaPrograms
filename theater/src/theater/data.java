package theater;

import java.util.*;
public class data
{
	int i,j,k,ticket,price;
	int ticketno[]=new int[10];
	String name,mailid;
	int amount=150;
	Scanner a=new Scanner(System.in);
    void header() 
	{
    	System.out.println("\t WELCOME TO GRAND CINEMA'S");
		System.out.println("ENTER YOUR NAME:");
		name=a.next();
		System.out.println("ENTER YOUR EMAIL ID:");
	    mailid=a.next();
	}
}
	class ticketinfo extends data 
	{
		void ticketdata() 		
		{
			System.out.println("CUSTOMER NAME:"+name);
            System.out.println("CUSTOMER EMAIL ID:"+mailid);
            System.out.println("ENTER NUMBER OF TICKETS:");
			ticket=a.nextInt();
		for(j=0;j<ticket;j++)
		{
		System.out.println("ENTER TICKET NUMBERS:");
		ticketno[j]=a.nextInt();
		}
		price=ticket*amount;
		System.out.println("PRICE OF TICKET:"+price);
		}
	}
	
	 class foodinfo extends data
	 {
		 int burger,coke,fries,rburger,rcoke,rfries;
		 void amount()
		 {
			 System.out.println("CUSTOMER NAME:"+name);
	         System.out.println("CUSTOMER EMAIL ID:"+mailid);
			 System.out.println("\t FOOD DETAILS");
			 System.out.println("CUSTOMER NAME:"+name);
	         System.out.println("CUSTOMER EMAIL ID:"+mailid);
	         System.out.println("BURGER NEEDED:");
	         burger=a.nextInt();
	         System.out.println("COKE NEEDED:");
	         coke=a.nextInt();
	         System.out.println("FRIES NEEDED:");
	         fries=a.nextInt();
	         rburger=burger*100;
	         rcoke=coke*50;
	         rfries=fries*100;
	         price=rburger+rcoke+rfries;
	         System.out.println("FOOD AMOUNT:"+price);
		 }
	 }
	 class parkinginfo extends data
	 {
		 int bike,car,pbike,pcar;
		 void parkingamount()
		 {
			 System.out.println("CUSTOMER NAME:"+name);
	         System.out.println("CUSTOMER EMAIL ID:"+mailid);
	         System.out.println("\t PARKING INFO");
			 System.out.println("NO OF BIKES:");
			 bike=a.nextInt();
			 pbike=bike*20;
			 System.out.println("NO OF CARS:");
			 car=a.nextInt();
			 pcar=car*50;
			 price=pbike+pcar;
			 System.out.println("PARKING COST:"+price);
	}
	 }
	 class theater
	 {
	 
public static void main(String[] args)throws Exception
	{
		data value1=new data();
		ticketinfo value2=new ticketinfo();
		foodinfo value3=new foodinfo();
		parkinginfo value4=new parkinginfo();
		value1.header();
		value2.ticketdata();
		value3.amount();
		value4.parkingamount();
	}
}