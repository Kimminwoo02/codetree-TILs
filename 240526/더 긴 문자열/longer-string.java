import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        String m = st.nextToken();
        
        if( n.length() > m.length()) {
            bw.write(n + " "+ n.length());
            bw.flush();
        }
        else if (n.length() == m.length()){
            bw.write("same");
            bw.flush();
        }
        else{
            bw.write(m + " "+ m.length());
            bw.flush();
        }
        bw.close();
        br.close();

    }
}