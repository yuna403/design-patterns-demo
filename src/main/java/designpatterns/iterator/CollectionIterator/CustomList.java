package designpatterns.iterator.CollectionIterator;

// 自定义列表接口
interface CustomList<E> {
    int size();
    boolean isEmpty();
    boolean add(E e);
    E get(int index);
    CustomIterator<E> iterator();
}