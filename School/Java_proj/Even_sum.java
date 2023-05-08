// Abhinav Goyal
//9D 4/9/2020
//Program to print sum of first 10 even numbers

public class Even_sum
{
    public static void main()
    {
        int sum = 0;
        for(int i = 2; i<=20; i+=2)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}