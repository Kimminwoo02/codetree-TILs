import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer n = Integer.parseInt(br.readLine());
        String data = null;
        Integer total = 0;
        Integer res = 0;
        for(int i = 0; i < n; i++){
            data = br.readLine();
            total += data.length();
            if(data.charAt(0) == 'a'){
                res++;
            }
            
        }
        bw.write(total+" "+res);
        bw.flush();

        bw.close();
        br.close();

    }
}