package class03;

import org.junit.jupiter.api.Test;
import static java.lang.Math.random;

/**
 * @author: SGJ
 * @date: 2023/11/15
 * @description: random()函数的测试
 */
public class RandomTest {
    @Test
    public void test01(){
        // 获取一个[0.0 1.0)的double随机数
        double random1 = random();

        // 获取一个[0 100]的int随机数
        int random2 = (int)(Math.random() * 101);

        // 获取一个[1 100]的int随机数
        int random3 = (int)(Math.random() * 100) + 1;

        // 获取一个[a b]的int随机数
        // int random4 = (int)(Math.random() * (b - a + 1)) + a;
    }
}
