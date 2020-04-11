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
public class SinhVienIT extends SinhVienPoly    {
    /// Attributes
    public double diemJava;
    public double diemHtml;
    public double diemCss;

    /// Constructor
    public SinhVienIT(String hoTen, String nganhHoc, double diemJava, double diemHtml, double diemCss) {
        super(hoTen, nganhHoc);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;

    }

    /// Defined abstract method
    @Override
    public double getDiem() {
        return (2 * this.diemJava + this.diemHtml + this.diemCss) / 4;
    };
}
