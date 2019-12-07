/**
  Generate millisecodns for current time. 
  Then got back 10 days
  
  Your task is using Java to find:
    Year,
    Month,
    Day,
    DayOfTheWeek,
    Hour,
    Minutes,
    Seconds,

    System.out.print(" %s %s %d, %d %d:%d:%d ",  DAYS[ dayofweek - 1 ], MONTHS [month], day, year, hour + 16 , minute, second );
 */

import java.util.Date;
import java.util.Calendar;

class MyDate {
  public static void main (String[] args){
    final String[] DAYS = {
      "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };

    
    final String[] MONTHS = {
      "January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December",
    };
    Calendar kalendar = Calendar.getInstance();

    Date ruz = new Date();
    long millisecToday = ruz.getTime();

    long millisecTendays = 10 * 24 * 60 * 60 * 1000;

    long dahruzkafo = millisecToday - millisecTendays;


    kalendar.setTimeInMillis(dahruzkafo);

    int year = kalendar.get(Calendar.YEAR);
    int month = kalendar.get(Calendar.MONTH);
    int day = kalendar.get(Calendar.DATE);
    int dayofweek = kalendar.get(Calendar.DAY_OF_WEEK);
    int hour = kalendar.get(Calendar.HOUR);
    int minute = kalendar.get(Calendar.MINUTE);
    int second = kalendar.get(Calendar.SECOND);

    System.out.printf(" %s %s %d, %d %d:%d:%d ",  DAYS[ dayofweek - 1 ], MONTHS [month], day, year, hour, minute, second );







    System.out.println(year);

  }
}

