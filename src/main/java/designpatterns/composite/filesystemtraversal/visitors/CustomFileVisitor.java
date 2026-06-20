package designpatterns.composite.filesystemtraversal.visitors;

import designpatterns.composite.filesystemtraversal.components.Directory;
import designpatterns.composite.filesystemtraversal.components.File;

public interface CustomFileVisitor { // 改为 CustomFileVisitor
    void visit(File file);
    void visit(Directory directory);
}