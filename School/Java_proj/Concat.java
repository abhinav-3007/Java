import java.io.*;

// Abhinav Goyal
// 9D 23/6/2020
// Program to print 3 digit number with unit, tens and hundreds place values 
// taken as input

public class Concat
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the hundreds digit");
        int h = Integer.parseInt(br.readLine());
        System.out.println("Enter the tens digit");
        int t = Integer.parseInt(br.readLine());
        System.out.println("Enter the units digit");
        int u = Integer.parseInt(br.readLine());
        int num = (h*100) + (t*10) + (u);
        System.out.println("The number is: "+num);
    }
}
