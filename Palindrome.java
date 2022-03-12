import java.util.*;
class Palindrome{
    public static void main (String args[]){
        int num,rev=0,digit,temp;
        
        System.out.println("enter number");
        Scanner sc = new Scanner (System.in);
        num=sc.nextInt();
        temp=num;
        while(num!=0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(rev==temp)
        {
        System.out.println("given number is palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}