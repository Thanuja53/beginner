import java.util.com
class revint
{
 public static void main(String s[])
 {
  int n=Integer.parseInt(s[0]);
  int temp=0,t=0;
  while(n>0)
  {
   temp=n%10;
   t=10*t+temp;
   n=n/10;
  }
  System.out.println(t);
 }
}
