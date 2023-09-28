package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaces.IProducto;
import org.cibertec.edu.pe.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private IProducto data;
	
	
	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return data.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		data.save(producto);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return data.findAll();
	}

}
