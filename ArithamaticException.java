import java.util.*;
class ArithamaticException 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  value");
        int a = sc.nextInt();
        System.out.println("enter b value");
        int b = sc.nextInt();
        try 
        {
            double c=(a/b);
            System.out.println(c);
            
        } 
        catch(Exception e) 
        {
            System.out.println("exception raised content must be in try block");
        }
        
        System.out.println("hi Sharief ");
        

    }
}