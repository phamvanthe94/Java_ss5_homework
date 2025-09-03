//T* Bài 3: Thay thế kí tự trong chuỗi
// Viết chương trình nhập vào một chuỗi từ bàn phím và thay thế tất cả
// các ký tự số (0-9) trong chuỗi đó bằng ký tự *.
//Chương trình sẽ sử dụng phương thức replaceAll() hoặc replace() để thực hiện việc thay thế.
//Kết quả là chuỗi đã thay thế các ký tự số sẽ được in ra
package SS5_Ex;

import java.util.Scanner;

public class SS5_ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // B1 : Cho người dùng nhập vào chuỗi
        System.out.println("Hãy nhập vào chuỗi :");
        String input = sc.nextLine();
        // B2 : Thay thế tất cả các kí tự số trong chuỗi bằng *
        String result = input.replaceAll("[0-9]", "*");
        // B3 : In ra chuỗi đã thay thế
        System.out.println(result);

    }
}
