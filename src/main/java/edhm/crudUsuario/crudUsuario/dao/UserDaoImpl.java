package edhm.crudUsuario.crudUsuario.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edhm.crudUsuario.crudUsuario.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<User> listedUsers() {
		String sql = "select * from tbl_user";
		List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
		return users;
	}

	@Override
	public User listUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User editUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}

}
