package designpatterns.iterator.MenuIterator;


import java.util.Iterator;

interface Menu {
    Iterator<MenuItem> createIterator();
}
