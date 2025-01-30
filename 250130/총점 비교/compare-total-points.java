import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int sub1, sub2, sub3;

    public Student(String name, int sub1, int sub2, int sub3) {
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    public int compareTo(Student student) {
        return (this.sub1 + this.sub2 + this.sub3) - (student.sub1 + student.sub2 + student.sub3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++){
            String name = sc.next();
            int sub1 = sc.nextInt();
            int sub2 = sc.nextInt();
            int sub3 = sc.nextInt();

            students[i] = new Student(name, sub1, sub2, sub3);
        }

        Arrays.sort(students);

        for (int i = 0; i < n; i++){
            System.out.print(students[i].name+" ");
            System.out.print(students[i].sub1+" ");
            System.out.print(students[i].sub2+" ");
            System.out.print(students[i].sub3+" ");
            System.out.println();
        }
    }
}