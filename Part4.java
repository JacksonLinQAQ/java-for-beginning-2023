import java.util.Scanner;

public class Part4 {
    public static void main(String[] args) {
        // 迴圈
        // For loop
        // 語法：for (初始值; 條件; 每次迴圈的操作) { ... }
        // 補充：i++ 代表 i = i + 1，i += 2 代表 i = i + 2
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // While loop
        // 語法：while (條件) { ... }
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}