import java.util.*;
class isbn
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
       String n=sc.nextLine();
       int l=n.length();
       int n2,i=0,sum=0;
       int[] a=new int[l];
       int n1=Integer.parseInt(n);
       while(n1!=0)
       {
           n2=n1%10;
           a[i]=n2;
           i++;
           n1=n1/10;
       }
       int j=0;
       for(i=1;i<l;i++)
       {
           sum=sum+a[j]*i;
           j++;
       }
       if(sum%11==0)
           System.out.println("it is ISBN");
       else
           System.out.println("not a ISBN NUMBER");
}
}
