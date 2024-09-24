//viet phuong trinh bac 2
package baitaptuan3;

import java.util.Scanner;


public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, denta, x, x1, x2;
        System.out.println("Nhap vao lan luot he so a b c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a==0){
            if (b==0){
                System.out.println("Phuong trinh co mot nghiem: " + c);
            }
            else{
                x = -c/b;
                System.out.println("Phuong trinh co mot nghiem: " +x);
            }
        }
        else{
            denta = b*b-a*a*c;
            if(denta<0){
                System.out.println("Phuong trinh vo nghiem");
            }
            else if(denta==0) {
                x = -b/2*a;
                System.out.println("Phuong trinh co nghiem kep = " +x);
            }
            else{
                x1 = (-b+Math.sqrt(denta))/2*a;
                x2 = (-b-Math.sqrt(denta))/2*a;
                System.out.println("Phuong trinh co hai nghiem phan biet:  " + x1 +x2);
            }
        }
    }
    
}
