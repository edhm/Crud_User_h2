
package crudUsuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import crudUsuario.model.Usuario;
import crudUsuario.service.UsuarioService;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/listar")
	public String listUser(Model model) {
		model.addAttribute("users", usuarioService.listUser());
		return "index";
	}

	@GetMapping("/nuevo")
	public String nuevo() {
		return "agregar";
	}

	@PostMapping("/agregar")
	public String addUser(@Validated Usuario usuario) {
		usuarioService.addUser(usuario);
		return "redirect:/listar";
	}

	@GetMapping("/editar/{id}")
	public String editUser(@PathVariable int id, Model model) {
		Usuario user = usuarioService.listUserId(id);
		model.addAttribute("user", user);
		return "editar";
	}

	@PostMapping("/actualizar")
	public String updateUser(@Validated Usuario usuario) {
		usuarioService.editUser(usuario);
		return "redirect:/listar";
	}
}