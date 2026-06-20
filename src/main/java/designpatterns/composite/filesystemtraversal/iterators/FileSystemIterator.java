package designpatterns.composite.filesystemtraversal.iterators;

import designpatterns.composite.filesystemtraversal.components.Directory;
import designpatterns.composite.filesystemtraversal.components.FileSystemNode;

import java.util.Iterator;
import java.util.Stack;

public class FileSystemIterator implements Iterator<FileSystemNode> {
    private final Stack<FileSystemNode> stack = new Stack<>();

    public FileSystemIterator(FileSystemNode root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public FileSystemNode next() {
        FileSystemNode node = stack.pop();
        if (node instanceof Directory) {
            ((Directory) node).getChildren().forEach(stack::push); // 后入先出实现深度优先遍历
        }
        return node;
    }
}