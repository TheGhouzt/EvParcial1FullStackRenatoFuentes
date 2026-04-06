package com.example.quickorder.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Pedido {
    private int montoTotal, id, edad, rut;
    private String categoria, estadoPedido, nombre, apellido, fechaPedido;
}
