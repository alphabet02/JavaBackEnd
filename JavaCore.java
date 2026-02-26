package btvn_buoi9;

import java.util.Scanner;

public class JavaCore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        System.out.print("Nhập số thứ nhất: ");
        int n1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int n2 = scanner.nextInt();
        System.out.println("Tổng là: " + (n1 + n2));

        //2
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        System.out.println("Diện tích S = " + (dai * rong));

        //3
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.println("Thể tích V = " + (a * a * a));

        //4
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        System.out.println("Tổng từ 1 đến " + n + " là: " + tong);

        //5
        System.out.println("\n--- 6. Kiểm tra số chẵn hay lẻ ---");
        System.out.print("Nhập một số: ");
        int so = scanner.nextInt();
        if (so % 2 == 0) {
            System.out.println(so + " là số chẵn.");
        } else {
            System.out.println(so + " là số lẻ.");
        }

        //6
        System.out.println("\n--- 7. Đếm số phần tử chẵn và lẻ trong mảng ---");
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int m = scanner.nextInt();
        int[] mang = new int[m];
        int chan = 0, le = 0;

        for (int i = 0; i < m; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
            if (mang[i] % 2 == 0) {
                chan++;
            } else {
                le++;
            }
        }
        System.out.println("Kết quả: Có " + chan + " số chẵn và " + le + " số lẻ.");

    }
}