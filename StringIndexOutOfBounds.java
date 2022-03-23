import java.util.Scanner;
class StringIndexOutOfBounds
{
     public static void main(String args[]){
    String s ="HARITHA";
    System.out.println("length f string is  :"+s.length());
    try
    {
        System.out.println(s.charAt(5));
    }
    catch(Exception e)
    {
        System.out.println("exception raised content must be in try block");

    }
        System.out.println("hi Sharief ");

}
}