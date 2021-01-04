import java.text.*;
import java.util.*;
public class dateformat1
{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  String s1 = sc.nextLine();
  int n = getvalues(s1);
  
  if(n==1)
  {
    System.out.println("Valid date format");
  }
  else
  {
    System.out.println("Invalid date format");
  }
  
}
public static int getvalues(String s1)
{
if(s1.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(s1);
return 1;
}
catch (ParseException e) 
{
return -1;
}
}
else
  return -1;
}}