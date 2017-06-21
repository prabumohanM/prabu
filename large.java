import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Hello
{
public static void main(String args[])
{
int N1,N2,N3;
Scanner s = new Scanner(System.in);
System.out.println("Enter the Number1 :");	
N1 = s.nextInt();	
System.out.println("Enter the Number2 :");	
N2 = s.nextInt();	
System.out.println("Enter the Number3 :");	
N3 = s.nextInt();	
if(N1 > N2 && N1 > N3)
{
	System.out.println("First Number is Largest");
}
else if( N2> N1 && N2 > N3)
{
		System.out.println("Second Number is Largest");
}
else if(N3>N1&&N3>N2)
{
		System.out.println("Third Number is Largest");

}
else
{
		System.out.println("These numbers are Distinct");
}	
	
}
}

