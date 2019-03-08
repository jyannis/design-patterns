package Strategy.Implementation;

import Strategy.Algorithm.Encode;

//具体策略角色--GBK编码
public class GBK implements Encode {
    public void encode() {
        System.out.println("    Transcode to GBK");
    }
}
