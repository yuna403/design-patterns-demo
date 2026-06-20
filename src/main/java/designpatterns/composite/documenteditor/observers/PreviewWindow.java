package designpatterns.composite.documenteditor.observers;

import designpatterns.composite.documenteditor.components.DocumentComponent;

// 预览窗口
public class PreviewWindow implements Observer {
    @Override
    public void update(DocumentComponent doc) {
        System.out.println("=== Preview Updated ===");
        doc.print();
    }
}
