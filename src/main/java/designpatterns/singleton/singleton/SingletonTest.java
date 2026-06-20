package designpatterns.singleton.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        // 验证饿汉式
        UserGeneratorEager eager1 = UserGeneratorEager.getInstance();
        UserGeneratorEager eager2 = UserGeneratorEager.getInstance();
        System.out.println("饿汉式实例唯一性: " + (eager1 == eager2)); // true

        // 验证双重检查锁
        UserGeneratorDCL dcl1 = UserGeneratorDCL.getInstance();
        UserGeneratorDCL dcl2 = UserGeneratorDCL.getInstance();
        System.out.println("双重检查锁实例唯一性: " + (dcl1 == dcl2)); // true

        // 验证IoDH
        UserGeneratorIoDH iodh1 = UserGeneratorIoDH.getInstance();
        UserGeneratorIoDH iodh2 = UserGeneratorIoDH.getInstance();
        System.out.println("IoDH实例唯一性: " + (iodh1 == iodh2)); // true
    }
}
