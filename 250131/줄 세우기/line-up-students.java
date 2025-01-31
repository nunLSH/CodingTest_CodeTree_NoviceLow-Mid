import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int height, weight, num;

    public Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student student){
        if (student.height == this.height){
            if (student.weight == this.weight)
                return this.num - student.num;
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();

            students[i] = new Student(h, w, i+1);
        }

        Arrays.sort(students);

        for (int i = 0; i < n; i++){
            System.out.print(students[i].height+" ");
            System.out.print(students[i].weight+" ");
            System.out.print(students[i].num+" ");
            System.out.println();
        }
    }
}