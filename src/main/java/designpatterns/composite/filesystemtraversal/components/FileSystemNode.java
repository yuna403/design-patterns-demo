package designpatterns.composite.filesystemtraversal.components;
import designpatterns.composite.filesystemtraversal.visitors.CustomFileVisitor;

public interface FileSystemNode {
    void accept(CustomFileVisitor visitor); // 唯一访问者类型
    String getName();
}