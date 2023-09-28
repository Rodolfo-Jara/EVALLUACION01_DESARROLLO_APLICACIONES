package org.cibertec.edu.pe.controller;

import java.io.IOException;


import org.cibertec.edu.pe.model.Producto;
import org.cibertec.edu.pe.service.ProductoService;
import org.cibertec.edu.pe.service.SubirArchivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@Autowired
	private SubirArchivo upload;

	@GetMapping("")
	public String show(Model model) {
		model.addAttribute("productos", productoService.findAll());
		return "vistas/listadoProducto";
	}

	@GetMapping("/create")
	public String create() {
		return "vistas/create";
	}

	@PostMapping("/save")
	public String save(Producto producto, @RequestParam("img") MultipartFile file) throws IOException {
		productoService.save(producto);
		//imagen
				if (producto.getId()==null) { // cuando se crea un producto
					String nombreImagen= upload.saveImage(file);
					producto.setImagen(nombreImagen);
				}else {
					
				}
				
				productoService.save(producto);
				return "redirect:/productos";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		Producto p = new Producto();
		p=productoService.get(id).get();
		//eliminars
				if (!p.getImagen().equals("default.jpg")) {
					upload.deleteImage(p.getImagen());
				}
				
				productoService.delete(id);
				return "redirect:/productos";
	}

}
