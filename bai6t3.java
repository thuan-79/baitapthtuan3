package baitaptuan3;
import java.util.Scanner;
public class bai6t3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Chọn phép tính:");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");
        System.out.print("Nhập lựa chọn của bạn (1-4): ");
        int luaChon = scanner.nextInt();
        
        System.out.print("Nhập số thứ nhất: ");
        double so1 = scanner.nextDouble();
        
        System.out.print("Nhập số thứ hai: ");
        double so2 = scanner.nextDouble();
        
        boolean isValid = (luaChon >= 1 && luaChon <= 4);        
        if (isValid) {
            double ketQua;
            
            if (luaChon == 1) {
                ketQua = so1 + so2;
                System.out.printf("Kết quả của phép cộng: %.2f\n", ketQua);
            } else if (luaChon == 2) {
                ketQua = so1 - so2;
                System.out.printf("Kết quả của phép trừ: %.2f\n", ketQua);
            } else if (luaChon == 3) {
                ketQua = so1 * so2;
                System.out.printf("Kết quả của phép nhân: %.2f\n", ketQua);
            } else if (luaChon == 4) {
                if (so2 != 0) {
                    ketQua = so1 / so2;
                    System.out.printf("Kết quả của phép chia: %.2f\n", ketQua);
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                }
            }
        } else {
            System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 4.");
        }
        
        scanner.close();
    }
}
