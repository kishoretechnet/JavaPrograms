import java.text.ParseException;
import java.util.*;

public class sumofstring {
  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    StringBuffer sb = new StringBuffer(s1);
    for (int i = 0; i < sb.length(); i++) {
      int count = 0;
      for (int j = i + 1; j < sb.length(); j++) {
        if (sb.charAt(i) == sb.charAt(j)) {
          sb.deleteCharAt(j);
          j--;
          count++;
        }
      }
      if (count >= 1) {
        sb.deleteCharAt(i);
        i--;
      }
    }
    System.out.println(sb.length());
  }
}