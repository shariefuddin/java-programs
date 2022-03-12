import java.util.Scanner;
class Vote{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("person age:");
        int age=sc.nextInt();
        if(age>=18)
        System.out.println(" ur eligible for vote");
        else
        {
            System.out.println("ur not eligible for vote");
        }
    }
}
