public class Thread3 extends Thread{

    private int[] arr;

    public Thread3(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
