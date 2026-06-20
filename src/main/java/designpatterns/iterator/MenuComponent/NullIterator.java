package designpatterns.iterator.MenuComponent;

import java.util.Iterator;

// 空迭代器
class NullIterator implements Iterator<MenuComponent> {
    public MenuComponent next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
