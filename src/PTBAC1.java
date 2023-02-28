import java.util.Scanner;

public class PTBAC1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        int x;
        System.out.println("Nhap vao so a");
        a = scanner.nextInt();
        System.out.println("Nhap vao so b");
        b = scanner.nextInt();
        System.out.println("Nhap vao so c");
        c = scanner.nextInt();
        if (a == 0) {
            if (b == c) {
                System.out.println("PT vo so nghiem");
            } else {
                System.out.println("PT vo nghiem");
            }
        } else {
            x = ((c-b) / a);
            System.out.println("PT co nghiem: " + x);
        }
    }
}
