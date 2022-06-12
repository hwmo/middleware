package com.mhw.middleware.server.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RedPacketUtil {

    public static List<Integer> divideRedPackage(int amount, int num){
        List<Integer> redList = new ArrayList<>();
        if(amount > 0 && num > 0){
            int resAmount = amount;
            int resNum = num;
            int result = 0;
            for(int i = 0; i < num; i++){
                if(i == num-1){
                    result = resAmount;
                }else {
                    Random random = new Random();
                    result = random.nextInt(resAmount * 2 / resNum -1) + 1;
                }
                redList.add(result);
                resAmount -= result;
                resNum--;
            }
        }
        return redList;
    }

}
