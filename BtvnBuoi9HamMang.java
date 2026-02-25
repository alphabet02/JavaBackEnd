package btvn_buoi9;

import java.util.Scanner;

public class BtvnBuoi9HamMang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so luong phan tu cua mang 1");
		int soPhanTu = scanner.nextInt();
		if (soPhanTu <= 0) {
			System.out.println("vui long nhap so lon hon 0");
			return ;
		}
		int [] mang = new int [soPhanTu];
		for(int i = 0; i < soPhanTu; i++) {
			System.out.println("nhap phan tu thu " + i);
			mang[i] = scanner.nextInt(); 
		}
		
		System.out.println("nhap so luong phan tu cua mang 2");
		int soPhanTu2 = scanner.nextInt();
		if (soPhanTu <= 0) {
			System.out.println("vui long nhap so lon hon 0");
			return ;
		}
		int [] mang2 = new int [soPhanTu2];
		for(int i = 0; i < soPhanTu2; i++) {
			System.out.println("nhap phan tu thu "+ i);
			mang2[i] = scanner.nextInt();
		}
				
		System.out.println("nhap phan tu muon xoa");
		int pTuMuonXoa = scanner.nextInt();
				
		
		System.out.println("nhap so lan muon xoay mang ");
		int k = scanner.nextInt();
		
		
		TongCacPhanTuTrongMang(mang); 
		GiaTriLonNhatTrongMang(mang);
		GiaTriNhoNhatTrongMang(mang);
		DemChanLeTrongMang(mang);
		DaoNguocMang(mang);
		KiemTraPhanTu(mang);
		TinhTrungBinhSoLe(mang);
		TinhTrungBinh(mang);
		DemSoLanXuatHien(mang);
		SapXepMangBubbleSort(mang);
		KetNoiMang(mang,mang2);
		XoaPhanTuTrongMang(mang, pTuMuonXoa);
		KiemTraSoNguyenToTrongMang(mang);
		PhanTuXuatHienNhieuNhat(mang);
		TachMangChanLe(mang);
		XoayMangKLan(mang, k);
		KtraMangDoiXung(mang);
		KetNoi_KiemTraTrungLap(mang, mang2);
		
	}
	
	public static void TongCacPhanTuTrongMang(int [] mang) {
		int sum = 0;
		for(int i=0; i<mang.length; i++) {
			sum+=mang[i];
		}
		System.out.println(sum);
	}
	public static void GiaTriLonNhatTrongMang(int [] mang) {
		int max = mang[0];
		for(int i=1; i<mang.length; i++) {
			if(mang[i] > max) max = mang[i];
		}
		System.out.println(max);
	}
	public static void GiaTriNhoNhatTrongMang(int [] mang) {
		int min = mang[0];
		for(int i=1; i<mang.length; i++) {
			if(mang[i] < min) min = mang[i];
		}
		System.out.println(min);
	}
	public static void DemChanLeTrongMang(int [] mang) {
		int chan = 0;
		int le = 0;
		for(int i=0; i<mang.length; i++) {
			if(mang[i] % 2 == 0) chan ++;
			else le ++;
		}
		System.out.println("tong chẵn: " + chan);
		System.out.println("tong lẻ: " + le);
	}
	public static void DaoNguocMang(int [] mang) {
		int [] mangThayThe = new int [mang.length];

		for(int i=0; i<mang.length; i++) {
			mangThayThe[i] = mang[mang.length-1-i];
		}
		for(int i = 0; i<mang.length;i++)
		{
			System.out.println(mangThayThe[i]+ " ");
		}
	}
	
	public static boolean KiemTraPhanTu(int [] mang) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap phan tu muon kiem tra: ");
		int so = scanner.nextInt();
		for(int item: mang) {
			if(item  == so) return true;
		}
		return false;
	}
	
	public static void TinhTrungBinh(int [] mang) {
		double sum = 0;
		for(int item: mang) {
			sum+= item;
		}
		System.out.println(sum/mang.length);
		
	}
	public static void TinhTrungBinhSoLe(int [] mang) {
		double sum = 0;
		double count = 0;
		for(int item: mang) {
			if(item % 2 == 1) {
				sum+= item;
				count ++;
			}
		}
		System.out.println("trung binh cac so le" + sum/count);
		
	}
	
	public static void DemSoLanXuatHien(int [] mang) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap phan tu muon kiem tra lan xuat hien: ");
		int so = scanner.nextInt();
		double xuatHien = 0;
		for(int item: mang) {
			if(item == so) xuatHien ++;
		}
		System.out.println("so lan xuat hien la: " + xuatHien);
		
	}
	
	public static void KetNoiMang(int [] mang, int [] mang2) {
		int soPhanTu3 = mang.length + mang2.length;
		int [] mang3 = new int [soPhanTu3];
		for(int i = 0; i < mang.length; i++) {
			mang3[i] = mang[i];
		}
		for(int i = 0; i < mang2.length; i ++) {
			mang3[i + mang.length] = mang2[i]; 
		}
		
		System.out.println("mang sau khi gop: ");
		for(int item: mang3) {
			System.out.println( item+ " ");
		}
	}
	
	public static void SapXepMangBubbleSort(int [] mang) {
	    int n = mang.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (mang[j] > mang[j + 1]) {
	                int temp = mang[j];
	                mang[j] = mang[j + 1];
	                mang[j + 1] = temp;
	            }
	        }
	    }
	}
	
	public static void XoaPhanTuTrongMang(int [] mang, int x) {
		int count = 0;
		for (int item: mang ) {
			if (item == x) count ++;
		}
		
		int soPhanTuMangMoi = mang.length - count;
		int [] mangmoi = new int [soPhanTuMangMoi];
		int index = 0;
		for (int i = 0; i<mang.length; i++) {
			if (mang[i] != x) {
				mangmoi[index] = mang[i];
				index ++;
			}
		}
		
		for(int item: mangmoi) {
			System.out.println(item + " ");
		}
	}
	
	public static void ThemPhanTuTrongMang(int [] mang, int viTri, int x) {
		int soPhanTuMangMoi = mang.length + 1;
		int [] mangmoi = new int [soPhanTuMangMoi];
		
		for (int i = 0, j = 0; i< viTri; i++) {
			mangmoi[i] = mang [i];
		}
		
		mangmoi[viTri] = x;
		
		for (int i = viTri; i < mang.length; i++)
			mangmoi[i+1] = mang[i];
		for(int item: mangmoi) {
			System.out.println(item + " ");
		}
	}
	
	public static void KiemTraSoNguyenToTrongMang( int [] mang) {
		System.out.println("cac so nguyen to la: ");
		for(int item: mang) {
			if (KiemTraSoNguyenTo(item)) {
				System.out.println(item + " ");
			}
		}
	}
	
	public static boolean KiemTraSoNguyenTo(int x) {
		if(x < 1) return false;
		for(int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                System.out.println("ko phai so nguyen to");
               return false;
            }
        }
		return true;
	}
	
	public static void PhanTuXuatHienNhieuNhat(int [] mang) {
		int max = 0;
		int giaTriXuatHienNhieuNhat = mang[0] ;
		for ( int i = 0; i < mang.length; i++) {
			int dem = 0;
			for(int j = 0; j < mang.length; j++) {
				if (mang[j] == mang[i]) dem ++;
			}
			
			if (dem > max) {
				max = dem;
				giaTriXuatHienNhieuNhat = mang[i];
			}
		}
		System.out.println(giaTriXuatHienNhieuNhat + "Xuat hien nhieu nhat voi: " + max + " lan");
		
		
	}
	
	public static void TachMangChanLe(int [] mang) {
		int chan = 0;
		int le = 0;
		for(int item: mang) {
			if(item % 2 == 0) chan ++;
			else le ++;
		}
		
		int [] mangChan = new int [chan];
		int [] mangLe = new int [le];
		int i = 0;
		int j = 0;
		
		for(int item: mang) {
			if(item % 2 == 0) {
				mangChan[i++] = item;
			}else mangLe[j++] = item;
		}
		System.out.println("mang chan: ");
		for(int item: mangChan) {
			System.out.println(item + " ");
		}
		
		System.out.println("mang le: ");
		for(int item: mangLe) {
			System.out.println(item+ " ");
		}
	}
	
	public static void XoayMangKLan(int [] mang, int k) {
		int n = mang.length;
		if (k > n) {
			k = k % n;
		}
		int [] mangMoi = new int [n];
		for(int i = 0; i < n; i++) {
			mangMoi[(i+k)% n] = mang[i];
		}
		
		for(int item: mangMoi) {
			System.out.println(item + " ");
		}
	}
	
	
	public static int KtraMangDoiXung(int [] mang) {
		int dau = 0;
		int duoi = mang.length - 1;
		while (dau < duoi) {
			if(mang[dau] != mang[duoi]) {
				System.out.println("Mang khong doi xung");
				return 0;
			}
			dau ++;
			duoi++;
		}
		
	System.out.println("mang doi xung");
	return 0;
		
	}
	
	public static void KetNoi_KiemTraTrungLap(int [] mang1, int [] mang2) {
		
		List<Integer> mangMoi = new ArrayList<>();
	    for (int x : mang1) {
	        if (!mangMoi.contains(x)) {
	            mangMoi.add(x);
	        }
	    }
	    for (int x : mang2) {
	        if (!mangMoi.contains(x)) {
	            mangMoi.add(x);
	        }
	    }
	    System.out.println(mangMoi);
	}
	
	
	
	

}
