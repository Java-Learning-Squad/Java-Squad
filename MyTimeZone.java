import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.Calendar;

class MyTimeZone {
  public static void main (String[] args){
    final String[] DAYS = {
      "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };

    
    final String[] MONTHS = {
      "January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December",
      
    };

    final String [] Cities = { "Australia", "Tajikistan", "Russia"};

 
    
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the name of the city ");

    String rendomcity = sc.nextLine();


    Calendar kalendar = Calendar.getInstance();

    Date ruz = new Date();
    long millisecToday = ruz.getTime();

    long millisecTendays = 10 * 24 * 60 * 60 * 1000;

    long dahruzkafo = millisecToday;


    kalendar.setTimeInMillis(dahruzkafo);
    TimeZone myTimeZone = TimeZone.getDefault();
    
    switch (rendomcity){
      case "Australia": 
        myTimeZone = TimeZone.getTimeZone("Australia/Sydney");
        break;

      case "Tajikistan":
        myTimeZone = TimeZone.getTimeZone("Asia/Dushanbe");
        break;

      case "Russia":
        myTimeZone = TimeZone.getTimeZone("Europe/Moscow");
        break;        
    }

    kalendar.setTimeZone(myTimeZone);

    int year = kalendar.get(Calendar.YEAR);
    int month = kalendar.get(Calendar.MONTH);
    int day = kalendar.get(Calendar.DATE);
    int dayofweek = kalendar.get(Calendar.DAY_OF_WEEK);
    int hour = kalendar.get(Calendar.HOUR);
    int minute = kalendar.get(Calendar.MINUTE);
    int second = kalendar.get(Calendar.SECOND);
    System.out.printf(" %s %s %d, %d %d:%d:%d ",  DAYS[ dayofweek - 1 ], MONTHS [month], day, year, hour, minute, second );

    sc.close();

  }
}