package designpatterns.singleton.singleton;

public class UserGeneratorDCL {
    private static volatile UserGeneratorDCL instance;

    private UserGeneratorDCL() {
        if (instance != null) {
            throw new RuntimeException("禁止重复创建实例！");
        }
    }

    public static UserGeneratorDCL getInstance() {
        if (instance == null) {
            synchronized (UserGeneratorDCL.class) {
                if (instance == null) {
                    instance = new UserGeneratorDCL();
                }
            }
        }
        return instance;
    }

    public void generateUser() {
        System.out.println("生成虚拟用户...");
    }
}