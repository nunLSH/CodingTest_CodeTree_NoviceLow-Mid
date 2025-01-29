import java.util.Scanner;

class Agent {
    char name;
    int score;

    public Agent(char name, int score){
        this.name = name;
        this.score = score;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent[] agents = new Agent[5];
        for (int i = 0; i < 5; i++){
            char name = sc.next().charAt(0);
            int score = sc.nextInt();
            agents[i] = new Agent(name, score);
        }

        int minIndex = 0;
        for (int i = 0; i < 5; i++){
            if (agents[minIndex].score > agents[i].score){
                minIndex = i;
            }
        }
        System.out.print(agents[minIndex].name+" "+agents[minIndex].score);
    }
}