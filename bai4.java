
package baitaptuan3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, min;
        System.out.println("Nhap vao lan luot ba so: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        min = a;
        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        System.out.println("So nho nhat trong ba so la: " + min);
    }
}
