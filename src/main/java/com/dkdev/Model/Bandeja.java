package com.dkdev.Model;

public class Bandeja extends Opcionpedido {

  public Bandeja(Integer precio) {
    super(precio);
  }

  public Bandeja(OpcionPrincipio principio, OpcionCarne carne, OpcionEnsalada ensalada, OpcionJugo jugo) {
    super(principio, carne, ensalada, jugo);
  }

  public Bandeja(OpcionPrincipio principio, OpcionCarne carne, OpcionJugo jugo) {
    super(principio, carne, jugo);
  }
  
  
}
