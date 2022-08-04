package com.dkdev.View;

import java.util.Scanner;

import com.dkdev.Model.Mesa;

public class Mesaview {

  private Scanner scanner;

  public Mesaview() {
      this.scanner = new Scanner(System.in);
  }

  
public Mesa leerdatosmesa(){

  Mesa respuesta =null;
  System.out.println("Datos de la mesa: ");
  System.out.print("Ingrese el nombre de la mesa: ");
  var numero = scanner.nextLine();
  respuesta = new Mesa(numero);

  return respuesta;
}

}
