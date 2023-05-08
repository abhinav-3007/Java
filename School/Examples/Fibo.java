public class Fibo
{
    public static void main()
    {
        int x = 0, y = 1;
        System.out.print(x);
        for(int ct = 0; ct<9; ct++){
            System.out.print(", "+y);
            int a = x;
            x = y;
            y += a;
        }
    }
}
