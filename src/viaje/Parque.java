package viaje;

public class Parque extends LugarTuristico {
    private String actividades;

    public Parque(String nombre, String ubicacion, double costo, double duracionHoras, String actividades) {
        super(nombre, ubicacion, costo, duracionHoras);
        this.actividades = actividades;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("[Parque] " + nombre + " | Ubicación: " + ubicacion + " | Actividades: " + actividades + " | Costo: $" + costo + " | Tiempo: " + duracionHoras + "h");
    }
}
