import java.util.*;
class Revers{
    public static void main (String args[]){
        int num,rev=0,digit;
        System.out.println("enter number");
        Scanner sc = new Scanner (System.in);
        num=sc.nextInt();
        while(num!=0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println(+rev);
    }
}