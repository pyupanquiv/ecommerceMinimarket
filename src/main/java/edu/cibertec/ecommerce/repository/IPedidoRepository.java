package edu.cibertec.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cibertec.ecommerce.model.Pedido;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Integer>{

}
