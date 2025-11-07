import java.util.*;
public class insertionSort {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void swap(int[] arr,int i,int j){
        if(i == j) return;
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
    public static void insertionsort(int[] arr){
        //insertion sort
        for(int i = 1;i < n; i++){
            for(int j = i-1;j >= 0; j--){
                if(arr[j] > arr[j+1]) swap(arr, j, j+1);
            }
        }
    }
    public static void main(String[] args){
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        insertionsort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

