package btvn_buoi6;

import java.util.Scanner;

public class BtvnBuoi6ApplicationTiepTheo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dem1 = 0;
		while(dem1 <=100) {
			if(dem1%2==1) {
				System.out.println(dem1 + " la so le");
			}
			dem1++;
		}
		
		System.out.println("nhap n:");
		int n = scanner.nextInt();
		int soChan = 0;
		int sum = 0;
		while(soChan < n) {
			sum += soChan;
			System.out.println(soChan);
			soChan += 2;
		}
		System.out.println("tong la: " + sum);
		
		int sum1 = 0;
		for (int i = 0; i < n; i+=2) {
			System.out.println(i);
			sum1+=i;
		}
		System.out.println(sum1);
		
		int dem = 0;
		for(int i =0; i < 1000; i++) {
			if(i%3==0) {
				dem ++;
			}
		}
		System.out.println("co tong cong " + dem + " so chia het cho 3");
	}

}
