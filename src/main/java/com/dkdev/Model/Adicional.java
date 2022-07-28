package com.dkdev.Model;

public class Adicional {
  private String Nombre;
  private Integer Precio;

  //Constructor
  public Adicional(String nombre, Integer precio) {
    Nombre = nombre;
    Precio = precio;
  }

  public String getNombre() {
    return Nombre;
  }

  public Integer getPrecio() {
    return Precio;
  }

  public void setPrecio(Integer precio) {
    Precio = precio;
  }

  

}
