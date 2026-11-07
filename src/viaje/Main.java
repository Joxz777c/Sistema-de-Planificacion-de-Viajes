package viaje;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        // Catálogo precargado con las 3 subclases
        ArrayList<LugarTuristico> catalogo = new ArrayList<>();
        catalogo.add(new Restaurante("La Piazza", "Norte", 25.0, 2.0, "Italiana"));
        catalogo.add(new Museo("MAAC", "Malecón", 3.0, 2.5, "Arte Contemporáneo"));
        catalogo.add(new Parque("Parque Centenario", "Centro", 0.0, 1.5, "Caminata y monumentos"));

        boolean salirSistema = false;

        while (!salirSistema) {
            System.out.println("\n=== SISTEMA DE PLANIFICACIÓN DE VIAJES ===");

            // 1. Si no hay cuenta creada, el usuario la registra por consola
            if (!usuario.estaRegistrado()) {
                System.out.println("--- REGISTRO DE NUEVA CUENTA ---");
                System.out.print("Cree su nombre de usuario: ");
                String regUser = scanner.nextLine();
                System.out.print("Cree su contraseña: ");
                String regPass = scanner.nextLine();
                usuario.registrar(regUser, regPass);
                System.out.println("¡Cuenta registrada con éxito! Ahora inicie sesión.\n");
            }

            // 2. Inicio de sesión
            System.out.println("--- INICIO DE SESIÓN ---");
            System.out.print("Usuario (escriba 'salir' para terminar): ");
            String user = scanner.nextLine();
            if (user.equalsIgnoreCase("salir")) break;

            System.out.print("Contraseña: ");
            String pass = scanner.nextLine();

            if (usuario.verificar(user, pass)) {
                System.out.println("¡Bienvenido, " + user + "!");
                
                System.out.print("\nIngrese el presupuesto total para su nuevo itinerario ($): ");
                double presupuesto = scanner.nextDouble();
                scanner.nextLine();
                Itinerario miItinerario = new Itinerario(presupuesto);

                int opcion;
                do {
                    System.out.println("\n--- MENÚ PRINCIPAL ---");
                    System.out.println("1. Ver lugares disponibles y agregarlos");
                    System.out.println("2. Quitar un lugar del itinerario");
                    System.out.println("3. Registrar un nuevo lugar (Restaurante, Museo o Parque)");
                    System.out.println("4. Ver resumen de mi itinerario (Costos y Tiempos)");
                    System.out.println("5. Cerrar sesión");
                    System.out.print("Seleccione una opción: ");
                    opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.println("\n--- Lugares Disponibles ---");
                            for (int i = 0; i < catalogo.size(); i++) {
                                System.out.print((i + 1) + ". ");
                                catalogo.get(i).mostrarDetalle();
                            }
                            System.out.print("Escriba el nombre exacto del lugar que desea agregar: ");
                            String nombreLugar = scanner.nextLine();
                            
                            LugarTuristico encontrado = null;
                            for (LugarTuristico l : catalogo) {
                                if (l.getNombre().equalsIgnoreCase(nombreLugar)) {
                                    encontrado = l;
                                    break;
                                }
                            }

                            if (encontrado != null) {
                                miItinerario.agregarLugar(encontrado);
                                System.out.println("¡Lugar agregado con éxito al itinerario!");
                            } else {
                                System.out.println("No se encontró un lugar con ese nombre.");
                            }
                            break;

                        case 2:
                            System.out.println("\n--- Quitar Lugar del Itinerario ---");
                            miItinerario.mostrarResumen();
                            System.out.print("Ingrese el número del lugar que desea quitar: ");
                            int numLugar = scanner.nextInt();
                            scanner.nextLine();

                            boolean eliminado = miItinerario.eliminarLugar(numLugar - 1);
                            if (eliminado) {
                                System.out.println("¡Lugar removido del itinerario con éxito!");
                            } else {
                                System.out.println("Número de lugar inválido.");
                            }
                            break;

                        case 3:
                            System.out.println("\n--- REGISTRAR NUEVO LUGAR ---");
                            System.out.println("1. Restaurante");
                            System.out.println("2. Museo");
                            System.out.println("3. Parque");
                            System.out.print("Seleccione el tipo: ");
                            int tipo = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Nombre: ");
                            String nom = scanner.nextLine();
                            System.out.print("Ubicación: ");
                            String ub = scanner.nextLine();
                            System.out.print("Costo ($): ");
                            double cos = scanner.nextDouble();
                            System.out.print("Duración (horas): ");
                            double dur = scanner.nextDouble();
                            scanner.nextLine();

                            if (tipo == 1) {
                                System.out.print("Especialidad: ");
                                String esp = scanner.nextLine();
                                catalogo.add(new Restaurante(nom, ub, cos, dur, esp));
                                System.out.println("¡Restaurante registrado!");
                            } else if (tipo == 2) {
                                System.out.print("Tipo de exposición: ");
                                String exp = scanner.nextLine();
                                catalogo.add(new Museo(nom, ub, cos, dur, exp));
                                System.out.println("¡Museo registrado!");
                            } else if (tipo == 3) {
                                System.out.print("Actividades: ");
                                String act = scanner.nextLine();
                                catalogo.add(new Parque(nom, ub, cos, dur, act));
                                System.out.println("¡Parque registrado!");
                            } else {
                                System.out.println("Opción inválida.");
                            }
                            break;

                        case 4:
                            miItinerario.mostrarResumen();
                            break;

                        case 5:
                            System.out.println("Cerrando sesión...");
                            break;

                        default:
                            System.out.println("Opción inválida.");
                    }
                } while (opcion != 5);

            } else {
                System.out.println("Usuario o contraseña incorrectos. Intente de nuevo.\n");
            }
        }

        System.out.println("Programa finalizado. ¡Hasta luego!");
        scanner.close();
    }
}