package Infrastructure;

import Models.Nodo;

public class InfraestructureList {
    private Nodo first;
    private InfraestructureNode InfraNode;

    public InfraestructureList() {
        this.InfraNode = new InfraestructureNode(first);
    }

    // Comprobar si la lista está vacía
    public boolean IsEmpty() {
        return first == null;
    }

    // Agregar al inicio de la lista 
    public void AddFirst(Object Obj) {
        Nodo aux = first;
        if (IsEmpty())
            first = new Nodo(Obj);
        else {
            Nodo n = new Nodo(Obj);
            n.setLink(first);
            first = n;
        }
        // Actualizar la referencia en InfraestructureNode
        InfraNode = new InfraestructureNode(first);
    }

    // Insertar al final
    public void AddLast(Object Obj) {
        if (IsEmpty()) {
            AddFirst(Obj);
        } else {
            Nodo Nuevo = new Nodo(Obj);
            Nodo Final = InfraNode.Last();
            if (Final != null) {
                Final.setLink(Nuevo);
            } else {
                throw new RuntimeException("No se pudo encontrar el último nodo. La lista podría estar mal inicializada.");
            }
        }
    }

    // Enlistar 
    public void Enlist(Object Obj) {
        AddLast(Obj);
    }

    // Borrar el primer nodo
    public boolean DeleteFirst() {
        if (!IsEmpty()) {
            Nodo aux = first;
            first = first.getLink();
            aux = null;
            return true;
        }
        return false;
    }

    // Borrar un nodo
    public boolean Delete(Object Obj) {
        Nodo aux = first;
        if (!IsEmpty()) {
            while (aux != null && !aux.getData().equals(Obj)) {
                aux = aux.getLink();
            }
            if (aux == null) {
                return false;
            } else {
                if (aux == first)
                    DeleteFirst();
                else {
                    Nodo Previo = InfraNode.Previous(aux);
                    Previo.setLink(aux.getLink());
                    aux = null;
                }
                return true;
            }
        }
        return false;
    }

    // Método para imprimir la información de los nodos 
    public String ToString() {
        String text = "";
        Nodo aux = first;

        while (aux != null) {
            text = text + aux.getData() + "\n";
            aux = aux.getLink();
        }
        return text;
    }
    //Total de elementos en la lista
    public int Size()
    {
        int Count = 0;
        Nodo aux = first;
        while(aux!=null)
        {
            Count = Count + 1;
            aux = aux.getLink();
        }
        return Count;
    }
    //Insertar en una posición dada
    public void InsertarEnPosicion(int Posicion, Object Obj)
    {
            if (Posicion== 1) 
            {
            AddFirst(Obj);
            } else 
            {
                if(Posicion==Size()+1)
                {
                  AddLast(Obj);  
                } else
                {
                    int Count = 1;
                    Nodo aux = first;
                    while (aux != null && Count < Posicion) 
                    {
                        aux = aux.getLink();
                        Count++;
                    }
                    Nodo Nuevo = new Nodo(Obj);
                    Nuevo.setLink(aux);
                    Nodo Previo = InfraNode.Previous(aux);
                    Previo.setLink(Nuevo);
                }
            }         
    }
    //
}
