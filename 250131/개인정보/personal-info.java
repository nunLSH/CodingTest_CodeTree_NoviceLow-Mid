import java.util.Scanner;
import java.util.Arrays;

class Student1 implements Comparable<Student1>{
    String name;
    int height;
    double weight;

    public Student1(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student1 student1){
        return this.name.compareTo(student1.name);
    }
}

class Student2 implements Comparable<Student2>{
    String name;
    int height;
    double weight;

    public Student2(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student2 student2){
        return student2.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student1[] students1 = new Student1[5];
        Student2[] students2 = new Student2[5];
        for (int i = 0; i < 5; i++){
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            students1[i] = new Student1(name, height, weight);
            students2[i] = new Student2(name, height, weight);
        }

        Arrays.sort(students1);
        System.out.println("name");
        for (int i = 0; i < 5; i++){
            System.out.print(students1[i].name+" ");
            System.out.print(students1[i].height+" ");
            System.out.print(students1[i].weight+" ");
            System.out.println();
        }
        System.out.println();

        Arrays.sort(students2);
        System.out.println("height");
        for (int i = 0; i < 5; i++){
            System.out.print(students2[i].name+" ");
            System.out.print(students2[i].height+" ");
            System.out.print(students2[i].weight+" ");
            System.out.println();
        }
    }
}