package designpatterns.iterator.CollectionIterator;


// ArrayList 实现
class ArrayList<E> implements CustomList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;
    private int modCount = 0;

    public ArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E e) {
        ensureCapacity(size + 1);
        elementData[size++] = e;
        modCount++;
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        rangeCheck(index);
        return (E) elementData[index];
    }

    @Override
    public CustomIterator<E> iterator() {
        return new Itr();
    }

    // 内部迭代器实现
    private class Itr implements CustomIterator<E> {
        int cursor;       // 下一个元素的索引
        int lastRet = -1; // 最后返回元素的索引；-1表示没有
        int expectedModCount = modCount;

        public boolean hasNext() {
            return cursor != size;
        }

        @SuppressWarnings("unchecked")
        public E next() {
            checkForComodification();
            int i = cursor;
            if (i >= size)
                throw new RuntimeException("No such element");
            Object[] elementData = ArrayList.this.elementData;
            if (i >= elementData.length)
                throw new RuntimeException("Concurrent modification");
            cursor = i + 1;
            return (E) elementData[lastRet = i];
        }

        public void remove() {
            if (lastRet < 0)
                throw new IllegalStateException();
            checkForComodification();

            try {
                ArrayList.this.remove(lastRet);
                cursor = lastRet;
                lastRet = -1;
                expectedModCount = modCount;
            } catch (IndexOutOfBoundsException ex) {
                throw new RuntimeException("Concurrent modification");
            }
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new RuntimeException("Concurrent modification");
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1); // 增长50%
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elementData, 0, newArray, 0, size);
        elementData = newArray;
    }

    private void rangeCheck(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    public E remove(int index) {
        rangeCheck(index);
        modCount++;
        @SuppressWarnings("unchecked")
        E oldValue = (E) elementData[index];

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);

        elementData[--size] = null; // 清除引用，帮助GC
        return oldValue;
    }
}