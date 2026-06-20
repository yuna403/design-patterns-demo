package designpatterns.composite.filesystemtraversal.components;

import designpatterns.composite.filesystemtraversal.visitors.CustomFileVisitor;

// 文件节点
public class File implements FileSystemNode {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void accept(CustomFileVisitor visitor) { // 自定义接口
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }
}