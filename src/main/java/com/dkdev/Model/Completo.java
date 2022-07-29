package com.dkdev.Model;

public class Completo extends Opcionpedido {

  private Opcionsopa sopa;

  public Completo(Integer precio) {
      super(precio);
  }

  public Completo(Integer precio, Opcionsopa sopa, OpcionPrincipio principio, OpcionCarne carne,
          OpcionEnsalada ensalada, OpcionJugo jugo) {
      super(precio, principio, carne, ensalada, jugo);
      this.sopa = sopa;
  }

  public Completo(Integer precio, Opcionsopa sopa, OpcionPrincipio principio, OpcionCarne carne, OpcionJugo jugo) {
      super(precio, principio, carne, jugo);
      this.sopa = sopa;
  }

  public void setSopa(Opcionsopa sopa) {
      this.sopa = sopa;
  }

  public Opcionsopa getSopa() {
      return sopa;
  }

}
