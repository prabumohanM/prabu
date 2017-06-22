import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Hello
{
public static void main(String args[])
{
int num=0;
	   int reverse=0;
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the number:");
	   num=s.nextInt();
	   while(num!=0)
	   {
		   reverse=reverse*10;
		   reverse=reverse+num%10;
		   num=num/10;
	   }
	   System.out.println("The given input number reverse is:"+reverse);
}
}
