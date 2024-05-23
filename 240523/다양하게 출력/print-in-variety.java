import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Total days in Year" + "\n" + 365 + "\n" + "Circumference rate" + "\n" +3.1415926535);
        bw.flush();
    }
}