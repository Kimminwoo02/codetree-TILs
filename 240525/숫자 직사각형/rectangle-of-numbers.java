import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer n = Integer.parseInt(st.nextToken());
        Integer m = Integer.parseInt(st.nextToken());

        Integer[][] arr = new Integer[n][m];
        int cnt = 1;
        for (int i = 0; i<n; i++){
            
            for (int j =0 ; j<m; j++){
                bw.write(cnt+" ");
                bw.flush();
                cnt +=1;
            }

            bw.write("\n");
            bw.flush();
            
        }
        
        bw.close();
        br.close();
        
    }
}