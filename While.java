import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        int a = sc.nextInt();
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
    }
}
