class sumofnatural
{
    static void sum(int n)
    {
        int  sum=0,i;
        for(i=0;i<n;i++)
        {
            sum=sum+i;
        }
        System.out.println(" sum of n natural numbers are are :"+sum);
    }
}
class Sum
{
    public static void main(String args[])
    {
        sumofnatural.sum(5);
    }
}