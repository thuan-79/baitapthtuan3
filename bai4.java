package Baitaptuan3;
import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();
        // Gọi hàm tìm số nhỏ nhất
        double min = timSoNhoNhat(a, b, c);
        System.out.println("Số nhỏ nhất là: " + min);
    }
	public static double timSoNhoNhat(double a, double b, double c) {
	    double min = a; 

	    if (b < min) {
	        min = b; 
	    }
	    if (c < min) {
	        min = c; 
	    }
	     return min; 
	}
}