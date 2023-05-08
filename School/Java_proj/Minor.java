// Abhinav Goyal
// 9D 26/6/2020
// Program to print if a person is a major or a minor

public class Minor
{
    public static void main()
    {
        int age = 15;
        String category = (age<18)?"Minor":"Major";
        System.out.println("The Person is a "+category);
    }
}
