// Abhinav Goyal
// 11A
// program to print given pattern

public class Triangle
{
    // method to print out pattern
    public void pattern()
    {
        for(int row = 0; row<4; row++) {
            // loop to print stars on left
            for(int columns1 = 0; columns1 < 4-row; columns1++) {
                // printing stars and blank spaces
                if(columns1 == 4-row-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // loop to print stars on right
            for(int columns2 = 0; columns2 < row*2; columns2++) {
                // printing stars and spaces
                if(columns2 == (row*2)-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
    
    // main method
    public static void main(String[] args)
    {
        Triangle object = new Triangle();
        object.pattern();
    }
}
