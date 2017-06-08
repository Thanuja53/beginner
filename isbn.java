import java.util.*;
class isbn
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String b[]=a.split("");
    int l=a.length();
    int g[]=new int[l];
    int sum=0;
    for(int i=0;i<l;i++)
      g[i]=Integer.valueOf(b[i]);
    for(int j=0;j<l;j++)
    {
      sum=sum+g[i]*l;
      --l;
    }
       if(sum%11==0)
           System.out.println("isbn number");
       else
           System.out.println("not a isbn number");
 }
}
