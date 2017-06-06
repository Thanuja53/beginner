import java.util.*;
class fac
{
 public static void main(String s[])
 {
  int n=Integer.parseInt(s[0]);
  int fact=1;
  for(int i=1;i<=n;i++)
  {
   fact=fact*i;
  }
  System.out.println(fact);
 }
} 
