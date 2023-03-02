import java.util.Scanner;

public class KTNAMNHUAN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra:");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Năm "+year+" là năm nhuận");
                } else {
                    System.out.println("Năm "+year+" không là năm nhuận");

                }
            } else {
                System.out.println("Năm "+year+" là năm nhuận");

            }
        } else {
            System.out.println("Năm "+year+" không là năm nhuận");

        }
    }
}
