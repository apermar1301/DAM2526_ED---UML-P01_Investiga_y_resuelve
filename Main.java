package uml.pedido;

public class Main {

    public static void main(String[] args) {

        // 1. Crear el pedido con número 1
        Pedido pedido = new Pedido(1);

        // 2. Crear los productos
        Producto teclado = new Producto("Teclado", 25.50);
        Producto raton = new Producto("Ratón", 15.00);

        // 3. Añadir los productos al pedido
        pedido.agregarProducto(teclado);
        pedido.agregarProducto(raton);

        // 4. Mostrar información del pedido
        System.out.println("Número de pedido: " + pedido.getNumero());
        System.out.println("Estado del pedido: " + pedido.getEstado());
        System.out.println("Total del pedido: " + pedido.calcularTotal() + " €");

        // 5. Cambiar el estado del pedido a ENVIADO
        pedido.setEstado(EstadoPedido.ENVIADO);

        // 6. Mostrar el estado tras el cambio
        System.out.println("Estado del pedido tras el envío: " + pedido.getEstado());
    }
}
