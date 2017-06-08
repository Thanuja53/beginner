import java.util.*;
class frstlst
{
public static void main(String s[])
{
  Scanner sc=new Scanner(System.in);
  String n=sc.nextLine();
  int l=n.length();
  String s1[]=n.split("");
  int[] a=new int[l];
  int sum=0;
  for(int i=0;i<l;i++)
  {
      a[i]=Integer.valueOf(s1[i]);
  }
  sum=a[0]+a[l-1];
  System.out.println(sum);
}
}

