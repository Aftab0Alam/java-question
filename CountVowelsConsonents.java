import java.util.*;

class CountVowelsConsonents {
    public static void main(String[] args) {
        System.out.println("enetr  String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        int count1 = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            } else if (ch >= 'a' && ch <= 'z') {
                count1++;
            }
        }

        System.out.println("vowels are " + count);
        System.out.println("consonents are " + count1);
    }
}