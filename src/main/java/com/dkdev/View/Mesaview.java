package com.dkdev.View;

import java.util.List;
import java.util.Scanner;

import com.dkdev.Model.Mesa;

public class Mesaview {

  private Scanner scanner;
  public Mesaview() {
    this.scanner = new Scanner(System.in);
}

public Mesa leerDatosMesa() {
    Mesa respuesta = null;

    System.out.println(".: DATOS DE LA MESA :.");
    System.out.print("Ingrese el numero de la mesa: ");
    var numero = scanner.nextLine();

    respuesta = new Mesa(numero);

    return respuesta;
}

public void mostrarMensaje(String mensaje) {
    System.out.println(mensaje);
}

public void mostrarError(String error) {
    System.err.println(error);
}

public void mostrarMesas(List<Mesa> mesas) {
    System.out.println(".: LISTADO DE MESAS :.");
    mesas.forEach(System.out::println);
}

}