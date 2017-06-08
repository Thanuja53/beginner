import java.util.*;
class oddsum
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String ss[s.length()]=s.split("");
int[] a=new int[s.length()];
for(int i=0;i<a.length;i++)
{
a[i]=Integer.valueOf(ss[i]);
if(a[i]%2!=0)
{

