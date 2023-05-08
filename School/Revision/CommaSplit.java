// Abhinav GOyal
// 10D
// Program to print part of a sentence after comma

public class CommaSplit
{
    public static void main()
    {
        String st = "Hello, World";
        System.out.println(st.substring(st.indexOf(',')+1));
    }
}
