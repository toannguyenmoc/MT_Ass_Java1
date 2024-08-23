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
public class Assignment_2 {

    public void menu() {
        System.out.println("\t++--------------------------------------------------------++");
        System.out.println("\t|\t\tQUẢN LÝ SINH VIÊN                          |");
        System.out.println("\t|\t1. Nhập danh sách Sinh Viên                        |");
        System.out.println("\t|\t2. Xuất danh sách Sinh Viên                        |");
        System.out.println("\t|\t3. Tìm và hiện thị Sinh Viên theo tên              |");
        System.out.println("\t|\t4. Xoá Sinh Viên theo MSSV                         |");
        System.out.println("\t|\t5. Cập nhật Sinh Viên theo MSSV                    |");
        System.out.println("\t|\t6. Tìm kiếm Sinh Viên theo khoảng điểm             |");
        System.out.println("\t|\t7. Sắp xếp tăng dần theo tên Sinh Viên             |");
        System.out.println("\t|\t8. Sắp xếp giảm dần theo điểm Trung Bình           |");
        System.out.println("\t|\t9. Xuất Sinh Viên có điểm cao nhất theo yêu cầu    |");
        System.out.println("\t|\t10.Tìm kiếm Sinh Viên theo khoảng tuổi             |");
        System.out.println("\t|\t11.Thoát.                                          |");
        System.out.println("\t++--------------------------------------------------------++");
    }

    public static void main(String[] args) {
        Assignment_2 as = new Assignment_2();
        SinhVien sv = new SinhVien();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                as.menu();
                int n;
                System.out.print("Chọn chức năng: ");
                n = sc.nextInt();

                switch (n) {
                    case 1:
                        System.out.println("1. Nhập danh sách Sinh Viên.");
                        sv.input();
                        break;
                    case 2:
                        System.out.println("2. Xuất danh sách Sinh Viên.");
                        sv.output();
                        break;
                    case 3:
                        System.out.println("3. Tìm và hiện thị Sinh Viên theo tên.");
                        sv.tim();
                        break;
                    case 4:
                        System.out.println("4. Xoá Sinh Viên theo MSSV .");
                        sv.remove();
                        break;
                    case 5:
                        System.out.println("5. Cập nhật Sinh Viên theo MSSV.");
                        sv.capNhat();
                        break;
                    case 6:
                        System.out.println("6. Tìm kiếm Sinh Viên theo khoảng điểm.");
                        sv.khoangDiem();
                        break;
                    case 7:
                        System.out.println("7. Sắp xếp tăng dần theo tên Sinh Viên.");
                        sv.sapXepTangDanTheoTen();
                        break;
                    case 8:
                        System.out.println("8. Sắp xếp giảm dần theo điểm Trung Bình.");
                        sv.sapXepGiamDanTheoDiem();
                        break;
                    case 9:
                        System.out.println("9. Xuất Sinh Viên có điểm cao nhất theo yêu cầu.");
                        sv.diemCaoNhat();
                        break;
                    case 10:
                        System.out.println("10.Tìm kiếm Sinh Viên theo khoảng tuổi.");
                        sv.khoangTuoi();
                        break;
                    case 11:
                        System.out.println("====== Hẹn gặp lại. ======");
                        System.exit(0);
                    default:
                        System.out.println("Bạn chọn không đúng chức năng.");
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số chức năng, không Nhập ký tự !!!");
                sc.nextLine();
            }
        }
    }
}
