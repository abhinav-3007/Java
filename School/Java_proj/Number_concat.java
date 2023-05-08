// Abhinav Goyal
// 9D 23/6/2020
// Program to print 3 digit number with unit, tens and hundreds place values 
// given

public class Number_concat
{
    public static void main()
    {
        int u = 9;
        int t = 0;
        int h = 4;
        int num = (h*100) + (t*10) + (u);
        System.out.println("The number is: "+num);
    }
}
