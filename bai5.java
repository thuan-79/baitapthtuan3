
package baitaptuan3;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhap vao do dai ba canh: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a){
            System.out.println("Ba canh nhap vao tao thanh mot tam giac");
            if(a==b && b==c){
                System.out.println("Day la tam giac deu");
            }
            else if(a==b || b==c || c==a){
                System.out.println("Day la tam giac can");
            }
            else{
                if((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)){
                    System.out.println("Day la tam giac vuong");
                }
            }
        }
        else
            System.out.println("Day khong phai la mot tam giac");
    }
}
