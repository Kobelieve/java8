package com.kobe.practice.interfaces;

/**
 * @ClassName FormulaImpl
 * @Description FormulaImpl
 * @Author Tao
 * @Date 2019-04-30 16:35
 * @Version 1.0
 */
public class FormulaImpl {

    /**
     * 可以通过匿名内部类访问接口
     * @param args
     */
    public static void main(String[] args) {

        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        // 10.0
        System.out.println(formula.sqrt(100));
        // 40.0
        System.out.println(formula.calculate(16));
    }

}
