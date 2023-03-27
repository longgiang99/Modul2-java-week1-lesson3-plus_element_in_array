import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 5,5, 6, 6};
        int index = 3;
        for (int i = arr.length - 2; i > index; i--) {
            arr[i +1] = arr[i];

        }
        arr[index] = 10;
        System.out.println(Arrays.toString(arr));
    }

}