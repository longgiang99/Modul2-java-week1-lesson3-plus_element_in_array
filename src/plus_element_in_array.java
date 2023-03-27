import java.util.Arrays;
import java.util.Scanner;

public class plus_element_in_array {
    public static void main(String[] agrs) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can them vao: ");
        int value = scanner.nextInt();
        System.out.println("nhap vi tri can them trong mang: ");
        int index = scanner.nextInt();
        if (index < 0 || index > arr.length) {
            System.out.println("khoong co vi tri nay: " + index);
        } else {
            int[] newArr = new int[arr.length+1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
        newArr[index] = value;
            for (int i = index +1; i <newArr.length ; i++) {
                newArr[i] = arr[i -1];

            }
            System.out.println(" mang moi la: ");
            for (int i = 0; i < newArr.length; i++) {
            }
            System.out.print(Arrays.toString(newArr));

        }

    }
}
