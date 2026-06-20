package designpatterns.composite.ecommerceorder;

import designpatterns.composite.ecommerceorder.components.CompositeOrder;
import designpatterns.composite.ecommerceorder.components.SimpleOrder;
import designpatterns.composite.ecommerceorder.handlers.Approver;
import designpatterns.composite.ecommerceorder.handlers.DirectorApprover;
import designpatterns.composite.ecommerceorder.handlers.ManagerApprover;
import designpatterns.composite.ecommerceorder.strategies.AlipayStrategy;
import designpatterns.composite.ecommerceorder.strategies.PaymentStrategy;

public class OrderProcessor {
    public static void main(String[] args) {
        // 创建组合订单
        CompositeOrder order = new CompositeOrder();
        order.add(new SimpleOrder(800));
        order.add(new SimpleOrder(3000));

        // 构建审批链（责任链模式）
        Approver manager = new ManagerApprover();
        Approver director = new DirectorApprover();
        manager.setSuccessor(director);

        // 审批订单
        order.process();
        manager.approve(order);

        // 选择支付策略（策略模式）
        PaymentStrategy alipay = new AlipayStrategy();
        alipay.pay(order.getAmount());
    }
}