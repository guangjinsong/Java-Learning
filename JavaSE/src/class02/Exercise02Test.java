package class02;

import org.junit.jupiter.api.Test;

/**
 * @author: SGJ
 * @date: 2023/11/8
 * @description: 基本数据类型变量之间的类型转换(除boolean之外)
 */
public class Exercise02Test {
    // 自动类型转换
    @Test
    public void test01(){
        int i1 = 1;
        long l1 = 123; // 123是int型, 先自动类型提升到long, 然后再赋值给l1
        // long l2 = 1_000_000_000_000_000; // 1_000_000_000_000_000还是被看成int型, 但超过了int整型的范围, 必须加后面L, 变成long的字面型整形常量
        long l3 = 1_000_000_000_000_000L; // 此时的1_000_000_000_000_000L就是使用8个字节存储的long整型的值

        // float f3 = 12.3; // 12.3是double类型, 不可以自动转换成float, 所以会报错
        float f4 = 12.3f; // 浮点型字面量常量后面加f, 就可以看成float型字面量

        byte b1 = 10;
        // byte b2 = b1 + 1; // (b1 + 1)的运行结果是int类型, 不可以自动转换成byte
        int i3 = b1 + 1;
    }

    /*
     强制类型转换
     */
    @Test
    public void test02(){
        double d1 = 12; // 自动类型提升
        int i1 = (int)d1; // 强制类型转换

        int i3 = 12;
        float f1 = (int)i3; // 编译可以通过. 只不过可以省略()

        int i5 = 128;
        byte b1 = (byte)i5;
        System.out.println(b1);
    }

    /*
    基本数据类型与String的运算
    一 关于String的理解
    1. String类. 属于引用数据类型, 俗称字符串
    2. String类型的变量, 可以使用一对""的方式进行赋值
    3. String声明的字符串内部, 可以包含0个,1个或多个字符
     二 String与基本数据类型变量间的运算
     1. 这里的基本数据类型包括boolean在内的8种
     2. String与基本数据类型变量间只能做连接运算, 使用"+"表示
     3. 运算的结果是String类型
     */
    @Test
    public void test03(){
        String s1 = "";
        String s2 = "a";
        char c1 = 'a';


        // 测试连接运算
        int num1 = 10;
        boolean b1 = true;
        String str1 = "hello";
        String str2 = str1 + num1;
        System.out.println(str1 + b1);
        System.out.println(str2);

        // 编译不通过. 第一个"+"是运算符, 而不是连接符
        // String str3 = b1 + num1 + str1;

    }
}
