// Abhinav Goyal
// 9D 10/7/2020
// Program that converts from cm to feet and inches 

public class Inches{
    public static void main(){
        /*int cm= 177;
        System.out.println("Inches is: "+(cm/2.54));
        System.out.println("Feet is : "+(cm/2.54)/12);*/
        
        int cm = 177;
        int in = (int)(cm/2.54);
        int feet = (int)(in/12);
        int inch = in-feet*12;
        System.out.println(feet+" feet and "+inch+" inches");
    }
}