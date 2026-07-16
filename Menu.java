import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        int opcion;
        String dato;

        do {
            System.out.println("\n==================================");
            System.out.println("     LISTA ENLAZADA - MENÚ");
            System.out.println("==================================");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar un nodo");
            System.out.println("4. Buscar un nodo");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Salir");
            System.out.println("==================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingresa el dato: ");
                    dato = sc.nextLine();
                    lista.agregarNodoInicio(dato);
                    System.out.println("Nodo agregado al inicio.");
                    break;

                case 2:
                    System.out.print("Ingresa el dato: ");
                    dato = sc.nextLine();
                    lista.agregarFinal(dato);
                    System.out.println("Nodo agregado al final.");
                    break;

                case 3:
                    System.out.print("Dato a eliminar: ");
                    dato = sc.nextLine();
                    lista.eliminarNodo(dato);
                    break;

                case 4:
                    System.out.print("Dato a buscar: ");
                    dato = sc.nextLine();

                    if (lista.buscarNodo(dato)) {
                        System.out.println("Nodo encontrado.");
                    } else {
                        System.out.println("Nodo no encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("\nContenido de la lista:");
                    lista.recorrido();
                    break;

                case 6:
                    System.out.println("Gracias por utilizar el programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 6);

        sc.close();
    }
}