import java.util.Scanner;

public class Part7 {
    public static void main(String[] args) {
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