package designpatterns.composite.documenteditor.decorators;

import designpatterns.composite.documenteditor.components.DocumentComponent;
import designpatterns.composite.documenteditor.observers.Visitor;

public abstract class FormatDecorator implements DocumentComponent {
    protected final DocumentComponent component;

    public FormatDecorator(DocumentComponent component) {
        this.component = component;
    }

    @Override
    public void accept(Visitor visitor) {
        component.accept(visitor);
    }
}