package designpatterns.composite.ecommerceorder.handlers;

import designpatterns.composite.ecommerceorder.components.OrderComponent;

// 经理审批者
public class ManagerApprover extends Approver {
    @Override
    public void approve(OrderComponent order) {
        if (order.getAmount() < 1000) { // 使用 getAmount()
            System.out.println("Manager approved the order.");
        } else if (successor != null) {
            successor.approve(order);
        }
    }
}