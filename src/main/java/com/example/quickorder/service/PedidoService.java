package com.example.quickorder.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quickorder.model.Pedido;
import com.example.quickorder.repository.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> getPedidos(){
        return pedidoRepository.consultarPedidos();
    }
    public Pedido registerPedido(Pedido pedido){
        return pedidoRepository.registrarPedido(pedido);
    }
    public Pedido getPedidosPorCategoria(String categoria) {
        return pedidoRepository.buscarPorCategoria(categoria);
    }
    public Pedido getPedido(int id){
        return pedidoRepository.buscarPorId(id);
    }
    public Pedido updatePedido(Pedido pedido){
        return pedidoRepository.actualizarPedido(pedido);
    }
    public String deletePedido(int id){
        pedidoRepository.eliminar(id);
        return "Pedido eliminado";
    }
}
