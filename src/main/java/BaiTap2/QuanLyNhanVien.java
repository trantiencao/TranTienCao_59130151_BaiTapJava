/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Cao's Laptop
 */
public class QuanLyNhanVien implements IQuanLy  {

    /// List NhanVien
    ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

    /// Implement method
    @Override
    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    };

    @Override
    public void inDS() {
        dsNhanVien.forEach(nv -> System.out.println("\n"+nv.getThongTin()));
    };

}
