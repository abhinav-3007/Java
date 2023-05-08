// Abhinav Goyal
// 10D
// Program to print string in pig latin

import java.util.*;

public class Latin
{
    String name;
    Latin()
    {
        name = "";
    }
    
    public void input(String n)
    {
        name = n.toLowerCase();
        String latin="";
        
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                latin = n.substring(i, n.length())+latin+"ay";
                break;
            }else
                latin = latin+ch;
        }
        System.out.println(latin);
    }
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String n = sc.nextLine();
        Latin obj = new Latin();
        obj.input(n);
    }
}
