package designpatterns.composite.filesystemtraversal.visitors;

import designpatterns.composite.filesystemtraversal.components.Directory;
import designpatterns.composite.filesystemtraversal.components.File;

// 统计访问者（打印节点类型）
public class StatsVisitor implements CustomFileVisitor { // 改为自定义 FileVisitor
    @Override
    public void visit(File file) {
        System.out.printf("File: %s\n", file.getName());
    }

    @Override
    public void visit(Directory directory) {
        System.out.printf("Directory: %s (children: %d)\n",
                directory.getName(), directory.getChildren().size()); // 添加 getChildren() 方法
    }
}
