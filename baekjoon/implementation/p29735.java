import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String times[] = n.split(" ");
        String st = times[0];
        String et = times[1];
        String sts[] = st.split(":");
        int st_h = Integer.parseInt(sts[0]);
        int st_m = Integer.parseInt(sts[1]);
        String ets[] = et.split(":");
        int et_h = Integer.parseInt(ets[0]);
        int et_m = Integer.parseInt(ets[1]);
        int a_day_total_time = (et_h*60+et_m) - (st_h*60+st_m);
        String n2 = br.readLine();
        String box[] = n2.split(" ");
        int boxs = Integer.parseInt(box[0]);
        int time = Integer.parseInt(box[1]);
        int a_day_limit = (a_day_total_time-1)/time;
        int days = (boxs)/a_day_limit;
        int total_work_time = (boxs+1)*time;
        int all_days_work_time = days*a_day_limit*time;
        int rt = total_work_time-all_days_work_time;
        if (all_days_work_time != 0 && total_work_time%all_days_work_time == 0) rt -= a_day_limit*time;
        int rt_h = st_h+rt/60;
        int rt_m = st_m+rt%60;
        if (rt_m>=60){
            rt_h++;
            rt_m-=60;
        }
        System.out.printf("%d\n%02d:%02d",days,rt_h,rt_m);
    }
}