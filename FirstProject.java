import java.util.Scanner;

public class FirstProject {
    public static void main(String[] args) {
        // 用//代表程式注解
        // 輸出資料
        System.out.println("Hello World");

        // 資料形態
        // 123 int 整數
        System.out.println(123);
        // 100000000000000L long 長整數
        System.out.println(100000000000000L);

        // 12.3333333333333F float 單精度浮點數
        System.out.println(12.33333333333333F);
        // 12.3333333333333 double 雙精度浮點數
        System.out.println(12.33333333333333);

        // 'A' char 字元
        System.out.println('A');
        // "Hello World" String 字串
        System.out.println("Hello World");

        // true/false boolean 布林值
        System.out.println(true);
        System.out.println(false);

        // 變數
        // 使用 var 關鍵字定義或者直接使用對應資料形態名稱定義
        var a = 123;
        System.out.println(a);

        String b = "Hello World";
        System.out.println(b);

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

        // 小小小任務：使用for或while循環，在每一次循環中輸出"第n次循環"
        for (int j = 0; j < 10; j++) {
            System.out.println("第" + String.valueOf(j) + "次循環");
        }

        // 算法：解一元二次方程
        // 取得用戶輸入
        // 建立Scanner物件來獲取用戶輸入（方程的a, b, c值）
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一元二次方程的a值：");
        double A = scanner.nextDouble();
        System.out.print("請輸入一元二次方程的b值：");
        double B = scanner.nextDouble();
        System.out.print("請輸入一元二次方程的c值：");
        double C = scanner.nextDouble();

        // 檢查delta值
        double delta = Math.pow(B, 2) - 4 * A * C;
        if (delta < 0) {
            System.out.println("f(x)無解");
        } else if (delta == 0) {
            System.out.println("f(x) = " + String.valueOf((-B + Math.sqrt(delta)) / (2 * A)));
        } else if (delta > 0) {
            System.out.println(
                "f(x) = " +
                String.valueOf((-B + Math.sqrt(delta)) / (2 * A)) +
                " 或 " + 
                String.valueOf((-B - Math.sqrt(delta)) / (2 * A))
            );
        }
    }
}