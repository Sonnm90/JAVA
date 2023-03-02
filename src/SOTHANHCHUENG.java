import java.util.Scanner;

public class SOTHANHCHUENG {
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] groups = {"", "thousand", "million", "billion", "trillion"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        System.out.println(convertNumberToWord(number));
    }

    public static String convertNumberToWord(long number) {
        if (number == 0) {
            return "zero";
        }
        int i = 0;
        String words = "";
        while (number > 0) {
            int group = (int) (number % 1000);
            if (group > 0) {
                words = convertGroup(group) + " " + groups[i] + " " + words;
            }
            number /= 1000;
            i++;
        }
        return words.trim();
    }

    private static String convertGroup(int number) {
        String words = "";
        if (number >= 1000000000) {
            words += convertGroup(number / 1000000000) + " billion ";
            number %= 1000000000;
        }
        if (number >= 1000000) {
            words += convertGroup(number / 1000000) + " million ";
            number %= 1000000;
        }
        if (number >= 1000) {
            words += convertGroup(number / 1000) + " thousand ";
            number %= 1000;
        }
        if (number >= 100) {
            words += ones[number / 100] + " hundred ";
            number %= 100;
        }
        if (number >= 20) {
            words += tens[number / 10] + " ";
            number %= 10;
        }
        if (number > 0) {
            words += ones[number] + " ";
        }
        return words.trim();
    }
}
