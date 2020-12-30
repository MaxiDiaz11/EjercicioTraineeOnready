package modelo;

import java.text.DecimalFormat;

/**
 *
 * @author maxid
 */
public class Auto extends Vehiculo {

    private int cantPuertas;

    public Auto(String marca, String modelo, float precio, int cantPuertas) {
        super(marca, modelo, precio);
        this.cantPuertas = cantPuertas;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    @Override
    public void mostrarVehiculo() {
        DecimalFormat formato = new DecimalFormat("00,000.00");
        System.out.println("Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: " + this.cantPuertas + " //Precio: $" + formato.format(this.getPrecio()));
    }
}
