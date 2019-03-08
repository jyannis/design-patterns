package Strategy.Implementation;

import Strategy.Algorithm.Encode;

//具体策略角色--UTF8编码
public class UTF8 implements Encode {
    public void encode() {
        System.out.println("    Transcode to UTF8");
    }
}
