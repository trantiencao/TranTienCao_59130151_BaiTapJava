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
public class ChuyenXeNoiThanh extends ChuyenXe  {

    /// Attributes
    public String soTuyen;
    public double soKm;

    /// Constructor
    public ChuyenXeNoiThanh(int maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen, double soKm) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    /// Method: in thêm thông tin chuyến xe
    @Override
    public void inThongTinChuyenXe() {
        super.inThongTinChuyenXe();
        System.out.println("Tuyến: " + this.soTuyen);
        System.out.println("Số kilomet đi được: " + this.soKm);
        System.out.printf("\n");
    }
}
