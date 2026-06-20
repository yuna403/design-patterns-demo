package designpatterns.iterator.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

// 模拟结果集实现
class MockResultSet implements CustomResultSet {
    private int currentRow = -1;
    private final List<User> users;

    public MockResultSet() {
        // 初始化模拟数据
        users = new ArrayList<>();
        users.add(new User(1, "John Doe", "john@example.com"));
        users.add(new User(2, "Jane Smith", "jane@example.com"));
        users.add(new User(3, "Bob Johnson", "bob@example.com"));
    }

    @Override
    public boolean next() {
        currentRow++;
        return currentRow < users.size();
    }

    @Override
    public String getString(String columnLabel) {
        User user = users.get(currentRow);
        switch (columnLabel.toLowerCase()) {
            case "name": return user.getName();
            case "email": return user.getEmail();
            default: return "";
        }
    }

    @Override
    public int getInt(String columnLabel) {
        return (int) getLong(columnLabel);
    }

    @Override
    public long getLong(String columnLabel) {
        if ("id".equalsIgnoreCase(columnLabel)) {
            return users.get(currentRow).getId();
        }
        return 0;
    }
}
