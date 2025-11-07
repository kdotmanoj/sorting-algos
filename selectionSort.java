import java.util.*;
public class selectionSort {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void swap(int[] arr,int i,int j){
        if(i == j) return;
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
    public static void selectionsort(int[] arr){
        //selection sort
        for(int i = 0;i < n-1; i++){
            int min = i;
            for(int j = i;j < n; j++){
                if(arr[j] < arr[min]) min = j;
            }
            swap(arr,i,min);
        }
    }
    public static void main(String[] args){
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        selectionsort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}