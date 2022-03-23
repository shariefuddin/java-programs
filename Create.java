class Area
{
    static void area(int a, int b)
    {
        System.out.println("area  of rectangle is :"+(a*b));
    }
    static void area(int a)
    {
        System.out.println("area of the square is :"+(a*a));
    }
    static void area(double a, double b)
    {
        System.out.println("area of triangle is :"+(0.5*a*b));
    }
  
}
class Create
{
    public static void main (String args[])
    {
       Area.area(5,4);
       Area.area(4);
       Area.area(2.23,6.63);
    }
}