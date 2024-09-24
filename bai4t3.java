package baitaptuan3;
import java.util.Scanner;
public class bai4t3  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();
        
        double soNhoNhat = a; // Giả sử a là số nhỏ nhất
        
        if (b < soNhoNhat) {
            soNhoNhat = b;
        }
        
        if (c < soNhoNhat) {
            soNhoNhat = c;
        }
        
        System.out.printf("Số nhỏ nhất trong ba số a, b, c là: %.2f\n", soNhoNhat);
        
        scanner.close();
    }
}
