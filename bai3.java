package Baitaptuan3;
import java.util.Scanner;
public class bai3 {
		public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
		        System.out.print("Nhập hệ số bậc 2 (a): ");
		        double a = scanner.nextDouble();
		        
		        System.out.print("Nhập hệ số bậc 1 (b): ");
		        double b = scanner.nextDouble();
		        
		        System.out.print("Nhập hằng số tự do (c): ");
		        double c = scanner.nextDouble();
		        
		        // Gọi hàm giải phương trình
		        giaiPTBac2(a, b, c);
			}
			public static void giaiPTBac2(double a, double b, double c) {
			    if (a == 0) {
			        if (b == 0) {
			            System.out.println("Phương trình vô nghiệm!");
			        } else {
			            System.out.println("Phương trình có một nghiệm: x = " + (-c / b));
			        }
			    } else {
			        double delta = b * b - 4 * a * c;
			        
			        if (delta < 0) {
			            System.out.println("Phương trình vô nghiệm!");
			        } else if (delta == 0) {
			            double x1 = -b / (2 * a);
			            System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x1);
			        } else {
			            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			            System.out.println("Phương trình có hai nghiệm phân biệt:\nx1 = " + x1 + "\nx2 = " + x2);
			        }
			    }
			}
		}