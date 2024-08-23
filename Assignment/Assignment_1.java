package Assignment;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ToanNM_PC09504
 */
public class Assignment_1 {

    public static void menu() {
        System.out.println("\t++--------------------------------------------------------++");
        System.out.println("\t|\t\tQUẢN LÝ QUÁN NƯỚC                          |");
        System.out.println("\t|\t1. Nhập danh sách nước uống                        |");
        System.out.println("\t|\t2. Xuất danh sách nước uống                        |");
        System.out.println("\t|\t3. Tìm và hiện thị nước uống theo tên              |");
        System.out.println("\t|\t4. Xoá nước uống theo mã                           |");
        System.out.println("\t|\t5. Cập nhật nước uống theo mã                      |");
        System.out.println("\t|\t6. Tìm kiếm theo khoảng giá bán                    |");
        System.out.println("\t|\t7. Sắp xếp tăng dần theo tên nước uống             |");
        System.out.println("\t|\t8. Sắp xếp giảm dần theo giá bán                   |");
        System.out.println("\t|\t9. Xuất 5 nước uống có giá cao nhất                |");
        System.out.println("\t|\t10.Vòng quay may mắn khi uống nước tại quán        |");
        System.out.println("\t|\t11.Thoát.                                          |");
        System.out.println("\t++--------------------------------------------------------++");

    }

    public static void main(String[] args) {
        SinhVien as = new SinhVien();
        while (true) {
            try {
                menu();

                int n;
                Scanner sc = new Scanner(System.in);
                System.out.print("Chọn chức năng: ");
                n = sc.nextInt();

                switch (n) {
                    case 1:
                        System.out.println("1. Nhập danh sách nước uống.");
                        as.input();
                        break;
                    case 2:
                        System.out.println("2. Xuất danh sách nước uống.");
                        as.output();
                        break;
                    case 3:
                        System.out.println("3. Tìm và hiện thị nước uống.");
                        break;
                    case 4:
                        System.out.println("4. Xoá nước uống theo mã.");
                        break;
                    case 5:
                        System.out.println("5. Cập nhật nước uống theo mã.");
                        break;
                    case 6:
                        System.out.println("6. Tìm kiếm theo khoảng giá bán.");
                        break;
                    case 7:
                        System.out.println("7. Sắp xếp tăng dần theo tên nước uống.");
                        break;
                    case 8:
                        System.out.println("8. Sắp xếp giảm dần theo giá bán.");
                        break;
                    case 9:
                        System.out.println("9. Xuất 5 nước uống có giá cao nhất.");
                        break;
                    case 10:
                        System.out.println("10.Sáng tạo chức năng mới không trùng với trên.");
                        break;
                    case 11:
                        System.out.println("Hẹn gặp lại.");
                        System.exit(0);
                    default:
                        System.out.println("Bạn chọn không đúng chức năng.");
                }

            } catch (Exception e) {
                System.out.println("Vui lòng nhập số chức năng, không Nhập ký tự !!!");
            }
        }
    }
}
