package designpatterns.composite.documenteditor.components;

import designpatterns.composite.documenteditor.observers.Visitor;

// 叶子节点：文本元素
public class TextElement implements DocumentComponent {
    private final String content;

    public TextElement(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}