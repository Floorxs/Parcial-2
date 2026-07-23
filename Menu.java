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
            }

        } while (opcion != 6);

        sc.close();
    }
}

class Nodo {

    String dato;
    Nodo siguienteNodo;

    public Nodo(String dato) {
        this.dato = dato;
        this.siguienteNodo = null;
    }
}

class ListaEnlazada {

    Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    public void agregarNodoInicio(String dato) {

        Nodo nuevo = new Nodo(dato);
        nuevo.siguienteNodo = cabeza;
        cabeza = nuevo;
    }

    public void agregarFinal(String dato) {

        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo aux = cabeza;

        while (aux.siguienteNodo != null) {
            aux = aux.siguienteNodo;
        }

        aux.siguienteNodo = nuevo;
    }

    public void eliminarNodo(String dato) {

        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguienteNodo;
            System.out.println("Nodo eliminado.");
            return;
        }

        Nodo aux = cabeza;

        while (aux.siguienteNodo != null &&
                !aux.siguienteNodo.dato.equals(dato)) {
            aux = aux.siguienteNodo;
        }

        if (aux.siguienteNodo == null) {
            System.out.println("Nodo no encontrado.");
        } else {
            aux.siguienteNodo = aux.siguienteNodo.siguienteNodo;
            System.out.println("Nodo eliminado.");
        }
    }

    public boolean buscarNodo(String dato) {

        Nodo aux = cabeza;

        while (aux != null) {
            if (aux.dato.equals(dato)) {
                return true;
            }
            aux = aux.siguienteNodo;
        }

        return false;
    }

    public void recorrido() {

        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo aux = cabeza;

        while (aux != null) {
            System.out.print(aux.dato + " -> ");
            aux = aux.siguienteNodo;
        }

        System.out.println("null");
    }
}