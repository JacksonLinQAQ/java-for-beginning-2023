import java.util.Scanner;

public class Part5 {
    public static void main(String[] args) {
        // 資料形態轉換
        // 範圍大小排序：
        // 整數：byte < short < int < long
        // 浮點數：float < double
        // 方法一：
        byte n1 = 3;
        short n2 = n1;
        int n3 = n2;
        long n4 = n3;
        float n5 = n4;
        double n6 = n5;
        // 注意：不能逆向轉換

        // 方法二：可逆向强制轉換
        double n7 = 123.456;
        float n8 = (float) n7;
        long n9 = (long) n8;
        int n10 = (int) n9;
        short n11 = (short) n10;
        byte n12 = (byte) n11;
        // 注意：强制轉換可能會導致數字不正確或者數字精準度，因此需要謹慎使用

        // 方法三：字串 -> 數字
        int n13 = Integer.parseInt("123");
        long n14 = Long.parseLong("123456789012345");
        float n15 = Float.parseFloat("123.456");
        double n16 = Double.parseDouble("123.45678910123");

        // 方法四：數字 -> 字串
        String n17 = String.valueOf(123);
        String n18 = String.valueOf(123.456F);
        String n19 = String.valueOf(123.45678910123);
        String n20 = String.valueOf(true);
    }
}