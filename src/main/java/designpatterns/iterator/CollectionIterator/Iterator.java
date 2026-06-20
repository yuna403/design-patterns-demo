package designpatterns.iterator.CollectionIterator;

import java.util.Objects;
import java.util.function.Consumer;

public interface Iterator<E> {
    boolean hasNext();
    E next();
    default void remove() {
        throw new UnsupportedOperationException("remove");
    }
    // Java 8 新增方法
    default void forEachRemaining(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        while (hasNext())
            action.accept(next());
    }
}
