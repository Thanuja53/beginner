import java.util.*;
class oddsum
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int sum=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(a[i]%2!=0)
sum=sum+a[i];
}  
System.out.println(sum);
}
}  

