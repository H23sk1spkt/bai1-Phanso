package com.example;
import java.util.Scanner;

public class Phanso {
    private int tuso_103;
    private int mauso_103;

    // ham khoi tao ko doi so;
    public Phanso(){
        tuso_103=0;
        mauso_103=1;
    }
    //ham khoi tao co doi so
    public Phanso(int tuso_103,int mauso_103){
        this.tuso_103=tuso_103;
        this.mauso_103=mauso_103;
    }
    //nhap phan so
    public void nhapPS(Scanner sc){
        int a;
        int b;
        do{
            System.out.println("\t Nhap tu so ");
            a=sc.nextInt();
            System.out.println("\t Nhap mau so ");
            b=sc.nextInt();
            if(b==0){
                System.out.println("\t Ban nhap sai");
            }
            else{
                tuso_103=a;
                mauso_103=b;
            }

        }while(b==0);

    }
    // hien thi phan so
    public void hienthiPs(){
        if(tuso_103*mauso_103<0){
            System.out.println("\t-"+Math.abs(tuso_103)+"/"+Math.abs(mauso_103));
        }
        else System.out.println("\t"+Math.abs(tuso_103)+"/"+Math.abs(mauso_103));
    }
    //Cong 2 phan so
    //ps2 se thua huong cac thuoc tinh cuar Phanso
    public Phanso congPs(Phanso ps2){
        int a=tuso_103*ps2.mauso_103+ps2.tuso_103*mauso_103;
        int b=mauso_103*ps2.mauso_103;
        return new Phanso(a,b);
    }
    //tru 2 phan so
    public Phanso truPs(Phanso ps2){
        int a=tuso_103*ps2.mauso_103-ps2.tuso_103*mauso_103;
        int b=mauso_103*ps2.mauso_103;
        return new Phanso(a,b);
    }
    //nhan 2 phan so
    public Phanso nhanPs(Phanso ps2){
        int a=tuso_103*ps2.tuso_103;
        int b=mauso_103*ps2.mauso_103;
        return new Phanso(a,b);
    }
    //chia 2 phan so
    public Phanso chiaPs(Phanso ps2){
        int a=tuso_103*ps2.mauso_103;
        int b=mauso_103*ps2.tuso_103;
        return new Phanso(a,b);
    }
    // kiem tra ve uoc chung lon nhat
    private int Timuscln(int a, int b){
        int r=a%b;
        while(r!=0){
           a=b;
           b=r;
           r=a%b;
        }
        return b;

    }
    // ham kiem tra toi gian
    public boolean kiemtra(){
        if(Timuscln(tuso_103,mauso_103)==1){
            return true;
        }
        return false;
    }
    // ham phan so toi gian
    public void toigian(){
        int x=Timuscln(tuso_103,mauso_103);
        tuso_103/=x;
        mauso_103/=x;
    }
}

