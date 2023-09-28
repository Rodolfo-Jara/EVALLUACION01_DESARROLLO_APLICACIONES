package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.model.Producto;
import org.cibertec.edu.pe.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/carrito")
public class CarritoController {
	@Autowired
	private ProductoService productoService;
	
	
	@GetMapping("")
	public String index(Model model ) {

		List<Producto> productos=productoService.findAll();
		model.addAttribute("productos",productos);


		return "vistas/index";
	}
}
