public class ListaEnlazada {
    Nodo cabeza;

    public void agregarNodoInicio(String datoNodo){
        Nodo nuevo = new Nodo(datoNodo);
        nuevo.siguienteNodo = cabeza;
        cabeza = nuevo;
    }
    public void recorrido(){
        Nodo actual = cabeza;
        while (actual != null){
            System.out.println(actual.Dato);
            actual = actual.siguienteNodo;
        }
    }
    public void agregarFinal(String datoNodo){
        Nodo nuevo = new Nodo(datoNodo);
        if (cabeza == null){
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        while(actual.siguienteNodo != null){
            actual = actual.siguienteNodo;
        }
        actual.siguienteNodo = nuevo;
    }
    public boolean eliminarNodo(String datoEliminar){
        if (cabeza == null){
            return false;
        }
        Nodo actual = cabeza;
        while (actual.siguienteNodo != null){
            if(actual.siguienteNodo.Dato.equals(datoEliminar)){
                actual.siguienteNodo = actual.siguienteNodo.siguienteNodo;
                return true;
            }
            actual = actual.siguienteNodo;
        }
        return false;
    }
    public boolean buscarNodo(String datoBuscar){
        Nodo actual = cabeza;

        while(actual != null){
            if(actual.Dato.equals(datoBuscar)){
                return true;
            }
            actual = actual.siguienteNodo;
        }
        return false;
    }
    public boolean actualizarNodo(String datoActual, String datoNuevo){
        Nodo actual = cabeza;

        while(actual != null){
            if(actual.Dato.equals(datoActual)){
                actual.Dato = datoNuevo;
                return true;
            }
            actual = actual.siguienteNodo;
        }

        return false;
    }
    
}