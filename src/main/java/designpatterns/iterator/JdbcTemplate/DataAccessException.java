package designpatterns.iterator.JdbcTemplate;

// 自定义异常
class DataAccessException extends RuntimeException {
    public DataAccessException(String message) {
        super(message);
    }
}