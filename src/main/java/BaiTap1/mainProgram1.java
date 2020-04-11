/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Cao's Laptop
 */
public class mainProgram1 {
    public static void main(String[] args) {

        /// Constructor NhanVien
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();

        /// Use method setter input info NhanVien
        nv1.setTen("Trần Tiến Cao");
        nv1.setTuoi(21);
        nv1.setDiaChi("Phú Yên");
        nv1.setTienLuong(1000.0);
        nv1.setTongSoGioLam(200);

        nv2.setTen("Trần Dần");
        nv2.setTuoi(21);
        nv2.setDiaChi("Phú Yên");
        nv2.setTienLuong(2000.0);
        nv2.setTongSoGioLam(380);

        /// Output info NhanVien
        System.out.println(nv1.getThongTin());
        System.out.println(nv2.getThongTin());
    }
}
