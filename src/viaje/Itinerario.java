package viaje;

import java.util.ArrayList;

public class Itinerario {
    private double presupuesto;
    private ArrayList<LugarTuristico> lugares;

    public Itinerario(double presupuesto) {
        this.presupuesto = presupuesto;
        this.lugares = new ArrayList<>();
    }

    public void agregarLugar(LugarTuristico lugar) {
        lugares.add(lugar);
    }

    public boolean eliminarLugar(int indice) {
        if (indice >= 0 && indice < lugares.size()) {
            lugares.remove(indice);
            return true;
        }
        return false;
    }

    public double calcularCostoTotal() {
        double total = 0;
        for (LugarTuristico l : lugares) total += l.getCosto();
        return total;
    }

    public double calcularTiempoTotal() {
        double total = 0;
        for (LugarTuristico l : lugares) total += l.getDuracionHoras();
        return total;
    }

    public void mostrarResumen() {
        System.out.println("\n--- RESUMEN DE TU ITINERARIO ---");
        System.out.println("Presupuesto inicial: $" + presupuesto);
        if (lugares.isEmpty()) {
            System.out.println("No hay lugares agregados todavía.");
        } else {
            for (int i = 0; i < lugares.size(); i++) {
                System.out.print((i + 1) + ". ");
                lugares.get(i).mostrarDetalle();
            }
            double gastado = calcularCostoTotal();
            System.out.println("----------------------------------------");
            System.out.println("Costo total: $" + gastado);
            System.out.println("Presupuesto restante: $" + (presupuesto - gastado));
            System.out.println("Tiempo total estimado: " + calcularTiempoTotal() + " horas");
        }
    }
}