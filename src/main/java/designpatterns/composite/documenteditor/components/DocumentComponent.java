package designpatterns.composite.documenteditor.components;

import designpatterns.composite.documenteditor.observers.Visitor;

public interface DocumentComponent {
    void print();
    void accept(Visitor visitor);
}