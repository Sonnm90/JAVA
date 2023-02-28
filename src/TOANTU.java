import java.util.Scanner;

public class TOANTU {
    public static void main(String[] args5
    ) {
        float width;
        float height;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        width = scanner.nextFloat();
        System.out.println("Nhập chiều dài:");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("dien tich HCN là:" + area);
    }
}
