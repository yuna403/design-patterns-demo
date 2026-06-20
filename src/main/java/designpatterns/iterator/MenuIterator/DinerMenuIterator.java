package designpatterns.iterator.MenuIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

// 餐厅菜单迭代器
class DinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return items[position++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(
                "remove() is not supported on DinerMenuIterator");
    }
}