package class05_array;

import org.junit.jupiter.api.Test;

/**
 * @author: SGJ
 * @date: 2023/11/16
 * @description:
 */
public class OneDimensionalArrayTest {
    @Test
    public void test01(){
        // 定义数组方式1: 静态初始化
        // 静态初始化方式1
        double[] prices1;
        prices1 = new double[]{20.1, 20.2, 20.3};

        // 静态初始化方式2
        double[] prices2 = new double[]{20.1, 20.2, 20.3};

        // 静态初始化方式3
        double[] prices3 = {20.1, 20.2, 20.3};

        // 错误方式
        // double[] prices4;
        // prices4 = {20.1, 20.2, 20.3}; // 这种静态定义方式不可以声明和初始化分离


        // 定义数组方式2: 动态初始化
        // 动态初始化方式1
        int[] nums1;
        nums1 = new int[3];
        System.out.println(nums1[1]); // input: 0

        // 动态初始化方式2
        int[] nums2 = new int[3];

        // 错误方式
        // int[] nums2 = new int[3]{1, 2, 3}; // 编译错误, 不可以静态和动态放在一起


        // 数组的长度
        System.out.println(nums2.length);
    }

    // 默认初始化值
    @SuppressWarnings("all")
    @Test
    public void test02(){
        int[] nums1 = new int[2];
        double[] doubles = new double[2];
        char[] chars = new char[2];
        boolean[] booleans = new boolean[2];
        String[] strings = new String[2];
        System.out.println(nums1[0]);   // output: 0
        System.out.println(doubles[0]); // output: 0.0
        System.out.println(chars[0]); // output: 0
        System.out.println(booleans[0]); // output: false
        System.out.println(strings[0]); // output: null
    }

}
