import java.util.*;
class Negitive{
    public static void main (String args[]){
        int i,n;
        System.out.println("enter size of an array");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
         System.out.println("enter elements of an array");
         for(i=0;i<a.length;i++)
         {
             a[i]=sc.nextInt();
         }
          for(i=0;i<a.length;i++)
          {
             if(a[i]<0)
             {
                 System.out.println("you enter negative elements " +a[i] );
             }
          }
                  
    }

}