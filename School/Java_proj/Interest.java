// Abhinav Goyal
// 9D 30/6/2020
// Program to calculate simple interest with different rate depending on time

public class Interest
{
    public static void main()
    {
        int p = 1000;
        int t = 3;
        double r = (t>2)? 8:12;
        System.out.println("Simple interest: "+(p*t*r)/100);
    }
}
