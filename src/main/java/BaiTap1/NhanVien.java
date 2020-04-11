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

public class NhanVien {
    /// Attributes
    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongSoGioLam;

    /// Constructor defaul (không tham số)
    public NhanVien() {
        this.ten = "";
        this.tuoi = 0;
        this.diaChi = "";
        this.tienLuong = 0;
        this.tongSoGioLam = 0;
    }

    /// Constructor with method setter
    public void setTen(String ten) { this.ten = ten; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
    public void setTienLuong(double tienLuong) { this.tienLuong = tienLuong; }
    public void setTongSoGioLam(int tongGioLam) { this.tongSoGioLam = tongGioLam; }

    /// get "thông tin" with method getter
    public String getThongTin() {
        return "Tên: " + this.ten + ", Tuổi: " + this.tuoi + ", Địa chỉ: " + this.diaChi + ", Tiền lương: " + this.tienLuong
                + ", Tổng số giờ làm: " + this.tongSoGioLam + ", Tiền thưởng: " + tinhThuong();
    }

    public double tinhThuong() {
        if (this.tongSoGioLam >= 200) {
            return this.tienLuong * 0.2;
        }
        else if (this.tongSoGioLam >= 100) {
            return this.tienLuong * 0.1;
        }
        return 0;
    }
}
