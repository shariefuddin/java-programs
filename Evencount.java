import java.util.*;
class Evencount{
    public static void main (String args[]){
        int i,n,ecount=0,ocount=0;
        System.out.println("enter size of an array");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
         System.out.println("enter elements of an array");
         for(i=0;i<a.length;i++)
         {
             a[i]=sc.nextInt();
         }
         for(i=0;i<n;i++)
         {
             if(a[i]%2==0){
                 ecount=ecount+1;
             }
             else
             {
                 ocount=ocount+1;
             }
               
         }
         System.out.println("\nNumber of even elements in the array: "+ecount);
         System.out.println("\nNumber of odd elements in the array: "+ocount);
    }
}