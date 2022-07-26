package com.dkdev.Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
  private String cliente;
  private Estadopedido estado;
  private List<Adicional> adicionales;
  private Opcionpedido opcion;
  private Integer id;

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

  public void setId(Integer id) {
      this.id = id;
  }

  public Integer getId() {
      return id;
  }

  public void setEstado(Estadopedido estado) {
      this.estado = estado;
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

  @Override
  public String toString() {
      return "Pedido [cliente=" + cliente + ", estado=" + estado + ", opcion=" + opcion
              + ", adicionales=" + adicionales + "]";
  }

}
