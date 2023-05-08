import java.util.*;

// Abhinav Goyal
// 9D 10/7/2020
// Program that converts from cm to feet and inches 

public class Height{
    public static void main(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the height in cm"); 
        int cm = sc.nextInt(); 
        int in = (int)(cm/2.54);
        int feet = (int)(in/12);
        int inch = in-feet*12;
        System.out.println(feet+" feet and "+inch+" inches");
    }
}