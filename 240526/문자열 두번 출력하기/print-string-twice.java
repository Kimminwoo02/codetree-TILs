import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String res = br.readLine();
        
        bw.write(res+"\n"+ res);
        bw.flush();
        bw.close();
        br.close();
    }
}