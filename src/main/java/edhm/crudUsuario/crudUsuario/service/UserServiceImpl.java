package edhm.crudUsuario.crudUsuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edhm.crudUsuario.crudUsuario.dao.UserDao;
import edhm.crudUsuario.crudUsuario.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao uDao;

	@Override
	public List<User> listedUsers() {
		return uDao.listedUsers();
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
