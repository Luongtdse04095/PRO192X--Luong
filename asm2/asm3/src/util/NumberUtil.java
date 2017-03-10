package util;

public class NumberUtil {
	 public static boolean checkInteger(String str) {
		    try {
		      Integer.parseInt(str);
		    } catch (Exception exp) {
		      return false;
		    }

		    return true; //fast return
		  }  
}
