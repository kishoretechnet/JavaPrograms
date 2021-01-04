import java.util.Scanner;

public class ebbill {

	public static void main(String[] args) {
		int amount,reading,prereading,curreading;
		Scanner s=new Scanner(System.in);
		prereading=s.nextInt();
		curreading=s.nextInt();
		reading=prereading-curreading;
		amount=reading*4;
		System.out.println(reading);
		System.out.println(amount);
		

	}

}
