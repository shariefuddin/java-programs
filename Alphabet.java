import java.util.Scanner;
class Alphabet{
    public static void main(String args[]){
        char ch;
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
        {
            System.out.println( "it is a character ");
        }
        else
        {
             System.out.println(" wrong input,please enter charecter");
        }
    }
}