package crudUsuario.modelDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;

import crudUsuario.model.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Usuario> listUser() {
		String sql = "SELECT * FROM tbl_user";
		List<Usuario> users = template.query(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
		return users;
	}

	@Override
	public Usuario listUserId(int id) {
		String sql = "select * from tbl_user where id=?";
		@SuppressWarnings("deprecation")
		Usuario us = template.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<Usuario>(Usuario.class));
		return us;
	}

	@Override
	public int addUser(Usuario usuario) {
		String sql = "INSERT INTO tbl_user(firstName, lastName, sex, dni, email) values(?,?,?,?,?)";
		int res = template.update(sql, usuario.getFirstName(), usuario.getLastName(), usuario.getSex(),
				usuario.getDni(), usuario.getEmail());
		return res;
	}

	@Override
	public int editUser(Usuario usuario) {
		String sql = "UPDATE tbl_user SET firstName=?, lastName=?, sex=?, dni=?, email=?" + " WHERE id=?";
		int res = template.update(sql, usuario.getFirstName(), usuario.getLastName(), usuario.getSex(),
				usuario.getDni(), usuario.getEmail(), usuario.getId());
		return res;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}

}
