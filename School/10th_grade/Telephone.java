// Abhinav Goyal
// 10D
// Program to print phone bill

import java.util.*;

public class Telephone
{
    int prv, pre, call;
    String name;
    double amt, total;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and previous and present readings");
        name = sc.nextLine();
        prv = sc.nextInt();
        pre = sc.nextInt();
    }
    
    public void cal()
    {
        call = pre-prv;
        int x = call;
        total = 180.0;
        if(x>400){
            amt+=(x-400)*0.70;
            x = 400;
        }
        if(x>200){
            amt+=(x-200)*0.80;
            x = 200;
        }
        if(x>100){
            amt+=(x-100)*0.90;
        }
        total+=amt;
    }
    
    public void display()
    {
        System.out.println("Name of the customer\tCalls made\tAmount to be paid");
        System.out.println(name+"\t\t\t"+call+"\t\t"+total);
    }
    
    public static void main()
    {
        Telephone obj = new Telephone();
        obj.input();
        obj.cal();
        obj.display();
    }
}
