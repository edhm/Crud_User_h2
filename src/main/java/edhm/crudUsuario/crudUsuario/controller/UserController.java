package edhm.crudUsuario.crudUsuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edhm.crudUsuario.crudUsuario.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService uService;

	@GetMapping("/listar")
	public String listedUsers(Model model) {
		model.addAttribute("users", uService.listedUsers());
		return "index";
	}
}