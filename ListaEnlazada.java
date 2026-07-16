public class ListaEnlazada {

    Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    // Insertar al inicio
    public void agregarNodoInicio(String dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguienteNodo = cabeza;
        cabeza = nuevo;
    }

    // Insertar al final
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

    // Eliminar un nodo
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

    // Buscar un nodo
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

    // Mostrar la lista
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