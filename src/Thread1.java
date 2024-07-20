public class Thread1 extends Thread{

    @Override
    public void run() {
        int a = 0;
        while (a<20){
            System.out.println(a);
            a+=2;
        }
    }
}
