package designpatterns.composite.documenteditor; // 包声明与目录名一致

import designpatterns.composite.documenteditor.components.CompositeElement;
import designpatterns.composite.documenteditor.components.TextElement;
import designpatterns.composite.documenteditor.decorators.BoldDecorator;
import designpatterns.composite.documenteditor.observers.DocumentManager;
import designpatterns.composite.documenteditor.observers.PreviewWindow;
import designpatterns.composite.documenteditor.strategies.HtmlSaveStrategy;

public class DocumentEditor {
    public static void main(String[] args) {
        // 组合模式：创建文档结构
        CompositeElement document = new CompositeElement();
        document.add(new TextElement("Hello, Design Patterns!"));

        // 装饰器模式：添加加粗装饰
        var boldText = new BoldDecorator(document);

        // 观察者模式：注册预览窗口
        DocumentManager manager = new DocumentManager();
        manager.attach(new PreviewWindow());
        manager.setDocument(boldText);

        // 策略模式：保存为HTML
        new HtmlSaveStrategy().save(boldText);
    }
}