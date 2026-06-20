package designpatterns.composite.documenteditor.decorators;

import designpatterns.composite.documenteditor.components.DocumentComponent;

// 加粗装饰器
public class BoldDecorator extends FormatDecorator {
    public BoldDecorator(DocumentComponent component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.printf("<b>%s</b>\n", component);
    }
}
