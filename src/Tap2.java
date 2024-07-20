public class Tap2 extends Thread{
    public static void main(String[] args) {
        int[] arr = {3,2,1,10};

        Thread3 th3 = new Thread3(arr);
        Thread4 th4 = new Thread4(arr);

        th3.start();
        th4.start();
    }
}
