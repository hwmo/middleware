package com.mhw.middleware.server.test;

import com.mhw.middleware.server.util.RedPacketUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RedPacketTest {
    private static final Logger log = LoggerFactory.getLogger(RedPacketTest.class);

    @Test
    public void one() throws Exception{
        int amount = 100;
        int num = 10;
        List<Integer> redList = RedPacketUtil.divideRedPackage(amount, num);
        log.info("总金额{}元，红包个数{}个",amount/100,num);
        System.out.println("总金额"+amount/100 + "元，红包个数"+num+"个");

        int sum = 0;
         for(int value : redList){
             System.out.println("------------------红包金额：" + value/100f + "元");
             sum += value;
         }
         log.info("发红包金额是否等于抢红包金额总额："+isEqual(amount, sum));
        System.out.println("发红包金额是否等于抢红包金额总额："+isEqual(amount, sum));
    }

    public static String isEqual(int value1, int value2){
        return value1 == value2 ? "是" : "否";
    }

}
