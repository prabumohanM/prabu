import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Sample
{
public static void main(String args[])
{
{
char ch;
Scanner s = new Scanner(System.in);
System.out.println("Enter the Characters :");
ch = s.next().charAt(0);
if(ch == 'a'||ch == 'A'||ch == 'e'||ch == 'E'||ch == 'i'||ch == 'I'||ch == 'o'||ch == 'O'||ch == 'u'||ch == 'U')
{
	System.out.println("Entered char "+ch+" is Vowel");
	
}
else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
	System.out.println("Entered char "+ch+" is Consonent");
}
else
	System.out.println("Entered char is not consonent or vowel");
}
}
