import java.text.*;
import java.util.Date;

public class dateformat{
   public static boolean validateJavaDate(String strDate)
   	{
	/* Check if date is 'null' */
	   if (strDate.equals(""))
	   		{
		   		return true;
	   		}
	/* Date is not 'null' */
	   else
	   		{
	    /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
		   		SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
		   		sdfrmt.setLenient(false);
	    /* Create Date object
	     * parse the string into date 
             */
	    try
	    	{
	        	Date javaDate = sdfrmt.parse(strDate); 
	        	System.out.println(strDate+" 1");
	    	}
	    /* Date format is invalid */
	    catch (ParseException e)
	    	{
	        	System.out.println(strDate+" -1");
	        	return false;
	    	}
	    /* Return true if date format is valid */
	    return true;
	}
   }
   public static void main(String args[]){
	validateJavaDate("12/29/2016");
	validateJavaDate("12-29-2016");
	validateJavaDate("12,29,2016");
   }
}