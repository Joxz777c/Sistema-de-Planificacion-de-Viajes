package viaje;

public class Restaurante extends LugarTuristico {
    private String especialidad;

    public Restaurante(String nombre, String ubicacion, double costo, double duracionHoras, String especialidad) {
        super(nombre, ubicacion, costo, duracionHoras);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("[Restaurante] " + nombre + " | Ubicación: " + ubicacion + " | Especialidad: " + especialidad + " | Costo: $" + costo + " | Tiempo: " + duracionHoras + "h");
    }
}
