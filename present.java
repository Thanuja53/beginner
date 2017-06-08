import java.util.*;
class present
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
int N=sc.nextInt();
String s2[]=s1.split("");
int a[]=new int[4];
int b=0;
for(int i=0;i<4;i++)
{
a[i]=Integer.valueOf(s2[i]);
if(a[i]==N)
 b++;
}
if(b!=0)
 System.out.println("true");
else
 System.out.println("false");
}
}
