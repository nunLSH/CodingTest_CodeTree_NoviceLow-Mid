import java.util.Scanner;

class Agent {
    char name;
    int score;

    public Agent(){
        this.name = ' ';
        this.score = 0;
    }

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

        char minName = agents[0].name;
        int minScore = agents[0].score;

        for (int i = 0; i < 5; i++){
            if (minScore > agents[i].score){
                minScore = agents[i].score;
                minName = agents[i].name;
            }
        }
        System.out.print(minName+" "+minScore);
    }
}