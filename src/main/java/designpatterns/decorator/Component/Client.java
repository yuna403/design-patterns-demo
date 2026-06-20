package designpatterns.decorator.Component;

import java.util.Date;

public class Client {public static void main(String[] args) {
    Component component = new ConcreteComponent();
    component = new GroupPrizeDecorator(component);
    component = new SumPrizeDecorator(component);
    component = new MonthPrizeDecorator(component);

    Date begin = new Date(); // 假设开始日期
    Date end = new Date(); // 假设结束日期
    double prize = component.calcPrize("User1", begin, end);
    System.out.println("Total prize: " + prize);
}
}