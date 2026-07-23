public class ListaEnlazadaBasica {
    static void main() {
        Nodo n1 = new Nodo("A");
        Nodo n2 = new Nodo("B");
        Nodo n3 = new Nodo("C");
        Nodo n4 = new Nodo("D");
        Nodo n5 = new Nodo("E");
        Nodo cabeza  = n1;
        n1.siguienteNodo = n2;
        n2.siguienteNodo = n3;
        n3.siguienteNodo = n4;
        n4.siguienteNodo = n5;
    
    }
}
