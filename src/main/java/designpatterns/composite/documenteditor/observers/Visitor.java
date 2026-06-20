package designpatterns.composite.documenteditor.observers;

import designpatterns.composite.documenteditor.components.CompositeElement;
import designpatterns.composite.documenteditor.components.TextElement;

public interface Visitor {
    void visit(TextElement element);
    void visit(CompositeElement element);
}