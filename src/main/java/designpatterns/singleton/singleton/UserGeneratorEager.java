package designpatterns.singleton.singleton;

public class UserGeneratorEager {
    private static final UserGeneratorEager instance = new UserGeneratorEager();

    private UserGeneratorEager() {
        if (instance != null) {
            throw new RuntimeException("禁止重复创建实例！");
        }
    }

    public static UserGeneratorEager getInstance() {
        return instance;
    }

    public void generateUser() {
        System.out.println("生成虚拟用户...");
    }
}
