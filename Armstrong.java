import java.util.*;
class Armstrong
{
    public static void main(String args[])
    
    {
        int n,s=0,d,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        t=n;
        for(int i=0;n>0;i++)
        {
            d=n%10;
            s=s+(d*d*d);
            n=n/10;
            
        }
        if(t==s)
        System.out.println("Its Armstrong Number");
        else
        System.out.println("Its Not a Armstrong Number");
        
    }
}