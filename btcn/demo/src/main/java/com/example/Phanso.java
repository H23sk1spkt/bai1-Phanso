package com.example;
import java.util.Scanner;

public class Phanso {
    private int tuso;
    private int mauso;

    // ham khoi tao ko doi so;
    public Phanso(){
        tuso=0;
        mauso=1;
    }
    //ham khoi tao co doi so
    public Phanso(int tuso,int mauso){
        this.tuso=tuso;
        this.mauso=mauso;
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
                tuso=a;
                mauso=b;
            }

        }while(b==0);

    }
    // hien thi phan so
    public void hienthiPs(){
        if(tuso*mauso<0){
            System.out.println("\t-"+Math.abs(tuso)+"/"+Math.abs(mauso));
        }
        else System.out.println("\t"+Math.abs(tuso)+"/"+Math.abs(mauso));
    }
    //Cong 2 phan so
    //ps2 se thua huong cac thuoc tinh cuar Phanso
    public Phanso congPs(Phanso ps2){
        int a=tuso*ps2.mauso+ps2.tuso*mauso;
        int b=mauso*ps2.mauso;
        return new Phanso(a,b);
    }
    //tru 2 phan so
    public Phanso truPs(Phanso ps2){
        int a=tuso*ps2.mauso-ps2.tuso*mauso;
        int b=mauso*ps2.mauso;
        return new Phanso(a,b);
    }
    //nhan 2 phan so
    public Phanso nhanPs(Phanso ps2){
        int a=tuso*ps2.tuso;
        int b=mauso*ps2.mauso;
        return new Phanso(a,b);
    }
    //chia 2 phan so
    public Phanso chiaPs(Phanso ps2){
        int a=tuso*ps2.mauso;
        int b=mauso*ps2.tuso;
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
        if(Timuscln(tuso,mauso)==1){
            return true;
        }
        return false;
    }
    // ham phan so toi gian
    public void toigian(){
        int x=Timuscln(tuso,mauso);
        tuso/=x;
        mauso/=x;
    }
}

