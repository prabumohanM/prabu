import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Hello
{
public static void main(String args[])
{
	int i,n;
	int count = 0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Number :");	
	i = s.nextInt();	
	do
	{
		 i=i/10;
		 count++;
	}while(i>0)
	System.out.println(count);
}
}
