package com.cloud.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class IntParseDecimal {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    private static final BigDecimal yuanToFen = new BigDecimal("100");

    private static String amountTrans(int billFee){
        if (billFee < 0) {
            return "";
        };
        return df.format((double) billFee / 100);
    }

    private static String yuanToFen(int billFee){
        if (billFee < 0) {
            return "";
        };
        BigDecimal fee = new BigDecimal(billFee);
        fee = fee.divide(yuanToFen);
        return fee.toString();
    }


    public static void main(String[] args) {

        long startTime1 = System.currentTimeMillis();
        System.out.println(amountTrans(3435));
        System.out.println(amountTrans(0));
        System.out.println(amountTrans(999));
        System.out.println(amountTrans(876));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(amountTrans(Integer.MAX_VALUE));
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);

        System.out.println("========================================");

        long startTime2 = System.currentTimeMillis();
        System.out.println(yuanToFen(3435));
        System.out.println(yuanToFen(0));
        System.out.println(yuanToFen(999));
        System.out.println(yuanToFen(876));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(amountTrans(Integer.MAX_VALUE));
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);
    }
}
