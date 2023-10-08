import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        String nn[] = n.split(" ");
        String n1 = nn[0];
        String n2 = nn[1];
        String rn1 = "";
        String rn2 = "";
        for (int i=2;i>=0;i--) {
            rn1 = rn1 + n1.charAt(i);
        }
        for (int i=2;i>=0;i--) {
            rn2 = rn2 + n2.charAt(i);
        }
        if (Integer.parseInt(rn1)>Integer.parseInt(rn2)){
            System.out.print(rn1);
        }else{
            System.out.print(rn2);
        }
    }
}