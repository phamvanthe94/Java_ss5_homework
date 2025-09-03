//T* Bài 2: Xóa và thay thế phần tử trong StringBuilder
// Yêu cầu:
//Chuỗi ban đầu:
//Khởi tạo một chuỗi ban đầu là: "Hello, Java World!".
//Thực hiện các thao tác:
//Xóa các ký tự từ vị trí 5 đến 9 trong chuỗi.
//Thay thế đoạn "World" bằng "Universe".
//In kết quả:
//In chuỗi ban đầu.
//In chuỗi sau khi xóa.
//In chuỗi sau khi thay thế
package SS5_Ex;

import java.util.Scanner;

public class SS5_ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // B1 : Khởi tạo chuỗi ban đầu với StringBuilder
        StringBuilder sb = new StringBuilder("Hello,Java World!");
        System.out.println("Chuỗi ban đầu : " + sb );
        // B2 : Xóa các kí tự từ vị trí 5 đến 9 trong chuỗi
        StringBuilder delete = sb.delete(5, 9);
        System.out.println("Chuỗi sau khi xóa : " + delete );

        // B3 : Thay thế đoạn World = Universe
        StringBuilder replace = sb.replace(7,12,"Universe");
        System.out.println("Chuỗi sau khi thay thế : " + replace );
    }
}
