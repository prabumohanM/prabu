
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class Hello
{
public static void main(String args[])
{
String time1 = "02:10:00";
String time2 = "02:15:00";

SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
Date date1 = format.parse(time1);
Date date2 = format.parse(time2);
long difference = date2.getTime() - date1.getTime(); 
long diff = d2.getTime() - d1.getTime();

long diffSeconds = diff / 1000 % 60;
long diffMinutes = diff / (60 * 1000) % 60;
long diffHours = diff / (60 * 60 * 1000) % 24;
long diffDays = diff / (24 * 60 * 60 * 1000);

System.out.print(diffDays + " days, ");
System.out.print(diffHours + " hours, ");
System.out.print(diffMinutes + " minutes, ");
System.out.print(diffSeconds + " seconds.");
}
}
