
package baitaptuan3;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon phep toan: ");
        System.out.println("1.Cong");
        System.out.println("2.Tru");
        System.out.println("3.Nhan");
        System.out.println("4.Chia");
        System.out.println("Nhap lua chon cua ban: ");
        int luachon = sc.nextInt();
        System.out.println("Nhap so thu nhat: ");
        double so1 = sc.nextDouble();
        System.out.println("Nhap so thu hai: ");
        double so2 =sc.nextDouble();
        switch (luachon){
            case 1: System.out.println("Ket qua " + (so1 +so2));
            break;
            case 2: System.out.println("Ket qua " + (so1-so2));
            break;
            case 3: System.out.println("Ket qua " + (so1*so2));
            break;
            case 4: 
                if(so2==0){
                    System.out.println("Khong the tinh");
                }
                else
                    System.out.println("Ket qua " + (so1/so2));
            break;
            default: System.out.println("Lua chon khong hop le");
        }
        
    }
    
}
