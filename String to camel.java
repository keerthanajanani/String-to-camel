# String-to-camel
import java.io.*;
import java.util.*;
public class String to camel
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the sentence:");
String s1=br.readLine():
String result="";
char ch1=s1.charAt(0);
result=result+Character.toUppearCase(ch1);
for(int i=1;i<s1.length();i++)
{
char ch2=s1.charAt(1);
char ch3=s1.charAt(i-1);
if(ch3==' ')
{
result=result+Character.toUppearCase(ch2);
}
}
System.out.println(result);
}
}
