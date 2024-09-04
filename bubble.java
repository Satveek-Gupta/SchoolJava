class bubble {
    public static void main(String[] args) {
        int A[] = { 65, 13, 43, 34, 35};
        int b = A.length;

        for (int i = 0; i < b - 1; i++) {
            for (int j = 0; j < b-i-1; j++) {
                if (A[j] > A[j+1]) {
                    int tmp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tmp;
                }
            }
        }
        System.out.println("Sorted array is:");
        for (int i = 0; i < b; i++) {
            System.out.println(A[i]);
        }
    }
}