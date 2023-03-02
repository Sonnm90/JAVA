import java.util.Scanner;

public class SONGUYENTO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap số lượng số cần in:");
        int n = sc.nextInt();
        int c = 0;
        int x = 2;
        boolean check = true;
        String arr = "";
        while (c < n) {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    check = false;
                }
            }
            if (check) {
                c++;

                arr += x + " ";
            }
            x++;
            check = true;
        }
        System.out.println(arr);
    }
}
