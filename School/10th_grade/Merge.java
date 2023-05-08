// Abhinav Goyal
// 10  22/2/2021
// Program to merge 2 arrays into 1

public class Merge
{
    public static void main()
    {
        int x[] = {5,-3,-2,1,0,12,14,16,25,13};
        int y[] = {6,5,10,15,18,20,22,30};
        int z[] = new int[18];
        for(int i = 0; i<18; i+=2){
            int ind = i/2;
            z[i] = x[ind];
            if(ind>7)
                z[i+1] = x[ind+1];
            else
                z[i+1] = y[ind];
        }
        for(int i = 0; i<18; i++){
            System.out.println(z[i]);
        }
    }
}

