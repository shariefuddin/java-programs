import java. util. Scanner;
class Blood
{
public static void main (String args[ ]) 
{
int age, weight;
System. out. println("enter age") ;
Scanner sc = new Scanner (System.in) ;
age= sc. nextInt( ) ;
System. out. println("enter weight") ;
weight= sc. nextInt( ) ;
if(age>18 && weight>=50) 
System. out. println("you are eligible to donate blood") ;
else
System. out. println("you are not eligible to donate,thank you for showing intrest") ;
}
}