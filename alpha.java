import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Hello
{
public static void main(String args[])
{
char ch;
Scanner s = new Scanner(System.in);
System.out.println("Enter the Characters :");
ch = s.next().charAt(0);
if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
{
	System.out.println("Entered char "+ch+" is Alphabet");
}
else
{
	System.out.println("Entered char "+ch+" is NotAlphabet");
}
}
}
