import java.util.Scanner;

class Divisible511{
    public static void main(String args[]){
        int num;
        System.out.println("enter number");
        Scanner sc = new Scanner (System.in);
        num=sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("given number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("given number is not divisible by 5 and 11");
        }
    }
}
       