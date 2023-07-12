
package guia5extra1;

public class Pila {
    private int tope;
    private String[] elementos;

    // Constructor
    public Pila(int tamaño) {
        tope = -1;
        elementos = new String[tamaño];
    }

    // Método para agregar un elemento a la Pila
    public void agregar(String elem) {
        if (!pilaLlena()) {
            tope++;
            elementos[tope] = elem;
        } else {
            System.out.println("La Pila está llena. No se puede agregar el elemento.");
        }
    }

    // Método para ver el elemento en el tope de la Pila
    public String verTope() {
        if (!pilaVacia()) {
            return elementos[tope];
        } else {
            System.out.println("La Pila está vacía.");
            return null;
        }
    }

    // Método para quitar y retornar el elemento en el tope de la Pila
    public String quitar() {
        if (!pilaVacia()) {
            String elem = elementos[tope];
            tope--;
            return elem;
        } else {
            System.out.println("La Pila está vacía. No se puede quitar ningún elemento.");
            return null;
        }
    }

    // Método para verificar si la Pila está vacía
    public boolean pilaVacia() {
        return tope == -1;
    }

    // Método para verificar si la Pila está llena
    public boolean pilaLlena() {
        return tope == elementos.length - 1;
    }
}
