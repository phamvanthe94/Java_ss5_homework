//T* Bài 6 :Kiểm tra mật khẩu hợp lệ
package SS5_Ex;

import java.util.Scanner;

public class SS5_ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // B1 : Cho người dùng nhập vào password
        do {
            System.out.println("Nhập vào password:");
            String password = input.nextLine();
            if (isPasswordValid(password)) {
                System.out.println("Password hợp lệ:");
                break;
            } else {
                System.out.println("Password không hợp lệ");
            }
        } while (true);
    }
    public static boolean isPasswordValid(String password) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$!%]).{8,}$";
        return password.matches(pattern);
    }
}
