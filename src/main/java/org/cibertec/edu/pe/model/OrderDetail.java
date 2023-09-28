package org.cibertec.edu.pe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private double cantida;
	private double precio;
	private double total;
	
	@OneToOne
	private Order orden;
	@OneToOne
	private Producto producto;
	
	public OrderDetail() {
		
	}
	public OrderDetail(Integer id, String nombre, double cantida, double precio, double total) {
		
		this.id = id;
		this.nombre = nombre;
		this.cantida = cantida;
		this.precio = precio;
		this.total = total;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCantida() {
		return cantida;
	}
	public void setCantida(double cantida) {
		this.cantida = cantida;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public Order getOrden() {
		return orden;
	}
	public void setOrden(Order orden) {
		this.orden = orden;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", nombre=" + nombre + ", cantida=" + cantida + ", precio=" + precio
				+ ", total=" + total + "]";
	}
	
	
}
