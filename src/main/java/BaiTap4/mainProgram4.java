/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author Cao's Laptop
 */
public class mainProgram4 {
    public static void main(String[] args) {

        QuanLyChuyenXe qlChuyenXe = new QuanLyChuyenXe();

        ChuyenXe xeNoiThanh1 = new ChuyenXeNoiThanh(01, "Trần Cao", "78C-01.4419", 1000000, "Tuy Hòa Đông - Tuy Hòa Tây", 50);
        ChuyenXe xeNoiThanh2 = new ChuyenXeNoiThanh(02, "Trần Dần", "78C-01.4418", 1000000, "Tuy Hòa Nam - Tuy Hòa Bắc", 50);
        ChuyenXe xeNoiThanh3 = new ChuyenXeNoiThanh(03, "Trần Mẹo", "78C-01.4417", 1000000, "Tuy Hòa - Hòa Vinh", 50);

        qlChuyenXe.themChuyenXe(xeNoiThanh1);
        qlChuyenXe.themChuyenXe(xeNoiThanh2);
        qlChuyenXe.themChuyenXe(xeNoiThanh3);

        ChuyenXe xeNgoaiThanh1 = new ChuyenXeNgoaiThanh(04, "Trần Thìn", "78C-01.4420", 3000000, "Tuy Hoa - Nha Trang", 100);
        ChuyenXe xeNgoaiThanh2 = new ChuyenXeNgoaiThanh(05, "Trần Tỵ", "78C-01.4421", 3000000, "Tuy Hòa - Cam Ranh", 100);
        ChuyenXe xeNgoaiThanh3 = new ChuyenXeNgoaiThanh(06, "Trần Ngọ", "78C-01.4422", 3000000, "Tuy Hòa - Quy Nhơn", 100);

        qlChuyenXe.themChuyenXe(xeNgoaiThanh1);
        qlChuyenXe.themChuyenXe(xeNgoaiThanh2);
        qlChuyenXe.themChuyenXe(xeNgoaiThanh3);

        qlChuyenXe.inThongTin();

        System.out.printf("\nTổng doanh thu xe nội thành: %.00f\n" , qlChuyenXe.tinhDoanhThuNoiThanh());
        System.out.printf("T\nổng doanh thu xe ngoại thành: %.00f\n", qlChuyenXe.tinhDoanhThuNgoaiThanh());
        System.out.printf("\nTổng doanh thu: %.00f\n", qlChuyenXe.tongDoanhThu());


    }
}
