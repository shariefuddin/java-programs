class Adder
{
    static void sum(int a, int b)
    {
        System.out.println("sum is :"+(a+b));
    }
    static void sum(int a, int b,int c)
    {
        System.out.println("sum is :"+(a+b+c));
    }
    static void sum(double a, double b)
    {
        System.out.println("sum is :"+(a+b));
    }
    static void sum(float a, float b)
    {
        System.out.println("sum is :"+(a+b));
    }
}
class Sum
{
    public static void main (String args[])
    {
        Adder.sum(10,30);
        Adder.sum(10,30,50);
        Adder.sum(10.69,30.36);
        Adder.sum(10.36,30.98);
        
    }
}