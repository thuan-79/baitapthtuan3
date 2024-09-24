package baitaptuan3;
import java.util.Scanner;
public class bai2t3  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập điểm trung bình của học sinh: ");
        float diemTrungBinh = scanner.nextFloat();
        
        if (diemTrungBinh >= 8.5) {
            System.out.println("Xếp loại: Giỏi");
        } else if (diemTrungBinh >= 7) {
            System.out.println("Xếp loại: Khá");
        } else if (diemTrungBinh >= 5.5) {
            System.out.println("Xếp loại: Trung bình");
        } else {
            System.out.println("Xếp loại: Yếu");
        }
        
        scanner.close();
    }
}
