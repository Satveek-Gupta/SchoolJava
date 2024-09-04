import java.util.*;

class evenodd {

    static void check(int x) {
        if (x % 2 == 0)
            System.out.println("The entered number is even");
        else
            System.out.println("The entered number is odd");
    }

    static boolean check1(int b) {
        if (b % 7 == 0 || b % 10 == 7)
        return true;
        else
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        check(a);
        
        int b = sc.nextInt();
        System.out.println(check1(b));
    }
}