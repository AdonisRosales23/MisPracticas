import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio4 {

        public static void main(String[] args) {
            Map<String, String> alumnos = new HashMap<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Menú:");
                System.out.println("1. Ingreso de estudiante");
                System.out.println("2. Ver estudiante");
                System.out.println("3. Buscar estudiante");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = scanner.nextInt(Integer.parseInt(scanner.nextLine())); // Consumir el salto de línea pendiente

                switch (opcion) {
                    case 1:
                        ingresarEstudiante(alumnos, scanner);
                        break;
                    case 2:
                        verEstudiante(alumnos, scanner);
                        break;
                    case 3:
                        buscarEstudiante(alumnos, scanner);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }

        private static void ingresarEstudiante(Map<String, String> alumnos, Scanner scanner) {
            System.out.print("Ingrese el carnet del estudiante: ");
            String carnet = scanner.nextLine();

            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = scanner.nextLine();

            alumnos.put(carnet, nombre);
            System.out.println("Estudiante ingresado correctamente.");
        }

        private static void verEstudiante(Map<String, String> alumnos, Scanner scanner) {
            System.out.print("Ingrese el carnet del estudiante: ");
            String carnet = scanner.nextLine();

            if (alumnos.containsKey(carnet)) {
                String nombre = alumnos.get(carnet);
                System.out.println("Nombre del estudiante con carnet " + carnet + ": " + nombre);
            } else {
                System.out.println("Estudiante con carnet " + carnet + " no encontrado.");
            }
        }

        private static void buscarEstudiante(Map<String, String> alumnos, Scanner scanner) {
            System.out.print("Ingrese parte del carnet o nombre del estudiante a buscar: ");
            String busqueda = scanner.nextLine();

            boolean encontrado = false;
            for (Map.Entry<String, String> entry : alumnos.entrySet()) {
                if (entry.getKey().contains(busqueda) || entry.getValue().contains(busqueda)) {
                    System.out.println("Carnet: " + entry.getKey() + ", Nombre: " + entry.getValue());
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontraron estudiantes con la búsqueda: " + busqueda);
            }
        }
    }


