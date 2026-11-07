package viaje;

public class Museo extends LugarTuristico {
    private String tipoExposicion;

    public Museo(String nombre, String ubicacion, double costo, double duracionHoras, String tipoExposicion) {
        super(nombre, ubicacion, costo, duracionHoras);
        this.tipoExposicion = tipoExposicion;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("[Museo] " + nombre + " | Ubicación: " + ubicacion + " | Exposición: " + tipoExposicion + " | Costo: $" + costo + " | Tiempo: " + duracionHoras + "h");
    }
}
