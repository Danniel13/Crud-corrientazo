package com.dkdev.Controller;
import java.util.Arrays;
import java.util.List;

import com.dkdev.Model.Mesa;
import com.dkdev.Model.OpcionCarne;
import com.dkdev.Model.OpcionEnsalada;
import com.dkdev.Model.OpcionJugo;
import com.dkdev.Model.OpcionPrincipio;
import com.dkdev.Model.Opcionsopa;
import com.dkdev.Model.var;

import com.dkdev.view.PedidoView;

public class RestauranteControlador {

  private PedidoView pedidoView;

  private List<Mesa> mesas = null;
  private List<Opcionsopa> sopas = null;
  private List<OpcionPrincipio> principios = null;
  private List<OpcionCarne> carnes = null;
  private List<OpcionEnsalada> ensaladas = null;
  private List<OpcionJugo> jugos = null;

  public RestauranteControlador() {
      this.pedidoView = new PedidoView();
  }

  public void agregarPedidoAMesa() {
      // Seleccionar una mesa
      var mesa = pedidoView.seleccionarMesa(listarMesas());

      // Pedir la informacion del pedido
      var pedido = pedidoView.pedirInformacionPedido(listarSopas(), listarPrincipios(), listarCarnes(),
              listarEnsaladas(), listarJugos());

      // Agregar el pedido a la mesa
      mesa.adicionarPedido(pedido);
      pedidoView.mostrarMensaje("Pedidio ingresado de forma correcta.");
  }

  private List<OpcionJugo> listarJugos() {
      if (jugos == null) {
          jugos = Arrays.asList(new OpcionJugo("Limonada"),
                  new OpcionJugo("Guayaba"),
                  new OpcionJugo("Mora"),
                  new OpcionJugo("Uva"));
      }
      return jugos;
  }

  private List<OpcionEnsalada> listarEnsaladas() {
      if (ensaladas == null) {
          ensaladas = Arrays.asList(new OpcionEnsalada("Solo tomate"),
                  new OpcionEnsalada("Tomate y cebolla"),
                  new OpcionEnsalada("Aguacate"),
                  new OpcionEnsalada("Rusa"));
      }
      return ensaladas;
  }

  private List<OpcionCarne> listarCarnes() {
      if (carnes == null) {
          carnes = Arrays.asList(new OpcionCarne("Res a la plancha"),
                  new OpcionCarne("Cerdo a la plancha"),
                  new OpcionCarne("Pechuga a la plancha"),
                  new OpcionCarne("Higado encebollado"));
      }
      return carnes;
  }

  private List<OpcionPrincipio> listarPrincipios() {
      if (principios == null) {
          principios = Arrays.asList(new OpcionPrincipio("Frijoles"),
                  new OpcionPrincipio("Lentejas"),
                  new OpcionPrincipio("Papa guisada"),
                  new OpcionPrincipio("Espaguetis"));
      }
      return principios;
  }

  private List<Opcionsopa> listarSopas() {
      if (sopas == null) {
          sopas = Arrays.asList(new Opcionsopa("Pasta"),
                  new Opcionsopa("Consomé"),
                  new Opcionsopa("Crema Zanahoria"),
                  new Opcionsopa("Caldo Costilla"),
                  new Opcionsopa("Verduras"));
      }
      return sopas;
  }

  private List<Mesa> listarMesas() {
      if (mesas == null) {
          mesas = Arrays.asList(new Mesa("VIP01"),
                  new Mesa("VIP02"),
                  new Mesa("P101"),
                  new Mesa("P102"),
                  new Mesa("P103"),
                  new Mesa("P201"),
                  new Mesa("P202"));
      }
      return mesas;
  }

  public void agregarAdicionalAPedido() {
  }

  public void entregarPedidoDeMesa() {
  }

  public void pagarCuentaMesa() {
  }

  public void consultarEstadoMesa() {
      // Seleccionar una mesa
      var mesa = pedidoView.seleccionarMesa(listarMesas());

      pedidoView.mostrarEstadoMesa(mesa);
  }

}
