package main.java.com.distribuidora.productos;

import java.util.ArrayList;

public class Distribuidora {
    public ArrayList productosVendidos = new ArrayList<Producto>()
    
    public void venderProducto(Producto producto) {
        productosVendidos.add(producto);
    }

    public double precioTotal() {
        double precioTotal = 0.0;
        for (Producto producto : productosVendidos) {
            precioTotal += producto.precioTotal;
        }
    }

    public static void main(String[] args) {
        // TODO
    }
}
