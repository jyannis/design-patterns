package Strategy.Implementation;

import Strategy.Algorithm.Compress;

//具体策略角色--Zip压缩
public class Zip implements Compress {
    public void compress() {
        System.out.println("    File to Zip");
    }
}
