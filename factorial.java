public class factorial {
 
    public static void main(String[] args) {
        int n = 5;
         
        int factorial = 1;
         
        
        int i=1;
        while(i<=n) {
            factorial *= i; //factorial = factorial * i
            i++;
        }
         
        System.out.print(n+"! = "+factorial);
    }
}