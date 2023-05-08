// Abhinav Goyal
// 10  26/2/2021
// Program to find capital of a country

import java.util.*;

public class Capital
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String cou[] = new String[10];
        String cap[] = new String[10];
        for(int i=0; i<10; i++){
            System.out.println("Enter the country");
            cou[i] = sc.nextLine();
            System.out.println("Enter its capital");
            cap[i] = sc.nextLine();
        }
        System.out.println("Enter the coutry whose capital is to be found");
        String item = sc.nextLine();
        int ind = 0;
        int flag = 0;
        for(int i=0; i<10; i++){
            if(cou[i].equals(item)){
                ind = i;
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("The country was not found");
        else
            System.out.println("The capital is "+cap[ind]);
    }
}