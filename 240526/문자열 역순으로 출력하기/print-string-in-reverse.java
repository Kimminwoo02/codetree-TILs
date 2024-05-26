import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = new String[4];
        
        for(int i = 0; i < 4;i++){
            arr[i] = br.readLine();
        }

        for (int i = 3; i >= 0;i--){
            bw.write(arr[i]+"\n");
            bw.flush();
        }

        br.close();
        bw.close();
    }
}