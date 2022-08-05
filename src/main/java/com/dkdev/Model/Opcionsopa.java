package com.dkdev.Model;

public class Opcionsopa {
  private String nombre;
  private Integer id;

  public Opcionsopa(String nombre) {
      this.nombre = nombre;
  }

  public String getNombre() {
      return nombre;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Sopa de " +nombre;
  }

  
}
