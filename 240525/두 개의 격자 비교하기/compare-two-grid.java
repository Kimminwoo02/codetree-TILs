import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        Integer n = Integer.parseInt(st1.nextToken());
        Integer m = Integer.parseInt(st1.nextToken());
        Integer[][] arr1 = new Integer[n][m];

        for (int i =0; i<n;i++){
            st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j<m; j++){
                arr1[i][j] = Integer.parseInt(st1.nextToken());
            }
        }


        for (int i =0; i<n;i++){
            st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j<m; j++){
                if (arr1[i][j] != Integer.parseInt(st1.nextToken())){;
                    bw.write(1 +" ");
                    bw.flush();
                }else{
                    bw.write(0 + " ");
                    bw.flush();
                }
            }
            bw.write("\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}