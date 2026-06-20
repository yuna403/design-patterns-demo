package designpatterns.composite.documenteditor.strategies;

import designpatterns.composite.documenteditor.components.CompositeElement;
import designpatterns.composite.documenteditor.components.TextElement;
import designpatterns.composite.documenteditor.observers.Visitor;

// HTML 访问者
public class HtmlVisitor implements Visitor {
    @Override
    public void visit(TextElement element) {
        System.out.printf("<p>%s</p>\n", element);
    }

    @Override
    public void visit(CompositeElement element) {
        System.out.println("<div>");
        element.getChildren().forEach(c -> c.accept(this));
        System.out.println("</div>");
    }
}




