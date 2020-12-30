package modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author maxid
 */
public class Solucion {

    List<Vehiculo> listaVehiculos;
    public static Solucion instancia = null;

    protected Solucion() {
        Moto moto1 = new Moto("Honda", "Titan", 60000F, 125);
        Moto moto2 = new Moto("Yamaha", "YBR", 80500.50F, 125);
        Auto auto1 = new Auto("Peugeot", "206", 200000F, 4);
        Auto auto2 = new Auto("Peugeot", "208", 250000F, 5);
        listaVehiculos = new ArrayList<>();
        listaVehiculos.add(auto1);
        listaVehiculos.add(moto1);
        listaVehiculos.add(auto2);
        listaVehiculos.add(moto2);
    }

    public static Solucion getInstancia () {
        return (instancia == null) ? instancia = new Solucion() : instancia;
    }

    public void getVehiculoMasCaro() {
        float mayor = 0;
        String descripcion = "", modelo = "";
        
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i).getPrecio() > mayor) {
                mayor = (float) listaVehiculos.get(i).getPrecio();
                descripcion = listaVehiculos.get(i).getMarca();
                modelo = listaVehiculos.get(i).getModelo();
            }
        }
        System.out.println("Vehículo más caro: " + descripcion + " " + modelo);
    }

    public void getVehiculoMenosCaro() {
        float menor = (float) listaVehiculos.get(0).getPrecio();
        String descripcion = "", modelo = "";

        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (menor > listaVehiculos.get(i).getPrecio()) {
                menor = (float) listaVehiculos.get(i).getPrecio();
                descripcion = listaVehiculos.get(i).getMarca();
                modelo = listaVehiculos.get(i).getModelo();
            }
        }
        System.out.println("Vehículo más barato: " + descripcion + " " + modelo);
    }

    public void getVehiculoConLetraY() {
        String descripcion = "", modelo = "";
        float precio = 0;
        DecimalFormat formato = new DecimalFormat("00,000.00");

        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i).getMarca().contains("Y")) {
                descripcion = listaVehiculos.get(i).getMarca();
                modelo = listaVehiculos.get(i).getModelo();
                precio = (float) listaVehiculos.get(i).getPrecio();
            }
        }

        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + descripcion + " " + modelo + " $" + formato.format(precio));
    }

    public void listarVehiculos() {
        for (int i = 0; i < listaVehiculos.size(); i++) {
            listaVehiculos.get(i).mostrarVehiculo();
        }
    }

    public void ordenarPorPrecios() {
        Collections.sort(listaVehiculos);
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (int i = 0; i < listaVehiculos.size(); i++) {
            System.out.println(listaVehiculos.get(i).getMarca() + " " + listaVehiculos.get(i).getModelo());
        }
    }

    public void mostarSolucion() {
        listarVehiculos();
        System.out.println("=============================");
        getVehiculoMasCaro();
        getVehiculoMenosCaro();
        getVehiculoConLetraY();
        System.out.println("=============================");
        ordenarPorPrecios();
    }
}
