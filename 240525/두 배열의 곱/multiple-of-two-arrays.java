import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer[][] arr1 = new Integer[3][3];
        Integer[][] arr2 = new Integer[3][3];

        for (int i =0; i < 3;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++){
                arr1[i][j] = Integer.parseInt(st1.nextToken());           
            }
            
        }
  
        StringTokenizer dummy = new StringTokenizer(br.readLine());

        for (int i =0; i<3; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++){
                arr1[i][j] *= Integer.parseInt(st2.nextToken());
                bw.write(arr1[i][j] + " ");
                bw.flush();
            }
            bw.write("\n");
            bw.flush();
            
        }
    
        bw.close();
        br.close();
    }
}