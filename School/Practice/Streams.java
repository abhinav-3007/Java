import java.io.*;

public class Streams
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int in = Integer.parseInt(br.readLine());
        long lo = Long.parseLong(br.readLine());
        double dou = Double.parseDouble(br.readLine());
        float fl = Float.parseFloat(br.readLine());
        char ch = (char)br.read();
        char ch2 = br.readLine().charAt(0);
    }
}
