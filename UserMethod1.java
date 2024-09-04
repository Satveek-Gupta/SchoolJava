public class UserMethod1 {
    static boolean isBuzz(int n) {
        if (n % 7 == 0 || n % 10 == 7)
        return true;
        else
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isBuzz(47));
    }
}
