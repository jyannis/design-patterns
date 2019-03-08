package Strategy.Implementation;

import Strategy.Algorithm.Compress;

//具体策略角色--Rar压缩
public class Rar implements Compress{
    public void compress() {
        System.out.println("    File to Rar");
    }
}
