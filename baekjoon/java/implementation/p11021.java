import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String datas[] = br.readLine().split(" ");
            System.out.println("Case #"+(i+1)+": "+(Integer.parseInt(datas[0])+Integer.parseInt(datas[1])));
        }
    }
}