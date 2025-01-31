import java.util.Scanner;
import java.util.Arrays;

class Dot implements Comparable<Dot>{
    int num, distance;

    public Dot (int num, int distance){
        this.num = num;
        this.distance = distance;
    }

    public int compareTo(Dot dot){
        if(this.distance == dot.distance)
            return this.num - dot.num;
        return this.distance - dot.distance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Dot[] dots = new Dot[n];
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x < 0)
                x = -x;
            if (y < 0)
                y = -y;
            
            int distance = x+y;

            dots[i] = new Dot(i+1, distance);
        }
        Arrays.sort(dots);
        for (int i = 0; i < n; i++)
            System.out.println(dots[i].num);
    }
}