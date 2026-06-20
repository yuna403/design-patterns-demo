package designpatterns.decorator.Component;

import java.util.Date;

class SumPrizeDecorator extends Decorator {
    public SumPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double prize = super.calcPrize(user, begin, end);
        double sumPrize = calculateSumPrize(user, begin, end);
        System.out.println("Adding sum prize: " + sumPrize);
        return prize + sumPrize;
    }

    private double calculateSumPrize(String user, Date begin, Date end) {
        // 累计奖金计算逻辑
        return 900.0; // 假设返回900.0
    }
}
