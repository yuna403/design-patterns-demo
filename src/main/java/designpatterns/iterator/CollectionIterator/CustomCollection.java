package designpatterns.iterator.CollectionIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomCollection<E> implements Iterable<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CustomCollection() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new CustomIterator();
    }

    // 自定义迭代器实现
    private class CustomIterator implements Iterator<E> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @SuppressWarnings("unchecked")
        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (E) elements[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove not supported");
        }
    }

    public static void main(String[] args) {
        CustomCollection<String> collection = new CustomCollection<>();
        collection.add("Item1");
        collection.add("Item2");
        collection.add("Item3");

        System.out.println("CustomCollection遍历:");
        for (String item : collection) {
            System.out.println(item);
        }
    }
}