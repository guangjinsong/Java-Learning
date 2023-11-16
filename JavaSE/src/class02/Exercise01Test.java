package class02;

import org.junit.jupiter.api.Test;

public class Exercise01Test {
    @Test
    // 浮点数
    public  void test01() {
        // 浮点数的定义
        double d1 = 12.3;
        float f1 = 12.3f;

        // 0.1 + 0.2 != 0.3
        System.out.println(0.1 + 0.2);
    }

    // 字符
    @Test
    public void test02() {
        // 字符类型: char(2个字节）
        // 表示形式1：使用一对''表示，内部有且一个字符
        char c1 = 'a';
        char c2 = '1';
        char c3 = '中';
        // char c4 = '';  // 编译不通过
        // char c5 = 'ab'; // 编译不通过

        // 表示形式2：直接使用Unicode值来表示字符型常量
        char c6 = '\u0036';
        System.out.println(c6);

        // 表示形式3：使用转移字符“\”
        char c7 = '\n';
        char c8 = '\t';
        System.out.println("hello" + c7 + "world");

        // 表示形式4：ASCII码, 使用具体字符对应的数值
        char c9 = 97;
    }

    // 布尔类型
    @Test
    public void test03(){
        // 只有两个取值:true false
        // 从定义语言规范上, 不谈布尔类型占几个字节
        // 布尔类型不是true就是false
        boolean b1 = true;
        boolean b2 = false;
        // boolean b3 = 0; // 编译不通过
    }
}
