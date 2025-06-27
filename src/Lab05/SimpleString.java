package Lab05;

public class SimpleString {

    public static String longestWord(String text) {
        String[] words = text.split("[^a-zA-Zа-яА-Я0-9]+");
        String result = "";
        for (String s : words) {
            if (s.length() > result.length()) result = s;
        }
        return result;
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        StringBuilder temp = new StringBuilder(word);
        return word.equals(temp.reverse().toString());
    }

    public static String censor(String text, String source, String target) {

        return text.replaceAll(source, target);
    }

    public static int subStringCount(String str, String substr) {
        str = str.toLowerCase();
        substr = substr.toLowerCase();
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }

        return count;

    }

    public static String revers(String text) {
        String[] words = text.split(" ");
        StringBuilder tempResult = new StringBuilder();
        for (String word : words) {
            StringBuilder temp = new StringBuilder(word);
            tempResult.append(temp.reverse().toString() + " ");
        }
        return tempResult.toString();
    }
}
