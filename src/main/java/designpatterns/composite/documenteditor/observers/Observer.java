package designpatterns.composite.documenteditor.observers;

import designpatterns.composite.documenteditor.components.DocumentComponent;

public interface Observer {
    void update(DocumentComponent doc);
}
