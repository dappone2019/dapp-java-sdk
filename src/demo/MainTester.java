package demo;


import com.xbirds.utils.RsaUtil;

public class MainTester {

    public static void main(String[] args) {
        RsaUtil rsaUtil = new RsaUtil();
        String signature = "qwA28Tgmr+iF72m1oiha4ziQx1PJoPWaUOVB2GbtIiCmZblir6/t5NF/n5NTvemw5sj/XLS18rxn5WL7SEVK53wM5A75LL4X0ZtKdYZ3xCtd8uAzAuHsZ3ZJt2gWR/eQvCn6xJYdt3HYALVfVQBJqFTAKHUwW1+9bpAVbiisS5I=";
        String original_str = "age=33&bool=1&name=厉害";
        System.out.println("签名结果：" + signature);
        if (rsaUtil.verifyByPublicKey(signature, original_str)) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }
}
