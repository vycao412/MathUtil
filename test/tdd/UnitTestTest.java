/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

//nếu netbeans 10 xóa 2 dòng import phía dưới
//Libraries/Add Jar/C:/Program Files/netbeans-12.0/platform/modules/ext/junit-4.12.jar + hamcrest-core.1.3.jar
//Kích vào lỗi chọn theo truyền thống

import org.junit.Test;
import static org.junit.Assert.*;
import static vy.util.MathUtil.computeFactorial;

/**
 *
 * @author User
 */
public class UnitTestTest {
    
    //đây là class truyền thống, dùng để test code chính của mình ở bên MathUtil
    //nhưng ta không xài sout() mà ta xài màu sắc xanh đỏ
    //class này chứa rất nhiều hàm main()
    //muốn có hàm bk trong này thành main() bạn chỉ việc xài annotation
    //@Test, JVM sẽ tự động hiểu hàm này là main() và Shift F6 chạy từ đó
    //nếu có nhiều @Test tức là nhiều main() trong này, các main() sẽ
    //chạy tuần tự theo mặc định từ trên xuống
    
    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases() {
        computeFactorial(-5);
        //hàm này dùng để test các tình huống cà chớn đến từ người dùng
        //ví dụ người dùng muốn tính -5! thì tính thế mẹ nào được
        //khi đó trong thiết kế của hàm cF() ta phải dự liệu tình huống cà chớn này
        //tức là người dùng đưa data cà chớn vào thì mình ném ra cái ngoại lệ
        //hok thèm xử lí cF(-5) đập vào mặt cái ngoại lệ
        //và ngoại lệ là 1 thứ bất thường, không như dự tính, không phải là 1 loại
        //value có thể so sánh, tức là ko thể assertEquals(một-cái-ngoại-lệ)
        //vì assert() trong tiếng Anh nghĩa là so sánh 2 thứ gì đó
        //tức là phải có value để so, mà ngoại lệ Exception thì ko phải là value
        //ta phải dùng chiêu
    }
    
    //dù code bạn viết có đỏ hay xanh miễn ko bị lỗi cú pháp khi gõ, lỗi import
    //thì CLEAN & BUILD LUÔN RA ĐC FILE .JAR .WAR
    //lí do là cái thằng Clean & Build nó chỉ kiểm tra code không sai cú pháp
    //nó ko care code có sai logic xử lí hay ko
    
    //MÌNH CHƠI LỚN:
    //NẾU CODE ĐANG MÀU ĐỎ, HOK PHẢI XANH, CẤM CLEAN & BUILD ĐỂ ĐẢM BẢO RẰNG
    //CODE PHẢI CHẠY ĐÚNG (MÀU XANH) CHO CÁC TÌNH HUỐNG XÀI THỬ QUA ASSERT()
    //TỨC LÀ ĐÚNG VỀ XỬ LÍ THÌ MỚI CHO RA FILE .JAR .WAR
    //TỨC LÀ ĐÈN XANH THÌ THÔNG ĐƯỜNG
    //ĐỎ, VỊN LẠI, HOK CHO RA .JAR .WAR
    //PLEASE, NHỚ 2 CON SỐ
    //NETBEAN 8X, 1005
    //NETBEANS 10X TRỞ LÊN, 1204
    
    @Test //hàm main này dùng để test các tình huống hàm cF() nhận đúng tham số
    //và mày phải chạy đúng như kì vọng
    public void testSuccessfulCase() {
//        assertEquals(120, 720);
        //hy vọng 5! trả về 120, không như thế, màu đỏ nha bạn
        assertEquals(120, computeFactorial(5));
        
        //hy vọng 6! trả về 720, không như thế, màu đỏ nha bạn
        assertEquals(720, computeFactorial(6));
        
        assertEquals(1, computeFactorial(0)); //hy vọng 0! là 1 heng
        assertEquals(1, computeFactorial(1)); //hy vọng 1! là 1 heng
        assertEquals(2, computeFactorial(2)); //hy vọng 1! là 1 heng
        
        //xanh chỉ xảy ra khi tất cả xanh, hàm ý hàm chạy đúng kì vọng mọi trường hợp
        //đỏ thì chỉ cần 1 thằng đỏ trong cả đám xanh
        //hàm ý: màu xanh gần hết, còn vài case màu đỏ
        //chứng tỏ xử kí hàm không tốt, không chạy tốt trong mọi trường hợp
        
    }
    
}
