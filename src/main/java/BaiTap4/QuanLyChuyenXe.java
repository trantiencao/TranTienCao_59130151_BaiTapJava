/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.ArrayList;

/**
 *
 * @author Cao's Laptop
 */
public class QuanLyChuyenXe {

    /// Attributes
    public ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();

    public void themChuyenXe(ChuyenXe cx) {
        dsChuyenXe.add(cx);
    }

    public ArrayList<ChuyenXe> xuatDsChuyenXe() {
        return dsChuyenXe;
    }

    public void inThongTin() {
        for(ChuyenXe cx : dsChuyenXe) {
            cx.inThongTinChuyenXe();
        }
    }

    public double tinhDoanhThuNoiThanh() {
        double doanhThu = 0;
        for(ChuyenXe cx : dsChuyenXe) {
            if (cx instanceof ChuyenXeNoiThanh) {
                doanhThu += cx.doanhThu;
            }
        }
        return doanhThu;
    }

    public double tinhDoanhThuNgoaiThanh() {
        double doanhThu = 0;
        for(ChuyenXe cx : dsChuyenXe) {
            if(cx instanceof ChuyenXeNgoaiThanh) {
                doanhThu += cx.doanhThu;
            }
        }
        return doanhThu;
    }

    public double tongDoanhThu() {
        double doanhThu = 0;
        for(ChuyenXe cx : dsChuyenXe) {
            doanhThu += cx.doanhThu;
        }
        return doanhThu;
    }

}
