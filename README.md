Sistema de Planificación de Viajes (Package viaje)

Un sistema de consola en Java orientado a objetos para la gestión interactiva de itinerarios de viaje, control de presupuesto y estimación de tiempo total por actividad. Proyecto universitario desarrollado según los lineamientos de POO (Herencia, Polimorfismo e Interfaces).

Tecnologías y Requisitos

Lenguaje: Java 21 (JDK 21 o superior)

IDE Recomendado: NetBeans 26

Paradigma: Programación Orientada a Objetos (POO)

Estructura del Proyecto: Paquete único modular (viaje) con 8 archivos .java

Nota de Compatibilidad: El proyecto está configurado y probado para ejecutarse sin inconvenientes en las versiones recientes de Apache NetBeans (NetBeans 26).
Estructura del Proyecto

El código está completamente organizado dentro de la carpeta src/viaje/:

src/
└── viaje/
├── Imprimible.java      # Interfaz funcional para visualización de detalles
├── LugarTuristico.java  # Clase abstracta principal (Superclase)
├── Restaurante.java     # Subclase derivada
├── Museo.java           # Subclase derivada
├── Parque.java          # Subclase derivada
├── Itinerario.java      # Gestión de presupuesto, lugares y cálculos
├── Usuario.java         # Módulo de registro y autenticación por consola
└── Main.java            # Menú principal e interacción por consola

Funcionalidades Principales

Registro e Inicio de Sesión: Permite a los usuarios crear credenciales en tiempo de ejecución y autenticarse.

Asignación de Presupuesto: Configuración inicial del dinero disponible para el viaje.

Catálogo Polimórfico: Consulta e inserción dinámica de destinos (Restaurante, Museo, Parque).

Gestión del Itinerario: Selección de lugares disponibles y eliminación de destinos indeseados por número de índice.

Cálculo Automático: Desglose en tiempo real del costo acumulado, saldo restante y duración total en horas.

Instrucciones de Ejecución

Opción 1: Desde Apache NetBeans (26)

Abre Apache NetBeans.

Ve a File > Open Project y selecciona la carpeta raíz del proyecto.

Asegúrate de que el proyecto reconozca el paquete viaje.

Haz clic derecho sobre el proyecto (o sobre Main.java) y selecciona Run File (o presiona Shift + F6).

Opción 2: Desde la Terminal / Consola

Clona este repositorio:
git clone https://Joxz777c@github.com/Joxz777c/Sistema-de-Planificacion-de-Viajes.git

Navega hasta la carpeta src:
cd Sistema_Planificacion_Viajes/src

Compila todos los archivos del paquete:
javac viaje/*.java

Ejecuta el programa invocando la clase Main:
java viaje.Main

Autores
Echeverria Aguiar Juan Andres; Matricula: 202615787; 
Moran Gomez Alan Josue; Matricula: 202604062;
Zamora Llerena Josias Adriel; Matricula: 202518494; 




ESPOL - Facultad de Ingeniería en Electricidad y Computación (FIEC)
