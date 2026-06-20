package designpatterns.composite.documenteditor.observers;

import designpatterns.composite.documenteditor.components.DocumentComponent;

import java.util.ArrayList;
import java.util.List;

// 主题：文档管理器
public class DocumentManager {
    private final List<Observer> observers = new ArrayList<>();
    private DocumentComponent document;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void setDocument(DocumentComponent document) {
        this.document = document;
        notifyObservers();
    }

    private void notifyObservers() {
        observers.forEach(o -> o.update(document));
    }
}