package uml.pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numero;
    private EstadoPedido estado;
    private List<Producto> productos;

    // Constructor
    public Pedido(int numero) {
        this.numero = numero;
        this.estado = EstadoPedido.PENDIENTE;
        this.productos = new ArrayList<>();
    }

    // Añadir producto al pedido
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Calcular el total del pedido
    public double calcularTotal() {
        double total = 0.0;

        for (Producto p : productos) {
            total += p.getPrecio();
        }

        return total;
    }

    // Getters y setter
    public int getNumero() {
        return numero;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
}
