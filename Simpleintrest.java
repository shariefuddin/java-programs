import java.util.Scanner;
class Simpleintrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Principle amount:");
        double p=sc.nextDouble();
        System.out.println("Enter Time period:");
         double t=sc.nextDouble();
          System.out.println("Enter rate of Intrest:");
        double r=sc.nextDouble();
        double si=(p*t*r)/100;
        System.out.println("Simple intrest:"+si);
    }
}