import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer one = 0;
        Integer two = 0;
        Integer three = 0;
        Integer four = 0;
        Integer five = 0;
        Integer six = 0;        
        
        while(st.hasMoreTokens()){
            Integer val = Integer.parseInt(st.nextToken());
            if (val == 1){
                one++;
            }
            else if (val == 2){
                two++;
            }
            else if (val == 3){
                three++;
            }
            else if (val == 4){
                four++;
            }
            else if (val == 5){
                five++;
            }
            else {
                six++;
            }
         
        }
            bw.write("1 - "+ one +"\n");
            bw.write("2 - "+ two +"\n");
            bw.write("3 - "+ three +"\n");
            bw.write("4 - "+ four +"\n");
            bw.write("5 - "+ five +"\n");
            bw.write("6 - "+ six +"\n");
            bw.flush();
        bw.close();
        br.close();

        
    }
}