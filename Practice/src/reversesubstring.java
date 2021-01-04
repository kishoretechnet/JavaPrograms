import java.util.Scanner;
public class reversesubstring {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input1 = sc.nextLine();
    int input2 = sc.nextInt();
    int input3 = sc.nextInt();
    System.out.println(retrieveString(input1, input2, input3));
  }
  public static String retrieveString(String input1, int input2, int input3) {
    StringBuffer sb = new StringBuffer(input1);
    sb.reverse();
    String output = sb.substring(input2, input2 + input3);
    return output;
  }
}