import java.io.File;

public class Tap4 {
    public static void main(String[] args) {
        Threadm1 t1 = new Threadm1("bu" + "\n");
        Threadm2 t2 = new Threadm2("xususi" + "\n");
        Threadm3 t3 = new Threadm3("mesajdir" + "\n");

        t1.start();
        t2.start();
        t3.start(); //evvelkileri yadda saxlamire muellim burda
    }
}
