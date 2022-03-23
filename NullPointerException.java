import java.util.*;
class NullPointerException
{
    public static void main (String args[])
    {
        String s=null;
     
        try 
        {
            System.out.println(s.length());
        } 
        catch(Exception e) 
        {
            System.out.println("exception raised content must be in try block");
        }
        System.out.println("hi Sharief ");


    }
}