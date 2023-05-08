
/**
for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int j = 0; j<arr.length; j++)
                System.out.print(arr[j]+"\t");
            System.out.println();
        }
 */
public class SortTest
{
    public static void main()
    {
        int[] arr = {5,6,3,2,6,8,0,1,7,4,9};
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr.length-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int j = 0; j<arr.length; j++)
                System.out.print(arr[j]+"\t");
            System.out.println();
        }
    }
}
