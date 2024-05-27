import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String arr1 = br.readLine();
        String arr2 = br.readLine();
        String res = arr1;
        Integer cnt = 0;
        for (int i =0; i<arr1.length();i++){
     
            if(!res.equals(arr2)) {
                 cnt+=1;                
            }
            else {
                bw.write(cnt+"");
                bw.flush();
                System.exit(0);
            }
            char data = res.charAt(0);
            res = res.substring(1) + data;
        }

        bw.write(-1+"");
        bw.flush();
    }
}