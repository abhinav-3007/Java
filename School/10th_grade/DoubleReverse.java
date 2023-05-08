// Abhinav Goyal
// 10D
//Program to sort in descending order

public class DoubleReverse
{
    public static void main()
    {
        char arr[][] = {{'0','1','2'},{'3','4','5'},{'6','7','8'}};
        for(int i = 2; i>=0; i--)
        {
            for(int j = 0; j<3; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
}
