public class array {
    public static void main(String[] args) {
        int room[] = {35,56,43,66,49};

        System.out.println("Room No.\tCapacity");
        System.out.println("********\t********");

        for( int i = 0; i < 5; i++) {
            System.out.println(i + "\t\t" + room[i]);
        }
    }
}
