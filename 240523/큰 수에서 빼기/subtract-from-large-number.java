import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = br.readLine();
        
        StringTokenizer st = new StringTokenizer(a);
        String a1 = st.nextToken();
        Integer n1 = Integer.parseInt(a1);
        String a2 = st.nextToken();
        Integer n2 = Integer.parseInt(a2);
        
        bw.write(Math.abs(n1 -n2)+"");
        bw.flush();
        // 여기에 코드를 작성해주세요.
    }
}