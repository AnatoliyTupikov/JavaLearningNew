package Lab04.Part1;


import java.util.Scanner;

public class SimpleMath {

    public static void oddHundret() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }

    public static void threeFive() {
        String three = "Делится на 3:";
        String five = "Делится на 5:";
        String three_and_five = "Делится на 3 и на 5:";
        for (int i = 1; i <= 100; i++) {
            boolean isThree = i % 3 == 0;
            boolean isFive = i % 5 == 0;
            if (isThree) three += " " + i;
            if (isFive) five += " " + i;
            if (isThree && isFive) three_and_five += " " + i;
        }
        System.out.println(three + "\n" + five + "\n" + three_and_five + "\n");
    }

    private static int[] getValuesFromUser() {
        var scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int second = scanner.nextInt();

        System.out.print("Введите третье целое число: ");
        int third = scanner.nextInt();

        return new int[]{first, second, third};
    }

    public static void isSumm() {

        var data = getValuesFromUser();
        System.out.println("Результат: " + ((data[0] + data[1]) == data[2]));
    }

    public static void isHiger() {
        var data = getValuesFromUser();
        System.out.println("Результат: " + (data[1] > data[0] && data[2] > data[1]));
    }

    private static void showArray(int[] digits) {
        String dig = "";
        for (int i = 0; i < digits.length; i++) {
            if (i == 0) {
                dig += " " + digits[i];
                continue;
            }
            dig += " ," + digits[i];
        }
        System.out.println("array =" + dig);
    }

    public static boolean isThreeInArray(int... digits) {
        if (digits.length < 2) {
            System.out.println("The array is too short. It needs the array has at least two elements");
            return false;
        }
        //showArray(digits);
        return digits[0] == 3 || digits[(digits.length - 1)] == 3;
    }

    public static boolean oneOrThree(int... digits) {
        //showArray(digits);
        boolean result = false;
        for (int i : digits) {
            if (i == 3 || i == 1) {
                result = true;
                break;
            }

        }
        return result;


    }
}
