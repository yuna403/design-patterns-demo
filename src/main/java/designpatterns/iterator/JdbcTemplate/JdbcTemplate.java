package designpatterns.iterator.JdbcTemplate;

import java.util.List;

// JdbcTemplate 简化实现
class JdbcTemplate {
    public <T> List<T> query(String sql, RowMapper<T> rowMapper) {
        return query(sql, new RowMapperResultSetExtractor<>(rowMapper));
    }

    public <T> T queryForObject(String sql, RowMapper<T> rowMapper) {
        List<T> results = query(sql, rowMapper);
        if (results.isEmpty()) {
            throw new DataAccessException("No results found");
        }
        return results.get(0);
    }

    public <T> T query(String sql, ResultSetExtractor<T> rse) {
        // 创建模拟结果集
        MockResultSet rs = new MockResultSet();
        return rse.extractData(rs);
    }
}