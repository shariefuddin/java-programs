import java.util.*;
class Min{
    public static void main (String args[]){
        int i,n;
        System.out.println("enter size of an array");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
         System.out.println("enter elements of an array");
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
          int min=a[0];
         for(i=0;i<a.length;i++)
         {
             if(min>a[i])
             {
                 min=a[i];
                  
             }
              
         }
                      System.out.println("tha min element is " +min);

        
    }
}