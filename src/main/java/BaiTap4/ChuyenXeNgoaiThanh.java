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
public class ChuyenXeNgoaiThanh extends ChuyenXe    {
    /// Attributes
    public String noiDen;
    public int soNgay;
  
    /// Constructor
    public ChuyenXeNgoaiThanh(int maChuyen, String taiXe, String soXe, double doanhThu, String noiDen, int soNgay) {
      super(maChuyen, taiXe, soXe, doanhThu);
      this.noiDen = noiDen;
      this.soNgay = soNgay;
    }

    /// Method: in thêm thông tin chuyến xe
    @Override
    public void inThongTinChuyenXe() {
      super.inThongTinChuyenXe();
      System.out.println("Mơi đến: " + this.noiDen);
      System.out.println("Số ngày: " + this.soNgay);
      System.out.printf("\n");
    }
}
