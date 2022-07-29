package com.dkdev.Model;

public class Bandeja extends Opcionpedido {

  public Bandeja(Integer precio) {
    super(precio);
  }

  public Bandeja(Integer precio, OpcionPrincipio principio, OpcionCarne carne, OpcionEnsalada ensalada, OpcionJugo jugo) {
    super(precio, principio, carne, ensalada, jugo);
  }

  public Bandeja(Integer precio, OpcionPrincipio principio, OpcionCarne carne, OpcionJugo jugo) {
    super(precio, principio, carne, jugo);
  }
  
  
}
