// Abhinav Goyal
//9D 30/6/2020
// Program to print rank of student based on their marks

public class Marks
{
    public static void main()
    {
        int mar = 65;
        String rate = (mar>=90)? "Excellent":(mar>=80)? "Good":(mar>=70)? "Fair":(mar>=60)? "Average" : "Poor";
        System.out.println("The student's rating is: "+rate);
    }
}
