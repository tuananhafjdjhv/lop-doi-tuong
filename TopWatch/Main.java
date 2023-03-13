package TopWatch;

public class Main {
    public static void main(String[] args) {
        int[] time = new int[10000];
TopWatch topWatch = new TopWatch();
topWatch.start();
        System.out.println("Thoi gian bat dau");
        selectionSort(time);
        topWatch.stop();
        System.out.println("Thoi gian ket thuc");
        System.out.println("Thoi gian da troi qua :" + topWatch.getElapsedTime());
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
           int min_id = i;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < array[min_id])
                    min_id = j;
                int temp = array[min_id];
                array[min_id] = array[i];
                array[i] = temp;
            }
        }

    }
}
