public class Thread4 extends Thread{

    private int[] arr;

    public Thread4(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int c = 0;
        for (int i = 0; i < arr.length; i++){
            c+=arr[i];
        }
        System.out.println("cem = " + c);
    }
}
