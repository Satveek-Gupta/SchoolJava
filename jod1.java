class jod1 {
    public static void main(String[] args) {
        int list[] = {12,13,34,421,52341,312,42,45};
        int len = list.length;

        for(int i = 0; i< len-1; i++){
            for(int j = 0; j < len-1-i; j++) {
                if (list[j] < list[j-1]) {
                    int tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tmp;
                }
            }
        }

        for(int i = 0; i <= 8; i++) {
            System.out.println(list[i]);
        }
    }
}