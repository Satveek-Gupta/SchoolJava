import java.util.Scanner;

class bq1 {
    public static void main(String[] args) {
        int n = 10;
        int A[] = new int[n];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 element in random order");
        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        int b = A.length;

        for (int i = 0; i < b - 1; i++) {
            for (int j = 0; j < b - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted array is:");
        for (int i = 0; i < b; i++) {
            System.out.println(A[i]);
        }
    }
}