package com.dkdev.Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cliente;
    private Estadopedido estado;
    private List<Adicional> adicionales;
    private Opcionpedido opcion;

    public Pedido(String cliente) {
        this.cliente = cliente;

        this.estado = Estadopedido.PENDIENTE_ENTREGAR;
        this.adicionales = new ArrayList<>();
    }

    public Pedido(String cliente, Opcionpedido opcion) {
        this.cliente = cliente;
        this.opcion = opcion;

        this.estado = Estadopedido.PENDIENTE_ENTREGAR;
        this.adicionales = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public Estadopedido getEstado() {
        return estado;
    }

    public Opcionpedido getOpcion() {
        return opcion;
    }

    public void setOpcion(Opcionpedido opcion) {
        this.opcion = opcion;
    }

    public void entregar() {
        this.estado = Estadopedido.PENDIENTE_COBRAR;
    }

    public void agregarAdicional(Adicional adicional) {
        this.adicionales.add(adicional);
    }

    public Integer calcularTotal() {
        return opcion.getPrecio()
                + adicionales.stream()
                        .map(a -> a.getPrecio())
                        .reduce((a, b) -> a + b)
                        .orElse(0);
    }
}
