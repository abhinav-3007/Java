// Abhinav Goyal
// 9D 30/6/2020
// Program to print the square of an even number and cube of an odd number

public class Exponent
{
    public static void main()
    {
        int num = 7;
        int expo = (7%2)==0? (num*num):(num*num*num);
        System.out.println("The powered number is "+expo);
    }
}
