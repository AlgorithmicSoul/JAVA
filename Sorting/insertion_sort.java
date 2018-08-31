import java.util.Scanner;

public class insertion_sort {

    void sort (int arr[]) {
        int n = arr.length;
        for (int i=1; i<n; ++i) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    static void display (int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the size of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = scan.nextInt();
        insertion_sort obj = new insertion_sort();
        obj.sort(arr);
        display(arr);
        scan.close();
    }
}