package Baitaptuan3;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double sothu1 = scanner.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double sothu2 = scanner.nextDouble();
        // Hiển thị menu lựa chọn phép toán
        System.out.println("1.Cộng");
        System.out.println("2.Trừ");
        System.out.println("3.Nhân");
        System.out.println("4.Chia");
        System.out.println("Chọn phép toán:");
        // Nhập lựa chọn của người dùng
        int choice = scanner.nextInt();
        
        double ketqua;

        switch (choice) {
            case 1:
                ketqua = sothu1 + sothu2;
                System.out.println("Kết quả: " + ketqua);
                break;
            case 2:
            	ketqua= sothu1 - sothu2;
                System.out.println("Kết quả: " + ketqua);
                break;
            case 3:
                ketqua = sothu1 * sothu2;
                System.out.println("Kết quả: " + ketqua);
                break;
            case 4:
                if (sothu2 != 0) {
                    ketqua = sothu1 / sothu2;
                    System.out.println("Kết quả: " + ketqua);
                } else {
                    System.out.println("Không thể chia cho 0.");
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
        scanner.close();
    }
}