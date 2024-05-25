import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer total = 0;
        for (int i =0; i<4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
        
            for (int j =0; j<4; j++){
                
                total += Integer.parseInt(st.nextToken());
            }
            bw.write(total+"\n");
            bw.flush();
            total = 0;
        }
        bw.close();
        br.close();
    }
}