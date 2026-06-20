package designpatterns.composite.documenteditor.strategies;

import designpatterns.composite.documenteditor.components.DocumentComponent;

public interface SaveStrategy {
    void save(DocumentComponent doc);
}
