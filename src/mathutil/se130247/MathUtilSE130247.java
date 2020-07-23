/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil.se130247;

//import khoant.util.MathUtil;
import static khoant.util.MathUtil.computerFactorial;
// chuẩn cho thứ 5

/**
 * 2020/07/07
 *
 * @author Ermii
 */
public class MathUtilSE130247 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + computerFactorial(5));

        //Khi ta viet code xong phai test xem ham hay class hay chuong trinh chay co dung khong
        //Viec nay goi la UnitTest, test muc ham, muc class, muc don vi
        //Test = cach dua data vao ham, class, cjau ja, xem ket qua tra ve
        //(actual value) roi ta so ket qua tra ve co dung nhu ta da mong doi
        //tinh toan truoc do, mong doi: expected value;
        //neu actual = expected ham chay dung/ xu li dung nhu mong doi
        //neu khong bang, ham sai roi, hoac ta mong doi sai
        //trong main() ta sout() ket qua actual so sanh voi mong doi expected
        //viec nay goi la kiem tra bang mat, tu dung mat so sanh va luan kq
        //=====> so sanh expected va actual <=======
        //expected: 1, tao ki vong ham m chay oi ve cho t con so 1
        //neu khi chay may ko iin ra 1 ma in ra 10(vi du), 10 duoc goi la actual
        System.out.println("1! = " + computerFactorial(1));
        //expected: , hi vong ham tinh 0! se la 1, thuc te (actual) phai chay da
        System.out.println("0! = " + computerFactorial(0));
        //expected:2
        System.out.println("2! = " + computerFactorial(2));
        //expected: 6
        System.out.println("3! = " + computerFactorial(3));
        //expected: chui ca chon neu dua vao ca chon
        System.out.println("-5! = " + computerFactorial(-5));
        //============ Cach test = mat co 1 rui ro nho: tu so sanh data, luan, nhieu ket qua
        //de bi roi mat va sai sot
        //ki thuat de test app/ham chay co dung ko?
        //Bach cach : goi ham voi data dua vao, lay ket qua actual tu so sanh luon voi
        //excepted, neu dung, khop, bang, in ra mau xanh
        //              sai, lech , khong bang, in ra mau do
        //Neu goi nhieu ham, goi nhieu lan nhu doan code tren thi
        // XANH : thi all in Blue
        //Do : 1 trong dam bi do, coi nhu ca dam do
        // mau xanh : Khop giua exected va actual, do do neu co 1 cai khong khoop
        // mau do : chung minh 1 dieu ham luc dung luc sai -> khong tot
        //de lam duoc dieu nay, ta can tools ho tro, thu vien phu tro - tu so sanh gium expected vs actual, in ra mau sac.
        //Name libra : JUnit, TestNG -- Java
        //                      xUnitm NUnit, MSUnit --C#
        //                      CPPUnit
        //                      PHPUnit
        // .jar, .dll, ....
    }

}
