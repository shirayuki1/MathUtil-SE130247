/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import junit.framework.Assert;
import khoant.util.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ermii
 */
public class MathUtilTest {

    //muon chay thi co main rieng, nhan shift + F6 de chay
    // moi ham trong class nay se biet thanh main() // nhieu main() trong 1 class - van duoc
    // thi ham can phai co ki hieu/ chi dan/ annotaion @Test;
    @Test
    public void testSuccessfulCases() {
        //test cac tnh huong tham so dua vcho ham van test 1 cach tu te
        //Assert.assertEquals(30, 40);
        Assert.assertEquals(30, 30);
        Assert.assertEquals(1, MathUtil.computerFactorial(0));
        Assert.assertEquals(1, MathUtil.computerFactorial(1));
        Assert.assertEquals(2, MathUtil.computerFactorial(2));
        Assert.assertEquals(6, MathUtil.computerFactorial(3));
        Assert.assertEquals(24, MathUtil.computerFactorial(4));
        Assert.assertEquals(120, MathUtil.computerFactorial(5));
    }

    @Test(expected = IllegalArgumentException.class) // khong nem ra ngoai le theo ki vong -> do
    public void testFaildCases() {
        //test cac tinh huong tham so dua vao ham test ca chon
        //dieu gi xay ra neu, nguoi dung muon tinh cF(-5)
        //xin loi tinh khong duoc, nen quang ra 1 masseger chui nguoi dung, dua am sao tinh
        // neu ra 1 cai exception bao rang tham so ca chon, dau vao vo van
        //ngoai le, la mot tinh huong bat thuong khong nhu du dinh
        //va no khong phai la 1 value de co the so sanh duoc
        //khong the xai ham Assert.assertEquals()
        //ta phai xai skill khac
        //IllegalArgumentException : ngoai le tham so chuyen vao
        MathUtil.computerFactorial(-5);

        //ham so tra ve mau do, ko nem ve ngoai le nhu ki vong.
        //code minh con sai trong tinh huong so am, so duong da mau xanh roi
        //ham con sai ve logic , ko sai ngu phap, ham cF()
        //nhung cho di viet kieu cu sout() ben main() hay asserE() ben JUnit
        // thi code sai logic/ mau do van ko ngan dc viec ta nhan nut Clean & Build
        //tuc la code ko sai cu phap, van thoaai mai .jar, .dll
        //dieu nay ko hay, ko tot
        // JUnit co the ket hop vs ANT de cam ra file .JAR .WAR neu code con mau do
        //Disable nut Clean & Build neu mau do van con trong luc chay TEST
        //Nho 2 con so : 1005 NETBEANS 8 , 1204 NETBEANS 20 TRO LEN
    }

}
