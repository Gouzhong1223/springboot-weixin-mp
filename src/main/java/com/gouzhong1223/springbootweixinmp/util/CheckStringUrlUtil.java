package com.gouzhong1223.springbootweixinmp.util;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : 将微信验证时候传过来的字符串排序
 * @Date : create by QingSong in 2019-12-25 1:30 下午
 * @Email : 1162864960@qq.com
 * @Since : JDK 1.8
 * @ProjectName : springboot-weixin-mp
 */
@Component
public class CheckStringUrlUtil {

    private static final String token;

    static {
        token = "gouzhong1223";
    }

    public static boolean sort(String signature, String timestamp, String nonce) {
        java.lang.String[] strings = {token, timestamp, nonce};
        Arrays.sort(strings);
        StringBuffer stringBuffer = new StringBuffer();
        for (java.lang.String string : strings) {
            stringBuffer.append(string);
        }

        String sha1 = Sha1Util.getSha1(stringBuffer.toString());

        return sha1.equals(signature);

    }
}
