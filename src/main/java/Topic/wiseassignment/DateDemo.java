/************************************************************************
TITLE:- Display current time in two different time zone
AUTHOR:- AJINKYA
DATE:-26/02/2018
*************************************************************************/
package Topic.wiseassignment;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateDemo {

	public void displayTime() throws ParseException 
	{
		String fromDateString = "Wed Jul 08 17:08:48 GMT 2009";
        DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        Date fromDate = (Date)formatter.parse(fromDateString);
        TimeZone central = TimeZone.getTimeZone("America/Chicago");
        formatter.setTimeZone(central);
        System.out.println(formatter.format(fromDate));	
	}

}
