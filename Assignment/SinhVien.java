/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ToanNM_PC09504
 */
public class SinhVien extends ConNguoi {

    private String mssv;
    private String email;
    private double diemTB;

    private String mauMssv = "[a-zA-Z]{2}[01]{1}[0-9]{4}";
    private String mauEm1 = "[a-zA-Z0-9]{5,30}@gmail.com";
    private String mauEm2 = "[a-zA-Z0-9]{5,30}@fpt.edu.vn";

    public SinhVien() {
    }

    public SinhVien(String mssv) {
        this.mssv = mssv;
    }

    public SinhVien(String mssv, String email) {
        this.mssv = mssv;
        this.email = email;
    }

    public SinhVien(String mssv, String email, double diemTB) {
        this.mssv = mssv;
        this.email = email;
        this.diemTB = diemTB;
    }

    public SinhVien(String mssv, String email, double diemTB, String hoTen) {
        super(hoTen);
        this.mssv = mssv;
        this.email = email;
        this.diemTB = diemTB;
    }

    public SinhVien(String hoTen, String namSinh, String mssv, String email, double diemTB) {
        super(hoTen, namSinh);
        this.mssv = mssv;
        this.email = email;
        this.diemTB = diemTB;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    ArrayList<SinhVien> list = new ArrayList<SinhVien>();
    SinhVien sv;

    @Override
    public void input() {
        while (true) {

            super.input();
            while (true) {
                System.out.print("Nhập MSSV: ");
                mssv = sc.nextLine();
                if (mssv.matches(mauMssv)) {
                    break;
                } else {
                    continue;
                }
            }
            while (true) {
                System.out.print("Nhập Email: ");
                email = sc.nextLine();
                if (email.matches(mauEm1) || email.matches(mauEm2)) {
                    break;
                } else {
                    System.out.println("Bạn nhập không đúng định dạng, mời nhập lại");
                    continue;
                }
            }

            while (true) {
                try {
                    System.out.print("Nhập Điểm TB: ");
                    diemTB = sc.nextDouble();
                    if (diemTB < 0 || diemTB > 10) {
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Vui lòng nhập số !!!");
                    sc.nextLine();
                    continue;
                }
                break;
            }

            sv = new SinhVien(hoTen, namSinh, mssv, email, diemTB);
            list.add(sv);

            System.out.print("Bạn muốn nhập tiếp không (Y/N): ");
            sc.nextLine();
            if (sc.nextLine().equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    @Override
    public void output() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Họ Tên: " + list.get(i).hoTen);
            System.out.println("Năm Sinh: " + list.get(i).namSinh);
            System.out.println("Tuổi: " + list.get(i).tuoi());
            System.out.println("MSSV: " + list.get(i).mssv);
            System.out.println("Email: " + list.get(i).email);
            System.out.println("Điểm TB: " + list.get(i).diemTB);
        }
    }

    public void tim() {
        while (true) {
            System.out.print("Nhập Họ Tên cần tìm: ");
            String tim = sc.nextLine();
            boolean check = false;
            int index = -1;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).hoTen.equalsIgnoreCase(tim)) {
                    System.out.println("Tìm thấy");
                    index = i;
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("Không tìm thấy");
            } else {
                System.out.println("Tên Sinh Viên: " + list.get(index).hoTen);
                System.out.println("MSSV: " + list.get(index).mssv);
                System.out.println("Email: " + list.get(index).email);
                System.out.println("Năm Sinh: " + list.get(index).namSinh);
                System.out.println("Điểm: " + list.get(index).diemTB);
            }

            System.out.print("Bạn muốn tìm tiếp không(Y/N): ");
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void remove() {
        while (true) {
            String xoa;
            while (true) {
                System.out.print("Nhập MSSV cần xoá: ");
                xoa = sc.nextLine();
                if (xoa.matches(mauMssv)) {
                    break;
                } else {
                    continue;
                }
            }
            boolean check = false;
            int index = -1;
            for (int i = 0; i < list.size(); i++) {
                if (xoa.equalsIgnoreCase(list.get(i).mssv)) {
                    check = true;
                    index = i;
                }
            }

            if (check == true) {
                System.out.println("Tìm thấy!!!!");
                System.out.print("Bạn muốn xoá không(Y/N): ");
                if (sc.nextLine().equalsIgnoreCase("y")) {
                    System.out.println("Đã xoá !");
                    list.remove(index);
                }
                System.out.println("Danh Sách Mới:");
                output();
            } else {
                System.out.println("Không tìm thấy");
            }

            System.out.print("Bạn muốn xoá tiếp không(Y/N): ");
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void capNhat() {
        while (true) {
            String doi;
            while (true) {
                System.out.print("Nhập MSSV cần đổi tên: ");
                doi = sc.nextLine();
                if (doi.matches(mauMssv)) {
                    break;
                } else {
                    continue;
                }
            }
            boolean check = false;
            int index = -1;
            for (int i = 0; i < list.size(); i++) {
                if (doi.equalsIgnoreCase(mssv)) {
                    check = true;
                    index = i;
                }
            }
            if (check == true) {
                System.out.println("Tìm thấy!!!!");
                System.out.print("Nhập tên Sinh Viên mới: ");
                String tenMoi = sc.nextLine();

                sv = new SinhVien(tenMoi, namSinh, mssv, email, diemTB);
                list.set(index, sv);
                System.out.println("Danh Sách Sinh Viên mới:");
                output();
            } else {
                System.out.println("Không tìm thấy");
            }

            System.out.print("Bạn muốn cập nhật tiếp không(Y/N): ");
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void khoangDiem() {
        while (true) {
            double min, max;
            while (true) {
                try {
                    System.out.print("Nhập điểm từ khoảng: ");
                    min = sc.nextDouble();
                    System.out.print("Đến: ");
                    max = sc.nextDouble();
                    if (min < 0 || max < 0 || min>10 || max>10) {
                        System.out.println("Điểm phải từ (0-->10)");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Vui lòng nhập số !!!");
                    sc.nextLine();
                    continue;
                }
                break;
            }
            boolean check = false;
            for (int i = 0; i < list.size(); i++) {
                if ((list.get(i).diemTB >= min && list.get(i).diemTB <= max) || (list.get(i).diemTB <= min && list.get(i).diemTB >= max)) {
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("Không tìm thấy");
            } else {
                System.out.println("Danh Sách trong khoảng điểm bạn cần tìm:");
                for (int i = 0; i < list.size(); i++) {
                    if ((list.get(i).diemTB >= min && list.get(i).diemTB <= max) || (list.get(i).diemTB <= min && list.get(i).diemTB >= max)) {
                        System.out.println("Họ Tên: " + list.get(i).hoTen);
                        System.out.println("MSSV: " + list.get(i).mssv);
                        System.out.println("Email: " + list.get(i).email);
                        System.out.println("Năm Sinh: " + list.get(i).namSinh);
                        System.out.println("Điểm TB: " + list.get(i).diemTB);
                    }
                }
            }
            System.out.print("Bạn muốn tìm tiếp không(Y/N): ");
            sc.nextLine();
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void sapXepTangDanTheoTen() {
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            public int compare(SinhVien ten1, SinhVien ten2) {
                if (ten1.hoTen.compareTo(ten2.hoTen) > 0) {
                    return 1;
                } else if (ten1.hoTen.compareTo(ten2.hoTen) < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(list, comp);

        System.out.println("Danh Sách Sinh Viên sắp xếp tăng dần theo tên:");
        output();
    }

    public void sapXepGiamDanTheoDiem() {
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.diemTB > sv2.diemTB) {
                    return 1;
                } else if (sv1.diemTB < sv2.diemTB) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(list, comp.reversed());

        System.out.println("Danh Sách Sinh Viên sắp xếp giảm dần theo điểm Trung Bình:");
        output();
    }

    public void diemCaoNhat() {
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.diemTB > sv2.diemTB) {
                    return 1;
                } else if (sv1.diemTB < sv2.diemTB) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(list, comp.reversed());
        while (true) {
            int n;
            while (true) {
                try {
                    System.out.print("Bạn muốn tìm bao nhiêu Sinh Viên có điểm TB cao nhất: ");
                    n = sc.nextInt();
                    if (n < 0 || n > list.size()) {
                        System.out.println("Trong danh sách chỉ có " + list.size() + " Sinh Viên, vui lòng nhập lại");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Vui lòng nhập số !!!");
                    sc.nextLine();
                    continue;
                }
                break;
            }

            System.out.println("Danh sách " + n + " Sinh Viên có điểm TB cao nhất:");
            for (int i = 0; i < n; i++) {
                System.out.println("MSSV: " + list.get(i).mssv);
                System.out.println("Họ Tên: " + list.get(i).hoTen);
                System.out.println("Điểm: " + list.get(i).diemTB);
                System.out.println("Email: "+list.get(i).email);
            }

            System.out.print("Bạn muốn tìm tiếp không(Y/N): ");
            sc.nextLine();
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }
// xuất sinh viên có tuổi lớn hơn 23
    public void khoangTuoi(){
          while (true) {
            int min, max;
            while (true) {
                try {
                    System.out.print("Nhập tuổi từ khoảng: ");
                    min = sc.nextInt();
                    System.out.print("Đến: ");
                    max = sc.nextInt();
                    if (min < 0 || max < 0) {
                        System.out.println("Tuổi không thể âm");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Vui lòng nhập số !!!");
                    sc.nextLine();
                    continue;
                }
                break;
            }
            boolean check = false;
            for (int i = 0; i < list.size(); i++) {
                if ((list.get(i).tuoi() >= min && list.get(i).tuoi() <= max) || (list.get(i).tuoi() <= min && list.get(i).tuoi() >= max)) {
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("Không tìm thấy");
            } else {
                System.out.println("Danh Sách trong khoảng tuổi bạn cần tìm:");
                for (int i = 0; i < list.size(); i++) {
                    if ((list.get(i).tuoi() >= min && list.get(i).tuoi() <= max) || (list.get(i).tuoi() <= min && list.get(i).tuoi() >= max)) {
                        System.out.println("Họ Tên: " + list.get(i).hoTen);
                        System.out.println("MSSV: " + list.get(i).mssv);
                        System.out.println("Email: " + list.get(i).email);
                        System.out.println("Năm Sinh: " + list.get(i).namSinh);
                        System.out.println("Điểm TB: " + list.get(i).diemTB);
                    }
                }
            }
            System.out.print("Bạn muốn tìm tiếp không(Y/N): ");
            sc.nextLine();
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.input();
        sv.output();
    }
}
