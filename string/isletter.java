public class isletter {

    public static void main(String[] args) {
        char c = 'A';
        System.out.println(isLetter(c)); // Output: true
    }

    public static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');

    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean isWhitespace(char c) {
        return c == ' ' || c == '\t' || c == '\n' || c == '\r';
    }

    public static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isAlphanumeric(char c) {
        return isLetter(c) || isDigit(c);
    }

    public static boolean isSpecialCharacter(char c) {
        return !isAlphanumeric(c) && !isWhitespace(c);
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static boolean isConsonant(char c) {
        return isLetter(c) && !isVowel(c);
    }

    public static boolean isPunctuation(char c) {
        return "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".indexOf(c) != -1;
    }

    public static boolean isSymbol(char c) {
        return "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".indexOf(c) != -1;
    }

}
