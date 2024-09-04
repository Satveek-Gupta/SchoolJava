import java.util.*;

class Student {
    String name;
    int age;
    int m1, m2, m3, max;
    double avg;

    public Student(){ }

    public Student(String nm, int ag, int mks1, int mks2, int mks3) {
        name = nm;
        age = ag;
        m1 = mks1;
        m2 = mks2;
        m3 = mks3;
        max = 0;
        avg = 0;
    }

    public void Details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Age:");
        age = sc.nextInt();

        System.out.println("Enter Marks1:");
        m1 = sc.nextInt();
        System.out.println("Enter Marks2:");
        m2 = sc.nextInt();
        System.out.println("Enter Marks3:");
        m3 = sc.nextInt();

        sc.close();
    }

    public void Compute() {
        avg = (m1+m2+m3)/3.0;
        max = Math.max(m1, (Math.max(m2,m3)));
    }

    public void Display() {
        System.out.println("Name:" + name);
        System.out.println("Age:"+ age);
        System.out.println("Marks in Subject1"+ m1);
        System.out.println("Marks in Subject2" +m2);
        System.out.println("Marks in Subject3"+ m3);
        System.out.println("Maximum Marks" + max);
        System.out.println("Average Marks:" + avg);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.Details();
        student1.Compute();
        System.out.println("Student details *** With default constructor");
        student1.Display();
        Student student2 = new Student("Rekha Batra", 15,94,99,92);
        student2.Compute();
        System.out.println("Student details *** Without default constructor");
        student2.Display();
    }
}