package Strategy.Context;

import Strategy.Algorithm.Compress;
import Strategy.Algorithm.Encode;

//环境角色--数据
public class Data {

    //声明一个算法（编码）接口的引用变量
    private Encode encode;

    //声明一个算法（压缩）接口的引用变量
    private Compress compress;

    //行为委托给算法
    public void performEncode(){
        encode.encode();
    }
    public void performCompress(){
        compress.compress();
    }

    public Data(Encode encode, Compress compress) {
        this.encode = encode;
        this.compress = compress;
    }

    //构建setter使算法支持动态替换
    public void setEncode(Encode encode) {
        this.encode = encode;
    }
    public void setCompress(Compress compress) {
        this.compress = compress;
    }
}
