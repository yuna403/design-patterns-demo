package designpatterns.iterator.CollectionIterator;

// 测试类
public class CollectionIteratorExample {
    public static void main(String[] args) {
        // 使用自定义ArrayList
        CustomList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("ArrayList遍历:");
        CustomIterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // 添加更多元素
        list.add("JavaScript");
        list.add("Go");

        System.out.println("\n移除元素后遍历:");
        listIterator = list.iterator();
        while (listIterator.hasNext()) {
            String item = listIterator.next();
            if ("Python".equals(item)) {
                listIterator.remove();
            } else {
                System.out.println(item);
            }
        }

        // 打印最终列表
        System.out.println("\n最终列表内容:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}