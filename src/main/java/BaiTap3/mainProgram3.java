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
public class mainProgram3 {
    public static void main(String[] args) {

        SinhVienIT it = new SinhVienIT("Trần Tiến Cao", "IT", 8, 8, 8);
        SinhVienBiz biz = new SinhVienBiz("Trần Dần", "Biz", 9, 7);

        it.output();
        System.out.println("Điểm: " + it.getDiem());
        System.out.println("Học lực: " + it.getHocLuc());

        biz.output();
        System.out.println("Điểm: " + biz.getDiem());
        System.out.println("Học lực: " + biz.getHocLuc());

    }
}
