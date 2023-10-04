import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = -1;
        int pic1 = 0;
        int pic2 = 0;
        char pic[][][] = new char[n][5][7];

        for(int i=0;i<n;i++)
            for(int j=0;j<5;j++){
                String line = br.readLine();
                for(int k=0;k<7;k++) pic[i][j][k] = line.charAt(k);
            }

        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++){
                int point = 0;
                for(int k=0;k<5;k++) {
                    for(int r=0;r<7;r++){
                        if(pic[i][k][r] == pic[j][k][r]){
                            point++;
                        }
                    }
                }
                if(point>max){
                    max = point;
                    pic1 = i+1;
                    pic2 = j+1;
                }
            }

        System.out.print(pic1);
        System.out.print(" ");
        System.out.print(pic2);
    }
}