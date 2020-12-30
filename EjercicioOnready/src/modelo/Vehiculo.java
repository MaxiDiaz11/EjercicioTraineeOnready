package modelo;

/**
 *
 * @author maxid
 */
public abstract class Vehiculo implements Comparable<Vehiculo> {

    private String marca, modelo;
    private float precio;


    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    abstract public void mostrarVehiculo();

    @Override
    public int compareTo(Vehiculo v) {
        if (v.getPrecio() < precio) {
            return -1;
        } else if (v.getPrecio() > precio) {
            return 0;
        } else {
            return 1;
        }
    }

}
