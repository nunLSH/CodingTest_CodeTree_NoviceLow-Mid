import java.util.Scanner;

class Instance {
    String secretCode;
    char meetingPoint;
    int time;

    public Instance(String secretCode, char meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String secretCode = sc.next();
        char meetingPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        Instance i = new Instance(secretCode, meetingPoint, time);

        System.out.println("secret code : "+i.secretCode);
        System.out.println("meeting point : "+ i.meetingPoint);
        System.out.println("time : "+ i.time);
    }
}