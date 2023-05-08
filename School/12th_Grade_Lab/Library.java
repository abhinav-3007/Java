// Abhinav Goyal
// 12A
// Superclass to create instance variables and display them
 
public class Library
{
    String name;
    String author;
    double p;
    
    // parameterized constructor
    public Library(String nameInput, String authorInput, double pInput) {
        name = nameInput;
        author = authorInput;
        p = pInput;
    }
    
    public void show() {
        System.out.println("Name: "+name);
        System.out.println("Author: "+author);
        System.out.println("Price: "+p);
    }
}
