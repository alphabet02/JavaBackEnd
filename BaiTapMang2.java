package btvn_buoi9;

import java.util.Scanner;

public class BaiTapMang2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        System.out.print("Nhập số a: "); int a = sc.nextInt();
        System.out.print("Nhập số b: "); int b = sc.nextInt();
        System.out.println("Số lớn hơn là: " + Math.max(a, b));


        System.out.print("\nNhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // 2
        double tongLe = 0; int demLe = 0;
        for (int x : arr) {
            if (x % 2 != 0) { tongLe += x; demLe++; }
        }
        System.out.println("TBC số lẻ: " + (demLe == 0 ? "Không có số lẻ" : (tongLe / demLe)));

        // 3 4
        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Phần tử lớn nhất: " + max);
        System.out.println("Phần tử nhỏ nhất: " + min);

        // 5
        double tongCaMang = 0;
        for (int x : arr) tongCaMang += x;
        System.out.println("tbc cả mảng: " + (tongCaMang / n));

        // 6
        int demChan = 0;
        for (int x : arr) if (x % 2 == 0) demChan++;
        System.out.println("Số lượng số chẵn: " + demChan);

        // 7
        int am = 0, duong = 0, zero = 0;
        for (int x : arr) {
            if (x > 0) duong++; else if (x < 0) am++; else zero++;
        }
        System.out.println("Số dương: " + duong + ", Số âm: " + am + ", Số 0: " + zero);

        // 8 9
        System.out.print("Phần tử ở vị trí chỉ số chẵn: ");
        for (int i = 0; i < n; i += 2) System.out.print(arr[i] + " ");
        
        System.out.print("Phần tử ở vị trí chỉ số lẻ: ");
        for (int i = 1; i < n; i += 2) System.out.print(arr[i] + " ");

        // 10
        System.out.print("Phần tử đầu tiên > 10: ");
        boolean timThay10 = false;
        for (int x : arr) {
            if (x > 10) { System.out.println(x); timThay10 = true; break; }
        }
        if (!timThay10) System.out.println("Không có phần tử nào > 10");

        // 11
        System.out.print("Nhập giá trị x cần đếm: ");
        int xTim = sc.nextInt();
        int demX = 0;
        for (int val : arr) if (val == xTim) demX++;
        System.out.println("Số lần " + xTim + " xuất hiện: " + demX);

        // 12
        System.out.print("12. Nhập giá trị cần kiểm tra tồn tại: ");
        int tonTai = sc.nextInt();
        boolean isExist = false;
        for (int val : arr) if (val == tonTai) { isExist = true; break; }
        System.out.println("Kết quả: " + (isExist ? "Có tồn tại" : "Không tồn tại"));

        sc.close();
    }
}