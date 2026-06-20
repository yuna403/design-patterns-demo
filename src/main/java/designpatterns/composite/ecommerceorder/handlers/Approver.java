package designpatterns.composite.ecommerceorder.handlers;

import designpatterns.composite.ecommerceorder.components.OrderComponent;

public abstract class Approver {
    protected Approver successor;

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void approve(OrderComponent order);
}

