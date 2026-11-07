package viaje;

public abstract class LugarTuristico implements Imprimible {
    protected String nombre;
    protected String ubicacion;
    protected double costo;
    protected double duracionHoras;

    public LugarTuristico(String nombre, String ubicacion, double costo, double duracionHoras) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.costo = costo;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() { return nombre; }
    public double getCosto() { return costo; }
    public double getDuracionHoras() { return duracionHoras; }
}
