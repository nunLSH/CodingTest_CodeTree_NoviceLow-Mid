import java.util.Scanner;

class Spy {
    String secretCode;
    char meetingPoint;
    int time;

    public Spy(String secretCode, char meetingPoint, int time){
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

        Spy spy = new Spy(secretCode, meetingPoint, time);

        System.out.println("secret code : "+ spy.secretCode);
        System.out.println("meeting point : "+ spy.meetingPoint);
        System.out.println("time : "+ spy.time);
    }
}