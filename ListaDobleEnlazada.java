import public class Main {
    private static class Nodo {
        String valor;
        Nodo siguiente;
        Nodo anterior;

        Nodo(String valor) {
            this.valor = valor;
        }
    }

    private static class ListaDobleEnlazada {
        private Nodo cabeza;
        private Nodo cola;
        private int tamanio;

        public boolean estaVacia() {
            return cabeza == null;
        }

        public void agregarInicio(String valor) {
            Nodo nuevoNodo = new Nodo(valor);
            if (estaVacia()) {
                cabeza = cola = nuevoNodo;
            } else {
                nuevoNodo.siguiente = cabeza;
                cabeza.anterior = nuevoNodo;
                cabeza = nuevoNodo;
            }
            tamanio++;
        }

        public void agregarFinal(String valor) {
            Nodo nuevoNodo = new Nodo(valor);
            if (estaVacia()) {
                cabeza = cola = nuevoNodo;
            } else {
                cola.siguiente = nuevoNodo;
                nuevoNodo.anterior = cola;
                cola = nuevoNodo;
            }
            tamanio++;
        }

        public boolean eliminar(String valor) {
            if (estaVacia()) {
                return false;
            }

            Nodo actual = cabeza;
            while (actual != null) {
                if (actual.valor.equals(valor)) {
                    if (actual.anterior == null) {
                        cabeza = actual.siguiente;
                    } else {
                        actual.anterior.siguiente = actual.siguiente;
                    }

                    if (actual.siguiente == null) {
                        cola = actual.anterior;
                    } else {
                        actual.siguiente.anterior = actual.anterior;
                    }

                    tamanio--;
                    return true;
                }
                actual = actual.siguiente;
            }
            return false;
        }

        public boolean actualizar(String valorActual, String nuevoValor) {
            Nodo actual = cabeza;
            while (actual != null) {
                if (actual.valor.equals(valorActual)) {
                    actual.valor = nuevoValor;
                    return true;
                }
                actual = actual.siguiente;
            }
            return false;
        }

        public void mostrar() {
            if (estaVacia()) {
                System.out.println("La lista estÃ¡ vacÃ­a.");
                return;
            }

            Nodo actual = cabeza;
            System.out.print("Lista: ");
            while (actual != null) {
                System.out.print(actual.valor);
                if (actual.siguiente != null) {
                    System.out.print(" <-> ");
                }
                actual = actual.siguiente;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDobleEnlazada lista = new ListaDobleEnlazada();
        int opcion;

        do {
            System.out.println("\n=== MENU LISTA DOBLE ENLAZADA ===");
            System.out.println("1. Agregar nodo al inicio");
            System.out.println("2. Agregar nodo al final");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Actualizar nodo");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opciÃ³n: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("OpciÃ³n invÃ¡lida. Intente de nuevo.");
                opcion = 0;
                continue;
            }

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el valor para agregar al inicio: ");
                    String valorInicio = scanner.nextLine();
                    lista.agregarInicio(valorInicio);
                    System.out.println("Nodo agregado al inicio.");
                }
                case 2 -> {
                    System.out.print("Ingrese el valor para agregar al final: ");
                    String valorFinal = scanner.nextLine();
                    lista.agregarFinal(valorFinal);
                    System.out.println("Nodo agregado al final.");
                }
                case 3 -> {
                    System.out.print("Ingrese el valor del nodo a eliminar: ");
                    String valorEliminar = scanner.nextLine();
                    if (lista.eliminar(valorEliminar)) {
                        System.out.println("Nodo eliminado.");
                    } else {
                        System.out.println("No se encontrÃ³ el nodo.");
                    }
                }
                case 4 -> {
                    System.out.print("Ingrese el valor actual del nodo: ");
                    String valorActual = scanner.nextLine();
                    System.out.print("Ingrese el nuevo valor: ");
                    String nuevoValor = scanner.nextLine();
                    if (lista.actualizar(valorActual, nuevoValor)) {
                        System.out.println("Nodo actualizado.");
                    } else {
                        System.out.println("No se encontrÃ³ el nodo.");
                    }
                }
                case 5 -> lista.mostrar();
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("OpciÃ³n invÃ¡lida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}