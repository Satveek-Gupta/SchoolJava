public class overload2 {
    boolean check(int S) {
        if (S % 7 == 0 || S % 10 == 7)
            return true;
        else
            return false;
    }

    void check(long x) {
        int C = 0;
        for (int i = 1; i<= x; i++) {
            if (x % i == 0)
            C++;
        }
        if (C == 0)
        System.out.println("Prime No.");
        else
        System.out.println("Not Prime No.");
    }

    void main(int S, int x) {
        System.out.println(check(S));
        check(x);
    }
}