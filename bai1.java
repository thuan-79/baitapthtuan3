
package baitaptuan3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so: ");
        int so = sc.nextInt();
        if (so>0){
            System.out.println("Day la so duong");
        }
        else if (so<0){
            System.out.println("Day la so am");
        }
        else 
            System.out.println("Day la so 0");
    }
}

