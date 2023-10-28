/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecicio4poo1;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Ejecicio4POO1 {

    private static Object estudiantes2023;

    public static void main(String[] args) {
        Estudiantes2023 estudiantes = new Estudiantes2023();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("****** BIENVENIDOS AL SISTEMA DE GESTION DE ESTUDIANTES ********");
            System.out.println("1-NUEVO ESTUDIANTE");
            System.out.println("2-BUSCAR ESTUDIANTE");
            System.out.println("3-ELIMINAR ESTUDIANTE");
            System.out.println("4-MODIFICAR ESTUDIANTE");
            System.out.println("5-MODIFICAR APELLIDOS EN MINÚSCULAS.");
            System.out.println("6-VER TODOS LOS ESTUDIANTES");
            System.out.println("7-VER TODOS LOS ESTUDIANTE POR APELLIDOS");
            System.out.println("8-VER TODOS LOS ESTUDIANTE POR PENSIÓN");
            System.out.println("9-TOTAL DE PENSIONES");
            System.out.println("10-SALIR");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Para consumir el salto de línea después de la entrada numérica.

            switch (opcion) {
                case 1:
                    // Agregar un nuevo estudiante
                    System.out.println("INGRESE NOMBRES Y APELLIDOS:");
                    String nombres = scanner.nextLine();
                    System.out.println("INGRESE CICLO:");
                    int ciclo = scanner.nextInt();
                    scanner.nextLine(); // Para consumir el salto de línea después de la entrada numérica.
                    System.out.println("INGRESE PENSION:");
                    double pension = scanner.nextDouble();

                    Estudiante estudiante = new Estudiante( ciclo, nombres, ciclo, pension);
                    estudiantes.adicionar(estudiante);
                    break;
                    
               case 2:
                    System.out.println("****** BUSCAR A UN ESTUDIANTE ********");
                    System.out.println("PUEDE BUSCAR POR NOMBRE O CODIGO. ELEGIR UNA OPCIÓN:");
                    System.out.println("A – APELLIDO");
                    System.out.println("B – CODIGO");
                    String buscarPor = scanner.nextLine();

                    if (buscarPor.equalsIgnoreCase("A")) {
                        // Aquí puedes implementar la búsqueda por apellido
                    } else if (buscarPor.equalsIgnoreCase("B")) {
                        System.out.print("INGRESE EL CÓDIGO DEL ALUMNO: ");
                        int codigoBuscado = scanner.nextInt();
                        boolean encontrado = false;
                        for (Estudiante estudiante : Estudiantes2023.getEstudiante()) {
                            if (estudiante.getCodigo() == codigoBuscado) {
                                System.out.println("El alumno es: " + estudiante);
                                encontrado = true;
                                break;
                            }
                        }
                        
                        if (!encontrado) {
                            System.out.println("El alumno no está registrado.");
                        }
                    }
                    break;
                    
                case 3:
                      System.out.print("Ingrese el código del estudiante a eliminar: ");
                    int codigoEliminar = scanner.nextInt();
                    Estudiante estudianteAEliminar = estudiantes.buscar(codigoEliminar);

                    if (estudianteAEliminar != null) {
                        estudiantes.eliminarEstudiante(estudianteAEliminar);
                        System.out.println("Estudiante eliminado correctamente.");
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;  
    
                 case 4:
                      System.out.println("****** MODIFICACIÓN ESTUDIANTE ********");
                      System.out.println("INDIQUE EL CÓDIGO DEL ESTUDIANTE A MODIFICAR:");
    
                     int codigoModificar = scanner.nextInt();
                     scanner.nextLine(); // Consumir la línea en blanco

                    System.out.print("INGRESE NOMBRES: ");
                    String nombres = scanner.nextLine();

                    System.out.print("INGRESE APELLIDOS: ");
                    String apellidos = scanner.nextLine();

                    System.out.print("INGRESE CICLO: ");
                    String ciclo = scanner.nextLine();

                    System.out.print("INGRESE PENSION: ");
                    double pension = scanner.nextDouble();

                   if (estudiantes2023.modificarEstudiante(codigoModificar, nombres, apellidos, ciclo, pension)) {
                    System.out.println("¡Se modificó con éxito!");
                   } else {
                   System.out.println("No se encontró al estudiante a modificar.");
                   }
                   break;
                   
                   case 5:
    // Modificar apellidos en minúsculas
                    System.out.print("Ingrese el código del estudiante cuyos apellidos desea modificar: ");
                    int codigoBusqueda = scanner.nextInt();
                    Estudiante estudianteAModificar = estudiantes.buscar(codigoBusqueda);

                    if (estudianteAModificar != null) {
                        System.out.print("Ingrese los nuevos apellidos en minúsculas: ");
                        String nuevosApellidos = scanner.nextLine().toLowerCase();
                        estudianteAModificar.setApellidos(nuevosApellidos);
                        System.out.println("Apellidos modificados correctamente.");
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                    
                    case 6:
                     estudiantes.listarEstudiantes();
                     break;
                    
                   case 7:
                   List<Estudiante> estudiantesPorApellidos = Estudiantes.getEstudiantesPorApellidos();
    
                    if (estudiantesPorApellidos.isEmpty()) {
                   System.out.println("No hay estudiantes registrados por apellidos.");
                    } else {
                   System.out.println("Estudiantes por apellidos:");
                    for (estudiante estudiante : estudiantesPorApellidos) {
                    System.out.println(estudiante);
        }
    }
    break;
    
                case 8:
                System.out.print("¿Ordenar en orden ascendente (Sí/No)? ");
                String ordenAscendenteStr = scanner.nextLine().toLowerCase();
                boolean ordenAscendente = ordenAscendenteStr.equals("si") || ordenAscendenteStr.equals("sí");
                Estudiantes.verEstudiantesPorPension(ordenAscendente);
                break;
    
                case 9:
                  double totalPensiones = estudiantes.calcularTotalPensiones();
                  System.out.println("****** SUMATORIA DE PENSIONES ********");
                  System.out.println("Lista de estudiantes:");
                  estudiantes.verTodosLosEstudiantes();
                  System.out.println("LA SUMA TOTAL ES: S/ " + totalPensiones);
                 break;

                // Implementa otras opciones del menú aquí.
                case 10:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

