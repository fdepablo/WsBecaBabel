package es.curso.modelo.negocio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.modelo.entidad.Pedido;
import es.curso.modelo.persistencia.DaoPedido;

@Service
public class GestorPedido {

	@Autowired
	private DaoPedido daoPedido;
	
	public int insertarPedidoCliente(Pedido p, int id) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fechaString;
		if (!"".equals(p.getImporte()) || !"".equals(p.getFecha())) {
			fechaString = sdf.format(p.getFecha());
			System.out.println("El pedido de importe " + p.getImporte() + "€ realizado en la fecha " + fechaString
					+ " fue dado de alta al cliente con ID " + id);
			return daoPedido.insertarPedidoCliente(p, id);
		}
		return -1;
	}
	
	public ArrayList<Pedido> listarPedidoCliente(int id) {
		if (daoPedido.listarPedidoCliente(id).size() == 0) {
			System.out.println("El cliente con ID " + id + " no tiene pedidos");
		} else {
			System.out.println("El cliente con ID " + id + " tiene los siguientes pedidos: \n"
					+ daoPedido.listarPedidoCliente(id));
		}
		return daoPedido.listarPedidoCliente(id);
	}
}
