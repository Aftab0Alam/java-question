import java.util.*;

public class WordCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        String WordXount[] = s.trim().split("\\s+");
        System.out.println("number of words are " + WordXount.length);
    }
}
