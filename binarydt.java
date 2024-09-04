public class binarydt {
    public static void main(int x) {
        
        int A[] = { 2, 5, 7, 10, 15, 20, 29, 30, 46, 50 };
        int S = 0;
        int E = A.length - 1;
        int Fi = -1;
        int mid = 0;
        while (S <= E) {
            mid = (S + E) / 2;
            if (x == A[mid]) {
                Fi = mid;
                break;
            } 
            else if (x < A[mid])
                E = mid - 1;
            else
                S = mid + 1;
        }
        if (Fi >= 0)
            System.out.println(x + " found at index " + Fi);
        else
            System.out.println(x + " Search element not found");
    }
}