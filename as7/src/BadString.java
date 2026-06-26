public class BadString {

    public static void main(String[] args) {
        processWord("banana");
    }

    public static void processWord(String s) {
        char c = getLastLetter(s);
        System.out.println(c);
    }

    public static char getLastLetter(String s) {
        int index = s.length();         // WRONG!
        char c = s.charAt(index);
        return c;
    }
}