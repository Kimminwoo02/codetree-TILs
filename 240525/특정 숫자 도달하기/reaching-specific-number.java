import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer total = 0;
        Double avg = 0.0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(true){
            String data = st.nextToken();
            Integer res = Integer.parseInt(data);
            if( res >= 250){
                break;
            }
            else{
                total += res;
                avg += 1.0;
            }
            
        }

        bw.write(total +" " + Math.round(total/avg * 10.0) / 10.0);
        bw.flush();

        bw.close();
        br.close();    
    }
}