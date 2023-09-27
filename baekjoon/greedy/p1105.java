import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String ss[] = s.split(" ");
        String n1 = ss[0];
        String n2 = ss[1];
        int cnt = 0;
        if(n1.length()!=n2.length()){
            System.out.print(0);
        }else{
            for(int i=0;i<n1.length();i++){
                if (n1.charAt(i)==n2.charAt(i)){
                    if(n1.charAt(i)=='8') {
                        cnt++;
                    }
                }else{
                    break;
                }
            }
            System.out.print(cnt);
        }
    }
}