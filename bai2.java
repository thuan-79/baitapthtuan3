package baitaptuan3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dtb;
        System.out.println("Nhap vao diem trung binh: ");
        dtb = sc.nextDouble();
        if (dtb>=8.5)
        {
            System.out.println("Loai gioi");
        }
        else if (dtb>=7)
                System.out.println("Loai kha");
        else if (dtb>=5)
            System.out.println("Loai trung binh");
        else if (dtb>=4)
            System.out.println("Loai yeu");
        else 
            System.out.println("Loai kem");
    }
}
