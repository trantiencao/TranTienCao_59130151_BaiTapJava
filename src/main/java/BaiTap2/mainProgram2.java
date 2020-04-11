/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;

/**
 *
 * @author Cao's Laptop
 */
public class mainProgram2 {
    public static void main(String[] args) {

        /// Constructor QuanLyNhanVien object
        IQuanLy qlnv = new QuanLyNhanVien();

        /// Create list NhanVien: 5 NhanVien
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();
        NhanVien nv3 = new NhanVien();
        NhanVien nv4 = new NhanVien();
        NhanVien nv5 = new NhanVien();

        /// Constructor với Method setter: 5 NhanVien
        nv1.setTen("Trần Cao");
        nv1.setTuoi(21);
        nv1.setDiaChi("Tây Hòa, Phú Yên");
        nv1.setTienLuong(1000.0);
        nv1.setTongSoGioLam(200);

        nv2.setTen("Trần Dần");
        nv2.setTuoi(22);
        nv2.setDiaChi("Tây Hòa, Phú Yên");
        nv2.setTienLuong(1000.0);
        nv2.setTongSoGioLam(200);

        nv3.setTen("Trần Mẹo");
        nv3.setTuoi(21);
        nv3.setDiaChi("Tây Hòa, Phú Yên");
        nv3.setTienLuong(1000.0);
        nv3.setTongSoGioLam(200);

        nv4.setTen("Trần Thìn");
        nv4.setTuoi(20);
        nv4.setDiaChi("Tây Hòa, Phú Yên");
        nv4.setTienLuong(1000.0);
        nv4.setTongSoGioLam(200);

        nv5.setTen("Trần Tỵ");
        nv5.setTuoi(19);
        nv5.setDiaChi("Tây Hòa, Phú Yên");
        nv5.setTienLuong(1000.0);
        nv5.setTongSoGioLam(200);

        /// Add list NhanVien in qlNhanVien
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);

        // Input list NhanVien
        qlnv.inDS();

    }
}
