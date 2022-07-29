package com.dkdev.Model;

public class Completo extends Opcionpedido {

  private Opcionsopa sopa;

  public Completo(Integer precio) {
    super(precio);
  }

  public Completo(OpcionPrincipio principio, OpcionCarne carne, OpcionEnsalada ensalada, OpcionJugo jugo) {
    super(principio, carne, ensalada, jugo);
    this.sopa = sopa;
  }

  public Completo(OpcionPrincipio principio, OpcionCarne carne, OpcionJugo jugo) {
    super(principio, carne, jugo);
    this.sopa = sopa;
  }

  public Opcionsopa getSopa() {
    return sopa;
  }

  public void setSopa(Opcionsopa sopa) {
    this.sopa = sopa;
  }
  


  
}
