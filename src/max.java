import java.sql.SQLOutput;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = scanner.nextInt();
        System.out.println("Nhap b:");
        int b = scanner.nextInt();
        System.out.println("Nhap c:");
        int c = scanner.nextInt();

        if (a >= b) {
            if (b >= c) {
                System.out.println("So lon nhat la:" + a);
            } else {
                if (a < c) {
                    System.out.println("So lon nhat la:" + c);
                } else {
                    System.out.println("So lon nhat la:" + a);

                }
            }
        } else {
            if (b >= c) {
                System.out.println("So lon nhat la:" + b);
            } else {
                System.out.println("So lon nhat la:" + c);

            }
        }
    }
}
