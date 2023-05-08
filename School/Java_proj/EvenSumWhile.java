// Abhinav Goyal
//9D 30/10/2020
//Program to print sum of first 10 even numbers

public class EvenSumWhile
{
    public static void main()
    {
        int sum = 0;
        int i = 2;
        while(i<=20)
        {
            sum+=i;
            i+=2;
        }
        System.out.println(sum);
    }
}