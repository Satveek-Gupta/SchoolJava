import java.util.Scanner;

public class linear1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int searchnumber;
        int foundIndex = -1;

        int list[] = {13,34,54,35,43};
        int b = list.length;

        System.out.println("Enter a Number to be Searched");
        searchnumber = sc.nextInt();

        for ( int i = 0; i < b; i++) {
            if (list[i] == searchnumber) {
            foundIndex = i;
            break;
            }
        }
        if (foundIndex >= 0) 
            System.out.println("Number" + searchnumber + " found at index"+ foundIndex);
            else
            System.out.println("Number" + searchnumber + " not found at index"+ foundIndex);
            sc.close();
    }
}