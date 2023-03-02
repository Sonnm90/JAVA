public class VEHINH {
    public static void main(String[] args) {
//        int n = 5;
//        for (int i = n / 2; i <= n; i += 2) {
//            for (int j = 1; j < n - i; j += 2) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = n; i >= 1; i--) {
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (i * 2) - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
