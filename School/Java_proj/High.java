import java.io.*;

// Abhinav Goyal
// 9D 7/7/2020
// Program to print whether person is in middle or high school

public class High
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Please enter your standard");
        int standard = Integer.parseInt(br.readLine());
        String s = (standard >=8)? "high school":"middle school";
        System.out.println("The student is in "+s);
    }
}
