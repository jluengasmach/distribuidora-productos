package main.java.com.distribuidora.productos;

public class Perecedero extends Producto{
    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return "Perecedero [diasPorCaducar=" + diasPorCaducar + "]";
    }

    @Override
    public void calcular(int cantidad) {
        switch (this.diasPorCaducar) {
            this.precioTotal = super.calcular(cantidad);
            case 1:
                this.precioTotal /= 4;
                break;
            case 2:
                this.precioTotal /= 3;
            default:
                this.precioTotal /= 2;
                break;
        }
    }
}
