package com.example.quickorder.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.quickorder.model.Pedido;

@Repository
public class PedidoRepository {
    private List<Pedido> listaPedidos = new ArrayList<>();

    public Pedido registrarPedido(Pedido ped){
        listaPedidos.add(ped);
        return ped;
    }
    public List<Pedido> consultarPedidos(){
        return listaPedidos;
    }
    public Pedido actualizarPedido(Pedido ped){
        int id = 0;
        int idPosicion = 0;

        for(int i = 0; i<listaPedidos.size(); i++){
            if(listaPedidos.get(i).getId() == ped.getId()){
                id = ped.getId();
                idPosicion = i;
            }
        }

        Pedido pedido = new Pedido();
        pedido.setId(id);
        pedido.setApellido(ped.getApellido());
        pedido.setCategoria(ped.getCategoria());
        pedido.setEstadoPedido(ped.getEstadoPedido());
        pedido.setFechaPedido(ped.getFechaPedido());
        pedido.setMontoTotal(ped.getMontoTotal());
        pedido.setEdad(ped.getEdad());
        pedido.setNombre(ped.getNombre());
        pedido.setRut(ped.getRut());

        listaPedidos.set(idPosicion, pedido);
        return pedido;
    }
    public Pedido buscarPorId(int id){
        for (Pedido pedido : listaPedidos){
            if(pedido.getId() == id){
                return pedido;
            }
        }
        return null;
    }
    public void eliminar (int id){
        Pedido pedido = buscarPorId(id);
        if (pedido != null){
            listaPedidos.remove(pedido);
        }
    }
    public Pedido buscarPorCategoria(String categoria){
        for (Pedido pedido : listaPedidos){
            if(pedido.getCategoria().equals(categoria)){
                return pedido;
            }
        }
        return null;
    }
}