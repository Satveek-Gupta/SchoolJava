import java.util.Scanner;

class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A word");
        String S = sc.nextLine();
        S = S.trim();
        int l = S.length();
        String NS = "";
        for (int i = 0; i < l; i++) {
            char ch = S.charAt(i);
            if (ch >= 65 && ch <= 90) {
                char Nch = ch + 32;
                NS = NS + Nch;
            }

            else if (ch >= 97 && ch <= 123) {
                char Nch = ch - 32;
                NS = NS + Nch;
            }

            else NS = NS + ch;
        }

        System.out.println("New String" + NS);
    }
}