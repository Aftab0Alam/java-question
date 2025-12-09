
import java.util.*;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        int i = 0;
        int j = s.length() - 1;
        boolean isPallindrome = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPallindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPallindrome ? "pallindrome" : "not pallindrome");
    }
}
