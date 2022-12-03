package listaDobleEnlace;
/**
 *
 * @author User
 */
public class Nodo {
    // declaración de nodo de lista doble
    int dato;
    Nodo adelante;
    Nodo atras;
    Nodo enlace;
    
    public int getDato(){
        return dato;
    }
    
    public Nodo(int entrada){
        dato = entrada;
        adelante = atras = null;
    }
}
