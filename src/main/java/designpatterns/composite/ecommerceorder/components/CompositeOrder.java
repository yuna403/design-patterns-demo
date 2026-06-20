package designpatterns.composite.ecommerceorder.components;

import java.util.ArrayList;
import java.util.List;

// 复合订单
public class CompositeOrder extends OrderComponent {
    private final List<OrderComponent> children = new ArrayList<>();

    public void add(OrderComponent child) {
        children.add(child);
    }

    @Override
    public void process() {
        children.forEach(OrderComponent::process);
    }
}

