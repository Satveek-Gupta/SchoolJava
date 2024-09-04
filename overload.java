public class overload {
    int Perimeter(int S) {
        int Peri = 4 * S;
        return Peri;  
    }
    
    void Perimeter(int l, int b) {
        int P = 2 * (l + b);
        System.out.println("Perimeter of Rectangle" + P);
    }

    public void main(int S, int l, int b) {
        int PR = Perimeter(S);    
        System.out.println("Perimeter of Sq" + PR);
        Perimeter(l , b);
    }
}