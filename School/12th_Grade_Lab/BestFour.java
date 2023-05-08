// Abhinav Goyal
// 12A
// Class to find and print best 4 subjects along with total points

public class BestFour extends IsScores
{
    // Constructor to call super class constructor
    public BestFour()
    {
        super();
    }
    
    // method to display total points and best 4 scores
    public void bestSubjects()
    {
        int total = point();
        System.out.println("Total Points: "+total);
        // Loop to sort array
        for(int outer = 1; outer < 6; outer++) {
            int inner = outer-1;
            int keyScore = number[outer][1];
            int keyCode = number[outer][0];
            // inner loop of sort
            while(inner>=0 && number[inner][1] < keyScore) {
                number[inner+1][0] = number[inner][0];
                number[inner+1][1] = number[inner][1];
                inner -= 1;
            }
            number[inner+1][0] = keyCode;
            number[inner+1][1] = keyScore;
        }
        // loop to display best 4 subjects
        System.out.println("Best Scores:");
        for(int index = 0; index < 4; index++) {
            System.out.println(number[index][0]+"\t"+number[index][1]);
        }
    }
   
    public static void main(String args[])
    {
        BestFour object = new BestFour();
        object.bestSubjects();
    }
}