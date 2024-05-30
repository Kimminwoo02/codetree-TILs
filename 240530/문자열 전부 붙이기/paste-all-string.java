import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer n = Integer.parseInt(br.readLine());
        String data = "";
        for (int i =0; i<n;i++){
            data += br.readLine();
        }

        bw.write(data);
        bw.flush();

        bw.close();
        br.close();

    }

}