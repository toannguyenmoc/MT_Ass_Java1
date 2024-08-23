/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.Scanner;

/**
 *
 * @author ToanNM_PC09504
 */
public class ConNguoi {

    protected String hoTen;
    protected String namSinh;

    protected String mauHoTen = "[a-eg-ik-vxyA-EG-IK-VXY ]{1,50}";  // "[^/jfwzJFWZ^/0-9\r]{1,50}"
    protected String mauNamSinh = "[12]{1}[0-9]{3}";

    public ConNguoi() {
    }

    public ConNguoi(String hoTen) {
        this.hoTen = hoTen;
    }

    public ConNguoi(String hoTen, String namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    Scanner sc = new Scanner(System.in);
   
    public void input() {
       
        while (true) {
            System.out.print("Nhập vào họ tên: ");
            hoTen = sc.nextLine();
            if (hoTen.matches(mauHoTen) == true) {
                break;
            } else {
                continue;
            }
        }
        while (true) {
            System.out.print("Nhập vào năm sinh: ");
            namSinh = sc.nextLine();
            if (namSinh.matches(mauNamSinh)) {
                break;
            } else {
                continue;
            }
        }
    }

    public int tuoi() {
        int nam = Integer.parseInt(namSinh);
        return (2024 - nam);
    }

    public void output() {
        System.out.println("Họ Tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Tuổi: " + tuoi());     
    }

    public static void main(String[] args) {
        ConNguoi cn = new ConNguoi();
        cn.input();
        cn.output();
    }
}
