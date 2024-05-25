import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[10];
        for(int i =0; i<10;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(arr[2] + arr[4] + arr[9] + "");
        bw.flush();

        bw.close();
        br.close();
    }
}