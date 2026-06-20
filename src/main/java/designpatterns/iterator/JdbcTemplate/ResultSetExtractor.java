package designpatterns.iterator.JdbcTemplate;

// 结果集提取器接口
interface ResultSetExtractor<T> {
    T extractData(CustomResultSet rs);
}