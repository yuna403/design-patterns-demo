package designpatterns.iterator.JdbcTemplate;

// 自定义结果集接口
interface CustomResultSet {
    boolean next();
    String getString(String columnLabel);
    int getInt(String columnLabel);
    long getLong(String columnLabel);
}