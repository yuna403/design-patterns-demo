package designpatterns.iterator.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

// 行映射器结果集提取器实现
class RowMapperResultSetExtractor<T> implements ResultSetExtractor<List<T>> {
    private final RowMapper<T> rowMapper;

    public RowMapperResultSetExtractor(RowMapper<T> rowMapper) {
        this.rowMapper = rowMapper;
    }

    @Override
    public List<T> extractData(CustomResultSet rs) {
        List<T> results = new ArrayList<>();
        int rowNum = 0;
        while (rs.next()) {
            results.add(this.rowMapper.mapRow(rs, rowNum++));
        }
        return results;
    }
}