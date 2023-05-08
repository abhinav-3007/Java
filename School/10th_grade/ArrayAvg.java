// Abhinav Goyal
// 10  19/2/2021
// Program to calculate sum and average of an array

public class ArrayAvg
{
    public static void main()
    {
        int a[] = {5,10,12,8,15};
        int sum = 0;
        for(int i=0; i<5; i++)
            sum+=a[i];
        double avg = sum/5.0;
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+avg);
    }
}
