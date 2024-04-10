import java.util.Scanner;

public class reverseanarray {
    /*public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j =n-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }*/
    static void reverse(int []a ,int n){
        int [] b = new int[n];
        int j =n;
        for(int i=0;i<n;i++){
            b[j-1]=a[i];
            j--;
        }
        for(j=0;j<n;j++){
            System.out.print(b[j]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        reverse(a,n);
    }
}
