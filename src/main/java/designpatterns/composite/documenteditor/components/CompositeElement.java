package designpatterns.composite.documenteditor.components;

import designpatterns.composite.documenteditor.observers.Visitor;

import java.util.ArrayList;
import java.util.List;

// 组合节点：复合元素
public class CompositeElement implements DocumentComponent {
    private final List<DocumentComponent> children = new ArrayList<>();

    public List<DocumentComponent> getChildren() { // 添加此方法
        return children;
    }
    public void add(DocumentComponent component) {
        children.add(component);
    }

    @Override
    public void print() {
        children.forEach(DocumentComponent::print);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        children.forEach(c -> c.accept(visitor));
    }
}