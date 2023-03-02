import java.util.Scanner;

public class DAYOFMONTH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang can kiem tra:");
        int month = scanner.nextInt();

        switch (month) {
            case  2:
                System.out.println("Tháng " + month+ " có 28 or 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month+ " 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month+ " 30 ngày");
                break;
            default:
                System.out.println( + month+ " không phải tháng trong năm");


        }
    }
}
