public class PrincipalListaEnlazada {

    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        lista.agregarNodoInicio("E");
        lista.agregarNodoInicio("D");
        lista.agregarNodoInicio("C");
        lista.agregarNodoInicio("B");
        lista.agregarNodoInicio("A");

        System.out.println("Lista inicial:");
        lista.recorrido();

        lista.agregarFinal("X");
        System.out.println("Después de agregar X al final:");
        lista.recorrido();

        lista.eliminarNodo("D");
        System.out.println("Después de eliminar D:");
        lista.recorrido();

        lista.buscarNodo("C");

        lista.actualizarNodo("C", "Z");
        System.out.println("Después de actualizar C por Z:");
        lista.recorrido();
    }
}