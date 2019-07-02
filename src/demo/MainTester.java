package demo;


import com.xbirds.utils.RsaUtil;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class MainTester {

    public static void main(String[] args) {
        RsaUtil rsaUtil = new RsaUtil();
        String signature = URLDecoder.decode(
        "oy36Yj5sxz%2B26V6GoYAXpmXmtHZ9tuuIq0ijouqwVQogI39yMT9oVG%2B3D67fBfaNkBY6uOL0iNZs%2FrILzsz8UVJ8giAawZa5UrT%2BoBA4uO1n5AWE0qeQdoSHY%2BiXL4Xo7GCwl3T4cZsMKATCunYW%2Bw2V2jEN%2BZ7dDCBTP4eSwz0%3D");
        System.out.println("signature :" + signature);
        // post
        Map<String, String> params = new HashMap<>();
        params.put("app_id", "7");
        params.put("out_trade_no", "5d1afcc893e47576459a6fa8_500001");
        params.put("openid", "aG5ngeKNJQnfKBMpP9iUMy5DgosW5bV4c");
        params.put("status", "3");
        params.put("amount", "10");
        params.put("real_amount", "10");
        params.put("createtime", "1562049738");
        params.put("confirm_time", "1562049741");

        String original_str = rsaUtil.mapToString(params);
        System.out.println("original_str:" + original_str);
        System.out.println("签名结果：" + signature);
        if (rsaUtil.verifyByPublicKey(signature, original_str)) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }
}
