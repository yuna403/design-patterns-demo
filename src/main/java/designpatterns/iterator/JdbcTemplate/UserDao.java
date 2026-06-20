package designpatterns.iterator.JdbcTemplate;

import java.util.List;

// 用户数据访问对象
class UserDao {
    private final JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public List<User> getAllUsers() {
        return jdbcTemplate.query("SELECT id, name, email FROM users", new UserRowMapper());
    }

    public User getUserById(long id) {
        return jdbcTemplate.queryForObject(
                "SELECT id, name, email FROM users WHERE id = " + id,
                new UserRowMapper()
        );
    }
}