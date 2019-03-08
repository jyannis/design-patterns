package Strategy;

import Strategy.Context.Data;
import Strategy.Implementation.GBK;
import Strategy.Implementation.Rar;
import Strategy.Implementation.UTF8;
import Strategy.Implementation.Zip;

public class Test {

    public static void main(String[] args) {
        System.out.println("初始化一份数据Data，编码格式为UTF8，压缩为Zip文件：");
        Data data = new Data(new UTF8(),new Zip());
        data.performCompress();
        data.performEncode();
        System.out.println("修改压缩方式为Rar：");
        data.setCompress(new Rar());
        data.performCompress();
        System.out.println("修改编码格式为GBK：");
        data.setEncode(new GBK());
        data.performEncode();
    }

}
