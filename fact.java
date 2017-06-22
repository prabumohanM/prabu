import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Hello
{
public static void main(String args[])
{
 int i,n;
int fact=1;
Scanner s = new Scanner(System.in);
System.out.println("Enter a numberto find factorial :");
 n = s.nextInt();
 for(i=1;i<=n;i++)
 {
	 fact=fact*i;
 }
	   System.out.println("The factorial of given number "+n+" is:"+fact);
}
}
