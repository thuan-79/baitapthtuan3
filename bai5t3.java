package baitaptuan3;
import java.util.Scanner;
public class bai5t3  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();
        
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba cạnh nhập vào tạo thành một tam giác.");
            if (a == b && b == c) {
                System.out.println("Loại tam giác: Đều.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Loại tam giác: Cân.");
            } else {
                if (isVuong(a, b, c)) {
                    System.out.println("Loại tam giác: Vuông.");
                } else {
                    System.out.println("Loại tam giác: Thường.");
                }
            }
        } else {
            System.out.println("Ba cạnh nhập vào không tạo thành một tam giác.");
        }
        
        scanner.close();
    }
    private static boolean isVuong(double a, double b, double c) {
        return (a * a + b * b == c * c) || 
               (a * a + c * c == b * b) || 
               (b * b + c * c == a * a);
    }
}
