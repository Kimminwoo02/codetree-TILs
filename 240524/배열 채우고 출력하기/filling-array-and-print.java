import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> data = new ArrayList<>();
        
        while(st.hasMoreTokens()){
            data.add(st.nextToken());
        }
        Collections.reverse(data);
       
        for (String c : data){
            bw.write(c+"");
            bw.flush();
        }
        bw.close();
        br.close();
        
    }
}