package com.example;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Phanso ps1=new Phanso();
        Phanso ps2=new Phanso();
        Phanso psc=new Phanso();
        System.out.println("\t Nhap so thu 1");
        ps1.nhapPS(sc);
        System.out.println("\t Nhap so thu 2");
        ps2.nhapPS(sc);
        //----------------
        ps1.hienthiPs();
        ps2.hienthiPs();
        int chon;
            do {
                System.out.println("Nhap lua chon từ 1->6");
                chon=sc.nextInt();
                switch (chon){
                case 1 : {
                    psc=ps1.congPs(ps2);
                    psc.hienthiPs();
                    break;
                }
                case 2 : {
                    psc=ps1.truPs(ps2);
                    psc.hienthiPs();
                    break;
                }
                case 3 : {
                    psc=ps1.nhanPs(ps2);
                    psc.hienthiPs();
                    break;
                }
                case 4 : {
                    psc=ps1.chiaPs(ps2);
                    psc.hienthiPs();
                    break;
                }
                case 5: {
                    if(psc.kiemtra()==true){
                        System.out.println("Phan so da toi gian");
                    }
                    else {
                        System.out.println("Phan so nay van chua toi gian");
                    }
                    break;
                }
                case 6 : {
                    System.out.println("\tPhan so sau khi toi gian\t");
                    psc.toigian();
                    psc.hienthiPs();
                    break;
                }
                default: {
                    System.out.println("Nhap loi yeu cau nhap tu 1->6");
                    break;
                }
            }
            }while(chon!=0);
    }
}
