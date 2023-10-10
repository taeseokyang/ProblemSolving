import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int way[][] = {{0,1},{1,0},{0,-1},{-1,0}};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String line = br.readLine();
            String chars[] = line.split(" ");
            int a = Integer.parseInt(chars[0]);
            int b = Integer.parseInt(chars[1]);
            if(a==0 && b==0){
                break;
            }
            System.out.println(a+b);

        }
    }
}