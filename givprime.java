import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Hello
{
public static void main(String args[])
{
int num =1,b,c,range;
                 Scanner s=new Scanner(System.in);
                 System.out.println("Enter The Range \n");
                 range=s.nextInt();
                 while(num <=range)
                       {
                           b=1;
                           c=0;
                           while(b<= num)
                                {
                                  if((num%b)==0)
                                    c=c+1;
                                    b++;
                                }
                                   if(c==2)
                      System.out.println(num +" is a prime number");
                                    num ++;
                        }
             }
}
