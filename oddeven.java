import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Sample
{
public static void main(String args[])
{
int Number;
Scanner s = new Scanner(System.in);
System.out.println("Enter the Numbers :");	
Number = s.nextInt();
if( Number%2 == 0)
{
    System.out.println("This number is even");
}
else
    {
        System.out.println("This number is odd");
    }
}
}
