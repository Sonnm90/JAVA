import java.util.Scanner;
public class SOTHANHCHU {
    private static final String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};
    private static final String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
    private static final String[] groups = {"", "nghìn", "triệu", "tỷ"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        long number = scanner.nextLong();
        System.out.println(convertNumberToWord(number));
    }

    public static String convertNumberToWord(long number) {
        if (number == 0) {
            return "Không";
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
        int onesDigit = number % 10;
        int tensDigit = (number % 100) / 10;
        int hundredsDigit = number / 100;
        if (hundredsDigit > 0) {
            words = ones[hundredsDigit] + " trăm";
        }
        if (tensDigit > 0) {
            if (tensDigit == 1 && onesDigit > 0) {
                words += " " + ones[10 + onesDigit];
            } else {
                words += " " + tens[tensDigit];
                if (onesDigit > 0) {
                    words += " " + ones[onesDigit];
                }
            }
        } else if (onesDigit > 0) {
            words += " " + ones[onesDigit];
        }
        return words.trim();
    }
}
