import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        for(int i = 0; i<5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0; j<3;j++){
                String a = st.nextToken();
                bw.write(a.toUpperCase()+" ");
                bw.flush();
            }
            bw.write("\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }
}