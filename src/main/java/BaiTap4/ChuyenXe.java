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
public abstract class ChuyenXe {

    /// Attributes
    public int maSoChuyen;
    public String hoTenTaiXe;
    public String soXe;
    public double doanhThu;

    /// Contructor
    public ChuyenXe(int maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    /// Method: in thông tin chuyến xe
    public void inThongTinChuyenXe() {
        System.out.println("Mã chuyến xe: " + this.maSoChuyen);
        System.out.println("Tên tài xế: " + this.hoTenTaiXe);
        System.out.println("Số xe: " + this.soXe);
        System.out.printf("Doanh thu: %.00f\n", this.doanhThu);
    };

}
