import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        Integer res = Integer.parseInt(n);
        
        if (res < 5){
            bw.write(res * res +""+"\n"+"tiny");
            bw.flush();
        }
        else{
            bw.write(res * res +"");
            bw.flush();
        }
        bw.close();
        br.close();
        

    }
}