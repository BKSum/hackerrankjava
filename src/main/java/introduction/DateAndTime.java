package introduction;

import java.util.*;
import java.text.*;

public class DateAndTime {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        in.close();
                
        Calendar cal = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        dateFormat.setTimeZone(cal.getTimeZone());
        System.out.println(dateFormat.format(cal.getTime()).toUpperCase());
        
	}

}
