package crudUsuario.service;

import java.util.List;

import crudUsuario.model.Usuario;

public interface UsuarioService {
//CRUD
	public List<Usuario> listUser();

	public Usuario listUserId(int id);

	public int addUser(Usuario u);

	public int editUser(Usuario u);

	public void deleteUser(int id);
	 
}
