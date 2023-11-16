package class03;

import java.util.Scanner;
                           // 需要手动导入
/**
 * @author: SGJ
 * @date: 2023/11/15
 * @description:
 */
// 键盘输入代码的四个步骤：
//    1. 导包：import java.util.Scanner;
//    2. 创建 Scanner 类型的对象：Scanner scan = new Scanner(System.in);
//    3. 调用 Scanner 类的相关方法（next() / nextXxx()），来获取指定类型的变量
//    4. 释放资源：scan.close();

// Scanner类中提供了获取byte/short/int/long/float/double/boolean/String类型变量的方法
// 注意: 没有提供char类型变量的方法, 需要使用next().charAt(0)来获取char类型变量
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // next(): 获取String类型的数据
        String name = scanner.next();
        System.out.println("name = " + name);

        // nextInt(): 获取int型类型的数据
        int age = scanner.nextInt();
        System.out.println("age = " + age);

        // nextDouble(): 获取double型类型的数据
        double weight = scanner.nextDouble();
        System.out.println("weight = " + weight);

        // nextBoolean(): 获取Boolean型类型的数据
        boolean isSingle = scanner.nextBoolean();
        System.out.println("isSingle = " + isSingle);

        // 通过转换获取char类型的数据
        char gender = scanner.next().charAt(0);
        System.out.println("gender = " + gender);

        // 关闭资源
        scanner.close();
    }
}
