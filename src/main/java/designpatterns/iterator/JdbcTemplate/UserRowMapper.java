package designpatterns.iterator.JdbcTemplate;

// 用户行映射器
class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(CustomResultSet rs, int rowNum) {
        return new User(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("email")
        );
    }
}