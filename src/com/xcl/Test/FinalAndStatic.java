package com.xcl.Test;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/17/18:28
 * @description: TODO
 */

import java.util.Random;

public class FinalAndStatic {
    private final Random rand = new Random(48);
    private final int i = rand.nextInt(20);
    final static int j = 22;

    @Override
    public String toString() {
        return "i="+i+",j="+j;
    }
    public void print(FinalAndStatic f){
        System.out.println(f);
    }

    public static void main(String[] args) {
        FinalAndStatic f1 = new FinalAndStatic();
        f1.print(f1);
        FinalAndStatic f2 = new FinalAndStatic();
        f1.print(f1);
        f2.print(f2);
    }

}
