package com.dkdev.Model;

import javax.swing.undo.CannotRedoException;

public abstract class Opcionpedido {
  

  private Integer Precio;

  private OpcionPrincipio principio;
  private OpcionCarne carne;
  private OpcionEnsalada ensalada;
  private OpcionJugo jugo;


  //CONSTRUCTOR
  public Opcionpedido(Integer precio) {
    Precio = precio;
  }




  public Opcionpedido(OpcionPrincipio principio, OpcionCarne carne, OpcionEnsalada ensalada, OpcionJugo jugo) {
    this.Precio = Precio;
    this.principio = principio;
    this.carne = carne;
    this.ensalada = ensalada;
    this.jugo = jugo;
  }


//SIN ENSALADA

  public Opcionpedido(OpcionPrincipio principio, OpcionCarne carne, OpcionJugo jugo) {
    this.Precio = Precio;
    this.principio = principio;
    this.carne = carne;
    this.jugo = jugo;
  }




  public Integer getPrecio() {
    return Precio;
  }




  public OpcionPrincipio getPrincipio() {
    return principio;
  }




  public void setPrincipio(OpcionPrincipio principio) {
    this.principio = principio;
  }




  public OpcionCarne getCarne() {
    return carne;
  }




  public void setCarne(OpcionCarne carne) {
    this.carne = carne;
  }




  public OpcionEnsalada getEnsalada() {
    return ensalada;
  }




  public void setEnsalada(OpcionEnsalada ensalada) {
    this.ensalada = ensalada;
  }




  public OpcionJugo getJugo() {
    return jugo;
  }




  public void setJugo(OpcionJugo jugo) {
    this.jugo = jugo;
  }
  
//GETTER:

 


}
