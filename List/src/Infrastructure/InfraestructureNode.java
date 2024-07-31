package Infrastructure;

import Models.Nodo;

public class InfraestructureNode {
    private Nodo first;

    public InfraestructureNode(Nodo first) {
        this.first = first;
    }

    // Buscar el último nodo
    public Nodo Last() {
        Nodo aux = first;
        while (aux != null && aux.getLink() != null) {
            aux = aux.getLink();
        }
        return aux;
    }

    // Obtener el nodo previo
    public Nodo Previous(Nodo Search) {
        Nodo aux = first;
        while (aux != null && aux.getLink() != Search) {
            aux = aux.getLink();
        }
        return aux;
    }
}
