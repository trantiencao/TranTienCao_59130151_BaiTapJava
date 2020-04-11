/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Cao's Laptop
 */
public abstract class SinhVienPoly {

    /// Attributes
    public String hoTen;
    public String nganhHoc;

    /// Constructor
    public SinhVienPoly(String hoTen, String nganhHoc) {
        this.hoTen = hoTen;
        this.nganhHoc = nganhHoc;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        if (this.getDiem() < 5) {
            return "Yếu";
        }
        if (this.getDiem() < 6.5) {
            return "Trung bình";
        }
        if (this.getDiem() < 7.5) {
            return "Khá";
        }
        if (this.getDiem() < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

     // Method: input info SinhVien
     public void output() {
        System.out.println("\nHọ tên: " + this.hoTen + ", Ngành học: " + this.nganhHoc);
     }
}
