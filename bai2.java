package Baitaptuan3;
import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
        int dtb;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm trung bình: ");
        dtb = scanner.nextInt();
        if (dtb >=8)
            System.out.println("Giỏi");
        else 
        	if (dtb >=7)
        		System.out.println("Khá");       	
        	else 
        		if (dtb >=5)
            		System.out.println("Trung bình");       	
            	else
        		System.out.println("Yếu");
        scanner.close(); 
}
}