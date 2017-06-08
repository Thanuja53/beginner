import java.util.*;
class happy1
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,sum=0;
        while(n>0)
        {
            k=n%10;
            sum=sum+(a*a);
            n=n/10;
            if(sum==1&&n==0)
            {
                System.out.println("True");
                break;
            }
            if(sum!=1&&n==0)
            {
                n=sum;
                sum=0;
            }
        }
    }
}

