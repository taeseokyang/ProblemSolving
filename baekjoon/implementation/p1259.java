import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int r = 0;
            String s = input.nextLine();
            int l = s.length();
            if (s.equals("0")){
                break;
            }
            for(int i=0;i<(int)(l/2);i++){
                if (s.charAt(i) != s.charAt(l-(i+1))){
                    r = 1;
                    break;
                }
            }
            if(r==1){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
    }
}