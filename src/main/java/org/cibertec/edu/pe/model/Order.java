package org.cibertec.edu.pe.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordenes")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	private String numero;
	private Date fechaCreada;
	private Date fechaR;
	private double total;
	
	
	
	@OneToOne(mappedBy = "orden")
	private OrderDetail detalle;
	
	public Order() {
		
	}

	

	public Order(Integer id, String numero, Date fechaCreada, Date fechaR, double total, OrderDetail detalle) {
		
		this.id = id;
		this.numero = numero;
		this.fechaCreada = fechaCreada;
		this.fechaR = fechaR;
		this.total = total;
		this.detalle = detalle;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public Date getFechaCreada() {
		return fechaCreada;
	}



	public void setFechaCreada(Date fechaCreada) {
		this.fechaCreada = fechaCreada;
	}



	public Date getFechaR() {
		return fechaR;
	}



	public void setFechaR(Date fechaR) {
		this.fechaR = fechaR;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	public OrderDetail getDetalle() {
		return detalle;
	}



	public void setDetalle(OrderDetail detalle) {
		this.detalle = detalle;
	}



	@Override
	public String toString() {
		return "Order [id=" + id + ", numero=" + numero + ", fechaCreada=" + fechaCreada + ", fechaR=" + fechaR
				+ ", total=" + total + "]";
	}
	
	
}
