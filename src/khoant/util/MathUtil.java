/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khoant.util;

/**
 *
 * @author Ermii
 */
//Đây là class chứa các hàm tiện ích xài chung cho các nơi khác.
//Nó chứa các hàm tính toán bổ trợ cho các class khác
//đó là đồ bổ trợ, xài chung, nên chúng là STATIC
public class MathUtil {

    //hàm tính n! = 1.2.3...n, vì tăng kết quả nhanh, sớm tràn
    // int chỉ tối đa 2 tỷ 1, phải để "long" cho đỡ bị tràn kết quả
    //mình chỉ nên tính n <= 15 vì 20! to lắm
    public static long computerFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
