package class02;

import org.junit.jupiter.api.Test;

/**
 * @author: SGJ
 * @date: 2023/11/10
 * @description:
 */
public class Exercise03Test {
    // 算术运算符
    @Test
    public void test01(){
        // 取模之后的结果可以是浮点数
        double d1 = 4.2;
        double d2 = d1 % 2;
        System.out.println(d2);

        // 取模之后的结果与被模数的符号相同
        int i1 = -12;
        int j1 = 5;
        System.out.println(i1 % j1); // input: -2
        int i2 = 12;
        int j2 = -5;
        System.out.println(i2 % j2); // input: 2
        int i3 = -12;
        int j3 = -5;
        System.out.println(i1 % j3); // input: -2
    }
    
    // 赋值运算符
    @Test
    public void test02(){
        int i1 = 10, i2 = 20;
        System.out.println(i1 + "," + i2);

        
        // +=
        int m1 = 10;
        m1 += 10; // m1 = m1 + 10;

        // +=, *=类似的操作时, 不会改变变量的原来的数据类型
        byte by1 = 10;
        by1 += 10; //  by1 = (byte)(byte + 10)
        int m2 = 1;
        m2 *= 0.1; // m2 = (int)(m2 * 0.1)
    }
    
    // 比较运算符
    @Test
    public void test03(){
    }

    // 位运算符
    // 1. << >>  >>> & | ^  ~: 针对数值类型的变量或常量进行运算, 运算的结果也是数值
    // 2. <<: 在一定范围内, 每向左移动一位, 结果就在原有的基础上*2(对于正数, 负数都适用)
    // 3. >>: 在一定范围内, 每向右移动一位, 结果就在原有的基础上/2(对于正数, 负数都适用)
    @Test
    public void test04(){
        int num1 = 7;
        System.out.println("num1 << 1 : " + (num1 << 1));
        System.out.println("num1 << 2 : " + (num1 << 2)); // 左移两位
        System.out.println("num1 << 3 : " + (num1 << 3));
        System.out.println("num1 << 28 : " + (num1 << 28));
        System.out.println("num1 << 29 : " + (num1 << 29)); // 过犹不及, 变负数

        int num2 = -7;
        System.out.println("num2 << 1 : " + (num2 << 1));
        System.out.println("num2 << 2 : " + (num2 << 2));
        System.out.println("num2 << 3 : " + (num2 << 3));
        System.out.println("num2 << 28 : " + (num2 << 28));
        System.out.println("num2 << 29 : " + (num2 << 29)); // 过犹不及, 变负数

        // 利用^交换两个数
        // a ^ a = 0
        // 0 ^ a = a
        int a = 2;
        int b = 3;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a + "; b: " + b);
    }

    // 条件表达式
    //
    @Test
    public void test05(){
        String info = (2 > 10) ? "表达式1" : "表达式2";
        System.out.println(info);

        double res = (2 > 1) ? 1 : 2.0; // res的数据类型需要兼容1和2.0的数据类型
        System.out.println(res);
    }
}
