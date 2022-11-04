import java.util.Random;

public class Sorting {
    public static int[] rand_numbers() {
        Random rand = new Random();
        int upperbound = 1000000;
        int size = 100000;
        int arr[] =new int[size];
        for (int i=0; i<size; i++) {
            arr[i] = rand.nextInt(upperbound);
        }
        return arr;

    }
    public static void main(String[] args)
    {

        int arr[] = rand_numbers();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.print(arr[i] + " ");
        }
    }
}
