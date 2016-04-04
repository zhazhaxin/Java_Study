package cn.alien95.designmode;

/**
 * Created by linlongxin on 2016/4/2.
 */
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {
    }

    public Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
