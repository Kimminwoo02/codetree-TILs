import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        String[] arr = new String[]{"apple","banana","grape","blueberry","orange"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char data = br.readLine().charAt(0);
        int cnt = 0;

        for(String res : arr){
            if(res.charAt(2) == data || res.charAt(3) == data){
                bw.write(res+"\n");
                bw.flush();
                cnt++;
            }
        }
        bw.write(cnt+"");
        bw.flush();

        bw.close();
        br.close();
        
        
    }
}