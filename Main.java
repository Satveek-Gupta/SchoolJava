import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number ");
        int c = sc.nextInt();
        for(int a = 0; a <= c; a++) {
            System.out.print("# ");
            for (int b = 0; b <= a; b++) {
                System.out.print(b+ " ");
            }
            System.out.println();
        }
    }
}