/*import java.util.Scanner;
class Frequency
{
    public static void main(String args[])
    {
        int i,j,n,count=0;
        System.out.println("enter size of an aray");
        Scanner sc =new Scanner (System.in);
        n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter elements of a array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter element find frequency");
        j=sc.nextInt();
        for(i=0;i<n;i++)
        {
        if(a[i]==j)
        {
            count=count+1;
              
            
        }
        System.out.println("the frequency of element is :"+count);
      
        }
        if(count==0)
        {
                    System.out.println("the entered element not found");

        }
        
    }
}*/
import java.util.*;
class freq{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array:");
        int n,count=0,num;
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements of an array:");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter element to find freq");
        num=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==num){
                count=count+1;
            }
        }
                System.out.println("FReq:"+count);

        if(count==0){
            System.out.println("Element not found");
        }
    }
}