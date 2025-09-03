//T* Bài 4 : Kiểm tra định dạng email
package SS5_Ex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SS5_ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        do {
            //T* B1 : Cho người dùng nhập vào chuỗi
            System.out.println(" Hãy nhập email :");
            String email = input.nextLine();
            //T* B2 : Validate email bằng hàm isEmailValid ở dưới
            if (isEmailValid(email)) {
                System.out.println("Email hợp lệ");
                break;
            } else {
                System.out.println("Email không hợp lệ");
            }
        } while (true);


    }

    public static boolean isEmailValid(String email) {
        final String regex = "^\\w+@\\w+.\\w+$";
        boolean result = Pattern.matches(regex, email);
        return result;
    }
}
