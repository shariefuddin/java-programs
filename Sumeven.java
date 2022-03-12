import java.util.Scanner;
class Sumeven
{
    public static void main(String[] args) {
        int i,sum=0,n;
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		n=sc.nextInt();
		for(i=0;i<=n;i=i+2) 
		{
		    sum=i+sum;	
		
		}
		System.out.print(sum);
	}
}