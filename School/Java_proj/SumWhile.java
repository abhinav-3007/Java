// Abhinav Goyal
//9D 30/10/2020
//Program to print sum of first 10 natural numbers

public class SumWhile
{
    public static void main()
    {
        int sum = 0;
        int i=1;
        while(i<=10)
        {
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}