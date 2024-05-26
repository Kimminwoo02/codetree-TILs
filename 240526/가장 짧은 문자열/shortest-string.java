import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String data1 = br.readLine();
        String data2 = br.readLine();
        String data3 = br.readLine();
        
        Integer dmax = Math.max(data1.length(),Math.max(data2.length(),data3.length()));
        Integer dmin = Math.min(data1.length(),Math.min(data2.length(),data3.length()));

        bw.write(dmax - dmin+"");
        bw.flush();

        br.close();
        bw.close();
    }
}