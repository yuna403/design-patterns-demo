package designpatterns.decorator.Component;

import java.util.Date;

class ConcreteComponent extends Component {
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        // 基本的奖金计算逻辑
        System.out.println("Calculating basic prize for user: " + user);
        return 0.0; // 假设返回0.0
    }
}
