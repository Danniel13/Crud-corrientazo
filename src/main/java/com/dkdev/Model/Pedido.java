package com.dkdev.Model;

import java.util.ArrayList;
import java.util.List;

//TIENE UNA RELACION DE DEPENDENCIA CON ESTADO DE PEDIDO
public class Pedido {
  private String Cliente;
  private Estadopedido estado;
  private List<Adicional> adicionales;
  private Opcionpedido opcion;

public Pedido(String cliente){
  this.Cliente = cliente;
  this.estado= Estadopedido.PENDIENTE_ENTREGAR;
  this.adicionales = new ArrayList<>();
}

public Pedido(String cliente, Opcionpedido opcion){
  this.Cliente = cliente;
  this.opcion = opcion;
  this.estado = Estadopedido.PENDIENTE_ENTREGAR;
  this.adicionales = new ArrayList<>();

}



  public String getcliente(){
    return Cliente;


  }



  public Opcionpedido getOpcion() {
    return opcion;
  }



  public void Entregar() {
    this.estado =Estadopedido.PENDIENTE_COBRAR;

  }



  public void agregarAdicional(Adicional adicional){
    this.adicionales.add(adicional);
  }


  public Integer CalcularTotal () {
    return 0;
  }
}


