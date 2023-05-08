// Abhinav Goyal
// 10D 10/6/2021
//Program to sort in descending order

public class Descending
{
    public static void main()
    {
        int arr[] = {3,1,25,6,9};
        int l, temp;
        for(int i = 0; i < arr.length-1; i++)
        {
            l = i;
            for(int j = i+1; j<arr.length;j++)
            {
                if(arr[j] > arr[l])
                    l = j;
            }
            temp = arr[l];
            arr[l] = arr[i];
            arr[i] = temp;
        }
        for(int x = 0; x<arr.length; x++)
            System.out.println(arr[x]);
    }
}
