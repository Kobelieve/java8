package com.kobe.practice.binary;

/**
 * <<: 表示左移，不分正负数，低位补0
 * >>: 带符号右移。正数右移高位补0，负数右移高位补1
 * >>>: 无符号右移。无论是正数还是负数，高位通通补0
 *
 * 对于正数而言，>>和>>>没区别
 */
public class BInaryTest {

    public static void main(String[] args) {
        int num = 2;
        print(num);

        // 左移一位
        num = num << 1;
        print(num);

        // 右移一位
        num = num >>> 1;
        print(num);
    }

    private static void print(int num) {
        System.out.println(Integer.toBinaryString(num));
    }

}
