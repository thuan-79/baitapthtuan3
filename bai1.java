package Baitaptuan3;

	import java.util.Scanner;

	public class bai1 {
		    public static void main(String[] args)
		    {
		        int n;
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Nhập một số: ");
		        n = scanner.nextInt();
		        if (n > 0)
		            System.out.println("Số dương");
		        else 
		        	if (n < 0)
		        		System.out.println("Số âm");       	
		        	else 
		        		System.out.println("Số 0 là số không âm không dương");
		        scanner.close(); 
		    }
		

	}
