package Baitaptuan3;
import java.util.Scanner;
public class bai5 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số a: ");
    double a = scanner.nextDouble();
    System.out.print("Nhập số b: ");
    double b = scanner.nextDouble();
    System.out.print("Nhập số c: ");
    double c = scanner.nextDouble();
	if(a+b>c &&a+c>b && b+c>a) {

		if(a==b&&b==c)
			System.out.println("đây là tam giác đều");
		else{
			if(a==b||a==c||b==c) 
				System.out.println("đây là tam giác cân");
			else {
				if(Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2)||Math.pow(b,2)==Math.pow(a,2)+Math.pow(c,2)||Math.pow(c,2)==Math.pow(b,2)+Math.pow(a,2)) 
					System.out.println("đây là tam giác vuông");
				else {
					System.out.println("đây là tam giác thường");
					}
			}
		}
		}

	else {
		System.out.println("ko hợp lệ");
	}
	}
}
