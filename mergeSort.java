import java.util.Scanner;

public class mergeSort {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void merge(int[] arr,int s,int mid,int e){
        int[] temp = new int[e-s+1];
        
        int i = s,j = mid+1,k = 0;

        while(i <= mid && j <= e){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= e){
            temp[k++] = arr[j++];
        }

        for(k = 0; k < temp.length; k++){
            arr[s + k] = temp[k];
        }
    }
    public static void mergesort(int[] arr,int s,int e){
        if(s >= e) return;
        int mid = s + (e-s)/2;
        mergesort(arr, s, mid);
        mergesort(arr, mid+1, e);
        merge(arr,s,mid,e);
    }
    public static void main(String[] args) {
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        mergesort(arr,0,n-1);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
