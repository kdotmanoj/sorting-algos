import java.util.Scanner;

public class quickSort {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void quicksort(int[] arr,int l,int r){
        if(l >= r) return;

        int pivot = arr[(l+r)/2];
        int i = l;
        int j = r;

        while(i <= j){
            while(arr[i] < pivot) i++;
            while(arr[j] > pivot) j--;
            if(i <= j){
                swap(i, j, arr);
                i++;j--;
            }
        }

        quicksort(arr, l, j);
        quicksort(arr, i, r);
    }
    public static void main(String[] args){
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        quicksort(arr,0,n-1);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

/*
 * best case tc - O(nlogn)
 * average case tc - O(nlogn)
 * worst case tc - O(n^2)
 * this happens when the pivot happens to be the smallest/largest element in every recursion
 */