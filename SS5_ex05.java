//T* Bài 5 : So sánh hiệu suất giữa String , StringBuider , StringBuffer

package SS5_Ex;

import java.util.Scanner;

public class SS5_ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LOOP_COUNT = 100000;

        //T* String
        String str = "Hello";
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < LOOP_COUNT; i++) {
            str += " World";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thời gian nối chuỗi với String:" + (endTime - startTime) + " ms");

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder(" Hello");
        startTime = System.currentTimeMillis();
        for(int i = 0; i < LOOP_COUNT; i++) {
            stringBuilder.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian nối chuỗi với StringBuilder :" + (endTime - startTime) + " ms");

        // StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.currentTimeMillis();
        for(int i = 0; i < LOOP_COUNT; i++) {
            stringBuffer.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian nối chuỗi với StringBuffer :" + (endTime - startTime) + " ms");
    }
}
