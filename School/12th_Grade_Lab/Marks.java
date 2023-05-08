// Abhinav Goyal
// 12A
// Class to find total, percentage, and grade

import java.util.*;

class Marks extends Student
{
    float p, c, m, cts, e;
    float tot, per;
    char gd;
    
    // method to input marks
    public void readData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Physics, Chemistry, Mathematics, Computer Science, and English marks");
        p = sc.nextFloat();
        c = sc.nextFloat();
        m = sc.nextFloat();
        cts = sc.nextFloat();
        e = sc.nextFloat();
    }
    
    // method to find total marks, percentage, and grade of the student
    public void compute()
    {
        tot = p+c+m+cts+e;
        per = (tot/(5*100))*100;
        // calculating grade
        if(per >= 90)
            gd = 'A';
        else if(per >= 60)
            gd = 'B';
        else if(per >= 40)
            gd = 'C';
        else 
            gd = 'D';
    }
    
    // method to display marks
    public void showData()
    {
        System.out.println("Physics: " + p);
        System.out.println("Chemistry: " + c);
        System.out.println("Mathematics: " + m);
        System.out.println("Computer Science: " + cts);
        System.out.println("English: " + e);
        System.out.println("Total: " + tot);
        System.out.println("Percentage: " + per);
        System.out.println("Grade: " + gd);
    }
    
    // main method
    public static void main()
    {
        Marks object = new Marks();
        object.inputData();
        object.printData();
        object.readData();
        object.compute();
        object.showData();
    }
}
