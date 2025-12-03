
import java.util.*;

class test1 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 99, 5, 4, 198, 7, 6 };
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);

        }

        System.out.println("**********");
        int n = Arrays.binarySearch(arr, 3);
        System.out.println(n);

    }
}
