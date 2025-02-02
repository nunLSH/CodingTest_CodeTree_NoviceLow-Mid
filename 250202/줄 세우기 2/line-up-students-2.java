import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int num, height, weight;

    public Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student student){
        if (this.height == student.height)
            return student.weight - this.weight;
        return this.height - student.height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n+1];
        for (int i = 1; i <= n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();

            students[i] = new Student(h, w, i);
        }

        Arrays.sort(students, 1, n+1);

        for (int i = 1; i <= n; i++){
            System.out.print(students[i].height+" ");
            System.out.print(students[i].weight+" ");
            System.out.print(students[i].num+" ");
            System.out.println();
        }
    }
}