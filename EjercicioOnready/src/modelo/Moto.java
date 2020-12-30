package modelo;

import java.text.DecimalFormat;
/**
 *
 * @author maxid
 */
public class Moto extends Vehiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, float precio, int cilindradas) {
        super(marca, modelo, precio);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarVehiculo() {
        DecimalFormat formato = new DecimalFormat("00,000.00");
        System.out.println("Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Cilindradas: " + this.cilindradas + "cc //Precio: $" + formato.format(this.getPrecio()));
    }
}
