import java.util.*;
public class bubbleSort {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void swap(int[] arr,int i,int j){
        if(i == j) return;
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
    public static void bubblesort(int[] arr){
        //bubble sort
        for(int i = n-1;i >= 0; i--){
            for(int j = 1;j <= i; j++){
                if(arr[j-1] > arr[j]) swap(arr, j-1, j);
            }
        }
    }
    public static void main(String[] args){
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        bubblesort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}