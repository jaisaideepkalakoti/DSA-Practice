import java.util.Arrays;
import java.util.Scanner;

public class Kth_MinMax {
    static void kth_minmax(int arr[],int n){
        Arrays.sort(arr);
        int min = arr[n-1];
        System.out.println(min);
        int k = arr.length;
        int [] temp = new int[k];
        int j = k;
        for(int i=0;i<k;i++){
            arr[j-1] = arr[i];
            j--;
        }
        int max = arr[n-1];
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int arr[] = new int[k];
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
        int n = sc.nextInt();
        kth_minmax(arr,n);
    }
}
