package designpatterns.composite.filesystemtraversal.components;

import designpatterns.composite.filesystemtraversal.visitors.CustomFileVisitor;

import java.util.ArrayList;
import java.util.List;

// 目录节点
public class Directory implements FileSystemNode {
    private final String name;
    private final List<FileSystemNode> children = new ArrayList<>();

    public List<FileSystemNode> getChildren() { // 添加此方法
        return children;
    }

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemNode node) {
        children.add(node);
    }

    @Override
    public void accept(CustomFileVisitor visitor) { // 正确接口
        visitor.visit(this);
        children.forEach(child -> child.accept(visitor));
    }

    @Override
    public String getName() {
        return name;
    }
}