package agoeden;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BaseFile {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   boolean again = true;
   while (again) {
     try {
       System.out.print("Enter time in 24-hour notation: ");
       String convertedTime = convertTime(input.next());
       System.out.println(String.format("That is the same as: %s", convertedTime));
       System.out.print("Again? (y/n): ");
       again = input.next().contains("y") ? true : false;
     } catch (TimeFormatException exception) {
       System.out.println(exception.getMessage());
               System.out.println("Try Again");
     }
   }
   input.close();
 }

 public static String convertTime(String timeString) throws TimeFormatException {
   try {
     String[] timeStringArray = timeString.split(":");
     ArrayList<Integer> times = new ArrayList<Integer>();
     for (String var : timeStringArray) {
       try {
         times.add(Integer.parseInt(var));
       } catch (NumberFormatException exception) {
         throw new TimeFormatException("Please enter a valid time format");
       }
     }
     if (times.size() < 2 || times.get(0) > 24 || times.get(0) < 0 || times.get(1) > 60 || times.get(1) < 0) {
       throw new TimeFormatException(String.format("There is no such time as: %s", timeString));
     }
     final SimpleDateFormat sdf = new SimpleDateFormat("H:mm");
     final Date dateObj = sdf.parse(timeString);
     return new SimpleDateFormat("h:mm a").format(dateObj);
   } catch (ParseException e) {
     throw new TimeFormatException(String.format("There is no such time as: %s", timeString));
   }

 }
}
