package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Phanso ps1 = new Phanso();
        Phanso ps2 = new Phanso();
        Phanso psc = new Phanso();

        // Nhập hai phân số
        System.out.println("\tNhap so thu 1:");
        ps1.nhapPS(sc);

        System.out.println("\tNhap so thu 2:");
        ps2.nhapPS(sc);

        // Hiển thị phân số vừa nhập
        System.out.println("\tHai phan so vua nhap:");
        ps1.hienthiPs();
        ps2.hienthiPs();

        int chon;
        do {
            System.out.println("1. Cong 2 phan so");
            System.out.println("2. Tru 2 phan so");
            System.out.println("3. Nhan 2 phan so");
            System.out.println("4. Chia 2 phan so");
            System.out.println("5. Kiem tra phan so da toi gian hay chua");
            System.out.println("6. Toi gian phan so");
            chon = sc.nextInt();

            switch (chon) {
                case 1 -> {
                    psc = ps1.congPs(ps2);
                    System.out.print("Ket qua phep cong: ");
                    psc.hienthiPs();
                }
                case 2 -> {
                    psc = ps1.truPs(ps2);
                    System.out.print("Ket qua phep tru: ");
                    psc.hienthiPs();
                }
                case 3 -> {
                    psc = ps1.nhanPs(ps2);
                    System.out.print("Ket qua phep nhan: ");
                    psc.hienthiPs();
                }
                case 4 -> {
                    psc = ps1.chiaPs(ps2);
                    System.out.print("Ket qua phep chia: ");
                    psc.hienthiPs();
                }
                case 5 -> {
                    if (psc.kiemtra()) {
                        System.out.println("Phan so da toi gian");
                    } else {
                        System.out.println("Phan so van chua toi gian");
                    }
                }
                case 6 -> {
                    System.out.println("\tPhan so sau khi toi gian:");
                    psc.toigian();
                    psc.hienthiPs();
                }
                case 0 -> System.out.println("Thoat chuong trinh.");
                default -> System.out.println("Nhap sai! Vui long nhap tu 0 -> 6.");
            }

        } while (chon != 0);

        sc.close();
    }
}
