package btvn_buoi6;

import java.util.Scanner;
import java.util.Random;

public class BtvnBuoi6Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random generator = new Random ();
		int thang = 0;
		int thua = 0;
		int hoa = 0;
		int luaChon;
		int playerChoice;
		System.out.println("chao mung den voi tro choi oanh du xi");
		do {
			System.out.println("nhap lua chon cua ban: 1.keo; 2.bua; 3.bao");
			playerChoice = scanner.nextInt();
			
			int bot = generator.nextInt(3) + 1; 
            String botChon = (bot == 1) ? "Kéo" : (bot == 2) ? "Búa" : "Bao";
            System.out.println("lua chon cua bot la "+ botChon);
            
            switch (playerChoice) {
            	case 1:
            		if(bot == 1) {
            			System.out.println("hoa");
            			hoa +=1;
            		}else if(bot == 2) {
            			System.out.println("thua");
            			thua +=1;
            		}else {
            			System.out.println("thắng");
            			thang +=1;
            		} break;
            	case 2:
            		if(bot == 1) {
            			System.out.println("thắng");
            			thang +=1;
            		}else if(bot == 2) {
            			System.out.println("hòa");
            			hoa +=1;
            		}else {
            			System.out.println("thua");
            			thua +=1;
            		} break;
            	case 3:
            		if(bot == 1) {
            			System.out.println("thua");
            			thua += 1;
            		}else if(bot == 2) {
            			System.out.println("thắng");
            			thang += 1;
            		}else {
            			System.out.println("hòa");
            			hoa += 1;
            		} break;
            	default:
            		System.out.println("ko co lua chon nao");
            	
            }
			System.out.println("muon choi tiep khong ?: nhap 0 de out game");
			luaChon = scanner.nextInt();
		}while(luaChon != 0);
		System.out.println("thắng: " + thang +  " thua: " + thua + " hòa: " + hoa);
		
		// Bai 2
		int n = 0;
		int sum = 0;
		while(sum <= 10000) {
			n++;
			sum += n;
		}
		System.out.println("n la: " + n);
		System.out.println("tong tim duoc la: " + sum);
		
		//Bai 3
		int a = 0;
		int sum1 = 0;
		int m;
		do {
			System.out.println("nhap so nguyen m ");
			m = scanner.nextInt();
			if(m<0) System.out.println("nhap lai di");
		}while(m < 0);
		
		do {
			System.out.println(a);
			if (a%2==1) a++;
			sum1 += a;
			
		}while (a < m);
		System.out.println(sum1);
		
		//Bài 4
		int n = 0;
		int x;
		int sum = 0;
		System.out.println("hãy nhập n ");
		n = scanner.nextInt();
		System.out.println("hay nhập x: ");
		x = scanner.nextInt();
		for(int i = 0; i<=n;i++) {
			sum += Math.pow(x, i);
		}
		System.out.println("Tổng là: " + sum);
		
		//Bài 5
		System.out.println("nhap so tien muon gui");
		double tienGui = scanner.nextDouble();
		System.out.println("gia tien chiec xe");
		double tienXe = scanner.nextDouble();
		System.out.println("lai xuat");
		double laiXuat = scanner.nextDouble() / 100;
		int nam = 0;
		while (tienGui < tienXe) {
			tienGui += tienGui + (tienGui * laiXuat);
			nam++;
		}
		System.out.println("so nam phai doi la: "+ nam);
		
	}

}
