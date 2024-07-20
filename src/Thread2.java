public class Thread2 extends Thread{

    @Override
    public void run() {
        int a = 1;
        while (a<19){
            System.out.println(a);
            a+=2;
        }
    }
}
