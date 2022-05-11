package edhm.crudUsuario.crudUsuario.service;

import java.util.List;

import edhm.crudUsuario.crudUsuario.model.User;

public interface UserService {
	public List<User> listedUsers();

	public User listUserById(int id);

	public int addUser(User user);

	public User editUser(User user);

	public void deleteUser(int id);
}
