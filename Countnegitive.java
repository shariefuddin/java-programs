import java.util.*;
class Countnegitive{
    public static void main (String args[]){
        int i,count=0;
        System.out.println("enter size of an array");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
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
             count=count+1;
         }
          
         }
         System.out.println("you total negative elements  are " +count);
    }
}