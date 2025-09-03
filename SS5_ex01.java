// Bài 1 : Tìm từ trong chuỗi
//Viết chương trình nhập vào một chuỗi văn bản và một từ cần tìm trong chuỗi đó.
//Chương trình sẽ kiểm tra xem từ cần tìm có xuất hiện trong chuỗi hay không, nếu có,
// chương trình sẽ in ra vị trí đầu tiên của từ trong chuỗi.
//Nếu từ không xuất hiện trong chuỗi, chương trình sẽ thông báo cho người dùng.

package SS5_Ex;

import java.util.Scanner;

public class SS5_ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // B1 : Cho người dùng nhập vào chuỗi
        System.out.println("Hãy nhập vào chuỗi :");
        String str = input.nextLine();

        // B2: Cho người dùng nhập vào từ cần tìm
        System.out.println("Từ cần tìm :");
        String word = input.nextLine();
        int indexOf = str.indexOf(word); // dùng indexOf để tìm vị trí đầu tiên xuất hiện của chuỗi con
        if (indexOf == -1) { //
            System.out.printf("Không tìm thấy %s trong chuỗi\n ", word);
        } else {
            System.out.printf("Từ %s nằm ở vị trí %d trong chuỗi ",word, indexOf);
        }

    }
}
