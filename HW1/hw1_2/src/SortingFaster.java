import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortingFaster {
    public static Integer[] rand_numbers() {
        Random rand = new Random();
        int upperbound = 1000000;
        int size = 100000;
        Integer arr[] =new Integer[size];
        for (int i=0; i<size; i++) {
            arr[i] = new Integer(rand.nextInt(upperbound));
        }
        return arr;

    }
    public static void main(String[] args)
    {

        Integer[] arr = rand_numbers();

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
}
