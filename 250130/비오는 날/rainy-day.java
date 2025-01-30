import java.util.Scanner;

class Weather {
    String date, day, weather;

    public Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}
public class Main {
    public static int n;
    public static Weather[] arr = new Weather[100];
    public static int idx = 0;

    public static int findIndex(){
        for (int i = 0; i < n; i++){
            if (arr[i].weather.equals("Rain")){

                int date_y = Integer.parseInt(arr[i].date.substring(0, 4));
                int date_m = Integer.parseInt(arr[i].date.substring(5, 7));
                int date_d = Integer.parseInt(arr[i].date.substring(8, 10));

                int idx_y = Integer.parseInt(arr[idx].date.substring(0, 4));
                int idx_m = Integer.parseInt(arr[idx].date.substring(5, 7));
                int idx_d = Integer.parseInt(arr[idx].date.substring(8, 10));

                if (date_y < idx_y){
                    idx = i;
                    return idx;
                }

                if (date_y == idx_y){
                    if (date_m < idx_m){
                        idx = i;
                        return idx;
                    }
                    else if (date_m == idx_m){
                        if (date_d <= idx_d){
                            idx = i;
                            return idx;
                        }
                    }
                }
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            arr[i] = new Weather(date, day, weather);
        }

        for (int i = 0; i < n; i++){
            if (arr[i].weather.equals("Rain"))
                idx = i;
        }

        int index = findIndex();
        System.out.print(arr[index].date+" "+arr[index].day+" "+arr[index].weather);
    }
}