import java.util.Scanner;
class Swapping

{
    public static void main(String args[])
    {
        int i,j,n,temp;
        System.out.println("enter the size of an array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
         System.out.println("enter the elements of an array");
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("the swapping element are :" );
        for(i=0;i<n;i++)
        {
           for(j=i+1;j<n;j++)
           {
               if(a[i]>a[j])
               {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
            System.out.println( +a[i]);
        }
       
    }
}