import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n1 = br.readLine();
        String n2 = br.readLine();

        if (n1.length()>=n2.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}