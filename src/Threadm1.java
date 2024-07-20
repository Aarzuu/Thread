import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Threadm1 extends Thread{

    private String message;

    public Threadm1( String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            FileWriter fw = new FileWriter("file.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(message);
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
