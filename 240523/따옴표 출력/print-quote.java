import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("He says \"It's a really simple sentence\".");
        bw.flush();
    }
}