package btvn_buoi5;

import java.util.Scanner;

public class BtvnBuoi5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//BÀI 1.1
		System.out.println("nhap vao so thu 1");
		int so1 = scanner.nextInt();
		System.out.println("nhap vao so thu 2");
		int so2= scanner.nextInt();
		int max = so1 > so2 ? so1:so2;
		System.out.println("so lon nhat la: "+ max);		
		
		//BÀI 1.2
		System.out.println("nhap vao so thu 1");
		int soA = scanner.nextInt();
		System.out.println("nhap vao so thu 2");
		int soB= scanner.nextInt();
		System.out.println("nhap vao so thu 3");
		int soC = scanner.nextInt();
		int temp = 0;
		if(soA > soB) {
			temp = soA; soA = soB; soB = temp;
		}
		if(soA > soC) {
			temp = soA; soA = soC; soC = temp;
		}
		if(soB > soC) {
			temp = soB; soB = soC; soC = temp;
		}
		System.out.println(soA + "; " + soB + "; " + soC);
		
	    //Bài 1.3
		System.out.println("nhap vao so thu 1");
		int soA = scanner.nextInt();
		System.out.println("nhap vao so thu 2");
		int soB= scanner.nextInt();
		System.out.println("nhap vao so thu 3");
		int soC = scanner.nextInt();
		int temp = 0;
		if(soA > soB) {
			temp = soA; soA = soB; soB = temp;
		}
		if(soA > soC) {
			temp = soA; soA = soC; soC = temp;
		}
		if(soB > soC) {
			temp = soB; soB = soC; soC = temp;
		}
		System.out.println("1: tang dan / 2: giam dan ");
		int id = scanner.nextInt();
		switch (id) {
		case 1:
			System.out.println(soA + "; " + soB + "; " + soC);
			break;
		case 2:
			System.out.println(soC + "; " + soB + "; " + soA);
			break;
		default: 
			System.out.println("nhap sai yeu cau");
		}	
		
		//Bài 1.4
		System.out.println("nhap so co 2 chu so: ");
		int so = scanner.nextInt();	
		int chuc = so / 10;
		int donVi = so % 10;
		
		System.out.println("cach doc cua so tren la: ");
		switch (chuc) {
		case 0:
			break;
		case 1:
			System.out.print("mười");
			break;
		case 2:
			System.out.print("hai mươi");
			break;
		case 3:
			System.out.print("ba mươi");
			break;
		case 4:
			System.out.print("bốn mươi");
			break;
		case 5:
			System.out.print("năm mươi");
			break;
		case 6:
			System.out.print("sáu mươi");
			break;
		case 7:
			System.out.print("bảy mươi");
			break;
		case 8:
			System.out.print("tám mươi");
			break;
		case 9:
			System.out.print("chín mươi");
			break;
		}
		switch(donVi) {
		case 0:
			break; 
		case 1:
			if(chuc > 1) {
			System.out.println(" mốt");
			}else System.out.println("một");
			break;
		case 2:
			System.out.println("hai");
			break;
		case 3:
			System.out.println("ba");
			break;
		case 4:
			System.out.println("bốn");
			break;
		case 5:
			System.out.println("năm");
			break;
		case 6:
			System.out.println("sáu");
			break;
		case 7:
			System.out.println("bảy");
			break;
		case 8:
			System.out.println("tám");
			break;
		case 9:
			System.out.println("chín");
			break;

		}
		
		
		
		//BÀi 1.5
		System.out.println("ban la ai");
		String id = scanner.nextLine();
		switch (id) {
		case "B":
			System.out.println("chao bo");
			break;
		case "M":
			System.out.println("chao me");
			break;
		case "A":
			System.out.println("chao anh gai");
			break;
		case "E":
			System.out.println("chao em gai");
			break;
		default:
			System.out.println("ko co thanh vien");
		}
		
		
		//BÀI 2: XẾP LOẠI SINH VIÊN
		System.out.println("nhap ho va ten: ");
		String hoVaTen = scanner.nextLine();
		System.out.println("nhap diem toan");
		double toan = scanner.nextDouble();
		System.out.println("nhap diem ly");
		double ly = scanner.nextDouble();
		System.out.println("nhap diem hoa");
		double hoa = scanner.nextDouble();
		double trungBinh = (toan + ly + hoa)/3;
		
		if(trungBinh >=8.5) {
			System.out.println("gioi");
		}else if(trungBinh <8.5 && trungBinh >= 6.5) {
			System.out.println("kha");
		}else if(trungBinh <6.5 && trungBinh >=5.0) {
			System.out.println("trung binh");
		}else {
			System.out.println("yeu");
		}
		
		System.out.println("chuong trinh ket thuc");
}
}
