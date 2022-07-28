package com.dkdev.Model;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
  private String numero;
  private List<Pedido> pedidos; //Creacion array de relación una mesa  amuychos pedidos


  //METODOS:

  public Integer CalcularValorPagar() {
    return 0;


  }

  public Integer Pagar(Integer Efectivo) {
    return 0;
    
  }

  
  public void AdicionarPedidos(Pedido pedido) {
    this.pedidos.add(pedido); 
    
  }

    //CONSTRUCTOR
    

  public Mesa(String numero) {
    this.numero = numero;
    pedidos = new ArrayList<>();
  }

  


  //get
  public String getNumero() {
    return numero;
  }



  
}
