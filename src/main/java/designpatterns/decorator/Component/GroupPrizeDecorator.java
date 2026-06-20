package designpatterns.decorator.Component;

import java.util.Date;

class GroupPrizeDecorator extends Decorator {
    public GroupPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double prize = super.calcPrize(user, begin, end);
        double groupPrize = calculateGroupPrize(user, begin, end);
        System.out.println("Adding group prize: " + groupPrize);
        return prize + groupPrize;
    }

    private double calculateGroupPrize(String user, Date begin, Date end) {
        // 团队奖金计算逻辑
        return 1900.0; // 假设返回1900.0
    }
}
