package btvn_buoi3;

import java.util.Scanner;

public class BtvnBuoi3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Bai 1
		System.out.println("BAI 1: Viet chuong trinh tinh chieu dai canh huyen cua mot tam giac vuong khi biet 2 canh goc vuong");
		System.out.println("nhap canh thu 1");
		int canh1 = scanner.nextInt();
		System.out.println("nhap canh thu 2");
		int canh2 = scanner.nextInt();
		double canhHuyen = Math.sqrt(Math.pow(canh1, 2) + Math.pow(canh2, 2));
		System.out.println("ket qua bai 1 la " + canhHuyen);
		System.out.println();
		System.out.println();
		
		//Bai 2
		System.out.println("BAI 2: Viet chuong trinh tinh gia tri don thuc P(x) = a.x^n voi x = 8 cho truoc");
		System.out.println("nhap a");
		double a = scanner.nextInt();
		System.out.println("nhap n");
		double n = scanner.nextInt();
		int x = 8;
		double giaTriDonThuc = a * Math.pow(x,n);
		System.out.println("gia tri don thuc la: " + giaTriDonThuc);
		System.out.println();
		System.out.println();
		
		//Bai 3
		System.out.println("Bai 3: viet chuong trinh nhap vao so nguyen duong co 2 chu so, tinh tong cua 2 chu so cua so nguyen duong do");
		System.out.println("nhap so nguyen");
		int soNguyen = scanner.nextInt();
	    int hangDonVi = soNguyen % 10;
	    int hangChuc = soNguyen / 10;
	    int tong = hangDonVi + hangChuc;
	    System.out.println("ket qua la: " + tong);
	    System.out.println();
		System.out.println();
		
		//Bai 4: Cach 1
		System.out.println("Bai 4: tinh gia tri trung binh cua 5 so duoc nhap tu ban phim (su dung hang so, bien tich luy, toan tu +=");
		int tong4 = 0;
		int conSo = 0;
		int soLuong = 5;
		System.out.println("hay nhap 5 so");
	    for (int i = 0; i < soLuong; i++) {
	    	conSo = scanner.nextInt();
	    	tong4 += conSo;
	    }
	    double ketQua4 = tong4 / soLuong;
	    System.out.println("ket qua la" + ketQua4);
	    System.out.println();
		System.out.println();
		
		//Bai 4: Cach 2
		int tong4 = 0;
		System.out.println("hay nhap so1 ");
		int so1 = scanner.nextInt();
		tong4 += so1;
		System.out.println("hay nhap so2 ");
		int so1 = scanner.nextInt();
		tong4 += so2;
		System.out.println("hay nhap so3 ");
		int so1 = scanner.nextInt();
		tong4 += so3;
		System.out.println("hay nhap so4 ");
		int so1 = scanner.nextInt();
		tong4 += so4;
		System.out.println("hay nhap so5 ");
		int so1 = scanner.nextInt();
		tong4 += so5;
				
		
		//Bai 5
		System.out.println("Bai 5: Nhap vao do C -> doi sang do F: F=(C*1.8)+32");
		System.out.println("hay nhap do C");
		double C = scanner.nextDouble();
		double F = (C*1.8)+32;
		System.out.println("ketqua la: " + F);
	    System.out.println();
		System.out.println();
		
		//Bai 6
		System.out.println("Bai 6: Nhap vao do USD -> doi sang VND voi ty gia 23500");
		System.out.println("hay nhap usd");
		double usd = scanner.nextDouble();
		double vnd = usd * 23500;
		System.out.println("ketqua la: " + vnd);
	    System.out.println();
		System.out.println();
	}
	
	

}
