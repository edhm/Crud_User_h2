package crudUsuario.modelDAO;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import crudUsuario.model.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {
	private JdbcTemplate template;

	@Override
	public List<Usuario> listUser() {
		String sql = "SELECT * FROM tbl_user";
		List<Usuario> users = template.query(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
		return users;
	}

	@Override
	public Usuario listUserId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addUser(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int editUser(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}

}
