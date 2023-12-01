package edu.cibertec.ecommerce.service;

import java.util.List;

import edu.cibertec.ecommerce.model.Pedido;

public interface IPedidoService {
	
	List<Pedido> findAll();
	Pedido save (Pedido pedido);
	String generarNumeroPedido();
}
