package designpatterns.composite.filesystemtraversal;

import designpatterns.composite.filesystemtraversal.components.Directory;
import designpatterns.composite.filesystemtraversal.components.File;
import designpatterns.composite.filesystemtraversal.components.FileSystemNode;
import designpatterns.composite.filesystemtraversal.iterators.FileSystemIterator;
import designpatterns.composite.filesystemtraversal.visitors.CustomFileVisitor;
import designpatterns.composite.filesystemtraversal.visitors.StatsVisitor;

public class FileTraverser {
    public static void main(String[] args) {
        // 创建文件系统结构（组合模式）
        Directory root = new Directory("/root");
        root.add(new File("file1.txt"));

        Directory docs = new Directory("docs");
        docs.add(new File("report.pdf"));
        root.add(docs);

        // 遍历文件系统（迭代器模式）
        FileSystemIterator iterator = new FileSystemIterator(root);
        CustomFileVisitor visitor = new StatsVisitor(); // 访问者模式配合使用

        while (iterator.hasNext()) {
            FileSystemNode node = iterator.next();
            node.accept(visitor);
        }
    }
}