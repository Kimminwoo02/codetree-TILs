import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = br.readLine();
        Integer answer = Integer.parseInt(a);
    
        if(answer < 0 ){
            bw.write(answer + "\n"+"minus");
            bw.flush();
        }
        
    }
}