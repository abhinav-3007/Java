import java.io.*;

// Abhinav Goyal
// 9D 7/7/2020
// Program to print whether a person is major or minor

public class Age
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Please enter the age");
        int age =Integer.parseInt(br.readLine());
        String s = (age<18)? "minor":"major";
        System.out.println("The person is a "+s);
    }
}
