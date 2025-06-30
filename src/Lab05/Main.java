package Lab05;

public class Main {
    public static void main(String[] ars) {

        //System.out.println(SimpleString.longestWord("Основную идею слияния двух отсортированных массивов можно объяснить на следующем примере. Пусть мы имеем два уже отсортированных по возрастанию подмассива. Тогда:\n" +
        //"3.2. Слияние двух подмассивов в третий результирующий массив."));

        System.out.println(SimpleString.isPalindrome("Aka"));
        System.out.println(SimpleString.censor("Привет, я не бяка.", "бяка", "[Вырезано цензурой]"));
        System.out.println(SimpleString.subStringCount("Подлодка, плавает под водой", "под"));
        System.out.println(SimpleString.revers("This is a test string"));
    }
}
