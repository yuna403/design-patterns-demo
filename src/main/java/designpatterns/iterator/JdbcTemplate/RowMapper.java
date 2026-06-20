package designpatterns.iterator.JdbcTemplate;

// 行映射器接口
interface RowMapper<T> {
    T mapRow(CustomResultSet rs, int rowNum);
}