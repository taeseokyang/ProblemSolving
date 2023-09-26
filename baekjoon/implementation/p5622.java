import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int time = 0;
        //0  1  2 3 4 5
        //65 66 67
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i);
            if (c == 'S' || c == 'V' || c == 'Y' || c == 'Z'){
                time -= 1;
            }
            time += ((int)c-65)/3+3;
        }
        System.out.print(time);
    }
}