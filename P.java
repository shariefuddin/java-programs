package inheritancePractice; 
public class P 
{ 
// Declare an instance variable. 
    int a = 30; 
 } 
public class Q extends P 
{ 
// Declare an instance variable whose name is same as that of the superclass instance variable name. 
    int a = 50; 
 } 
public class Main extends Q { 
public static void main(String[] args) 
{ 
// Create an object of class Q and call the instance variable using reference variable q. 
   Q q = new Q();
   System.out.println(" Value of a: " +q.a); // 'a' of Q is called. 

// Declare superclass reference is equal to the child class object. 
   P p = new Q();
   System.out.println("Value of a: " +p.a); // 'a' of P is called. 
  } 
 }