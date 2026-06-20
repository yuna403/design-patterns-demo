package designpatterns.singleton.singleton;

public class UserGeneratorIoDH {
    private UserGeneratorIoDH() {
        if (Holder.instance != null) {
            throw new RuntimeException("禁止重复创建实例！");
        }
    }

    private static class Holder {
        private static final UserGeneratorIoDH instance = new UserGeneratorIoDH();
    }

    public static UserGeneratorIoDH getInstance() {
        return Holder.instance;
    }

    public void generateUser() {
        System.out.println("生成虚拟用户...");
    }
}