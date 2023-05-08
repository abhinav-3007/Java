import java.util.*;

// Abhinav Goyal
//9D
// Program to calculate kinetic energy by taking m as input 

public class Energy
{
   public static void main()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the mass");
       double m = sc.nextDouble();
       int v = 10;
       double energy = (m*v*v)/2;
       System.out.println("Kinetic energy: "+energy);
   }
}
