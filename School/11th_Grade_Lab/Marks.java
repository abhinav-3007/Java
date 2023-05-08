// Abhinav Goyal
// 11A
// Program to grade students based on their marks

public class Marks
{
    int marks;
    // Constructor Method
    public Marks()
    {
        marks = 83;
    }
    
    // Function to print grade of student
    public void printGrade()
    {
        if(marks>90)
            System.out.println("Excellent");
        else if(marks>80)
            System.out.println("Good");
        else if(marks>70)
            System.out.println("Fair");
        else if(marks>59)
            System.out.println("Average");
        else
            System.out.println("Poor");
    }
    
    // main method
    public static void main()
    {
        Marks object = new Marks();
        object.printGrade();
    }
}
