package crudUsuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crudUsuario.model.Usuario;
import crudUsuario.modelDAO.UsuarioDAO;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public List<Usuario> listUser() {
		return usuarioDAO.listUser();
	}

	@Override
	public Usuario listUserId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addUser(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDAO.addUser(u);
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
