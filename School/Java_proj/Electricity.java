// Abhinav Goyal
//9D 21/8/2020
//Program to calculate an electricity bill

import java.util.*;

public class Electricity
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the readings from last month");
        int pr = sc.nextInt();
        System.out.println("Enter this months reading");
        int cu = sc.nextInt();
        int unit = cu-pr;
        int cost;
        if(unit <= 80){
            cost = 250;
        }else if(unit <= 150){
            cost = 250 + ((unit-80)*2);
        }else if(unit <= 250){
            cost = 250 + ((unit-80)*3);
        }else{
            cost = 250 + ((unit-80)*5);
        }
        System.out.println("The bill is of rs. "+cost);
    }
}