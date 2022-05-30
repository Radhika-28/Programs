/*15.Program to Sort first half in ascending order and second half in descending order in an array */
import java.util.Arrays;

public class Program_15 {
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        Arrays.sort(arr);
        for(int i=0; i<arr.length/2; i++){
            System.out.println(arr[i]+"");
        }
        for(int i=arr.length-1; i>=arr.length/2; i--){
            System.out.println(arr[i]+"");
        }
    }
}
