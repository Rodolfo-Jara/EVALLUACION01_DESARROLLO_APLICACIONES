package org.cibertec.edu.pe.controller;

import org.cibertec.edu.pe.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("")
	public String show() {
		return "vistas/listadoProducto";
	}
	
	@GetMapping("/create")
	public String create() {
		return "vistas/create";
	}
	
	
}
