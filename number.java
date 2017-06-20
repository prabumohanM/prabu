import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Sample {
public static void main(String args[])
{
int Number = 0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the Numbers :");
Number = s.nextInt();
if(Number > 0)
{
	System.out.println("The user enter number is positive");
}
else if(Number < 0)
{
	System.out.println("The user enter number is negetive");
}
else
	System.out.println("The user enter number is Zero");
}
}
