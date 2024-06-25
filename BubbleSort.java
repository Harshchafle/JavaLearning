
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,7,9,1000000,6};
        // Scanner sc = new Scanner(System.in);
        // System.out.println("please enter your array elems");
        // for(int i = 0; i < arr.length - 1; i++){
        //     arr[i] = sc.nextInt();
        // }
        
        // Bubble Sorting loops
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // Swaping the elements
                    int temp;
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        // Printing sorted array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
