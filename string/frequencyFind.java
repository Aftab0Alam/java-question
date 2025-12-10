
import java.util.*;

public class frequencyFind {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int freq[] = new int[256];
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + "->" + freq[i]);
            }
        }

    }
}