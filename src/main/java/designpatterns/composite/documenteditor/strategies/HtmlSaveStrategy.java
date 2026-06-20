package designpatterns.composite.documenteditor.strategies;

import designpatterns.composite.documenteditor.components.DocumentComponent;

// HTML 保存策略
public class HtmlSaveStrategy implements SaveStrategy {
    @Override
    public void save(DocumentComponent doc) {
        System.out.println("Saving as HTML...");
        doc.accept(new HtmlVisitor()); // 访问者模式配合使用
    }
}