package crudUsuario.modelDAO;

import java.util.List;

import crudUsuario.model.Usuario;

public interface UsuarioDAO {
	public List<Usuario> listUser();

	public Usuario listUserId(int id);

	public int addUser(Usuario u);

	public int editUser(Usuario u);

	public void deleteUser(int id);

	// public void updateUser(int id);
}
