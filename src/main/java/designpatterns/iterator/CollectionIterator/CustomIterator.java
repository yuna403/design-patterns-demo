package designpatterns.iterator.CollectionIterator;

// 自定义迭代器接口
interface CustomIterator<E> extends Iterator<E> {
    boolean hasNext();
    E next();
    void remove();
}