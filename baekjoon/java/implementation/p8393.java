import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine().strip());
        Long k = 1L;
        int k_sum = 1;
        if(n>=28) k=(n+20)/7+1;
        else while(n>k_sum)k_sum+=++k;
        System.out.print(k);
    }
}