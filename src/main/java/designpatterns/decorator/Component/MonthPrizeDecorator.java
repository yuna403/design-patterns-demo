package designpatterns.decorator.Component;

import java.util.Date;

class MonthPrizeDecorator extends Decorator {
    public MonthPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double prize = super.calcPrize(user, begin, end);
        double monthPrize = calculateMonthPrize(user, begin, end);
        System.out.println("Adding month prize: " + monthPrize);
        return prize + monthPrize;
    }

    private double calculateMonthPrize(String user, Date begin, Date end) {
        // 月度奖金计算逻辑
        return 0.0; // 假设返回0.0
    }
}

