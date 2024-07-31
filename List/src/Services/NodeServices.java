/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import Infrastructure.*;
import Models.*;
/**
 *
 * @author salas
 */
public class NodeServices {
    InfraestructureList Lista = new InfraestructureList();
    private Nodo first;
    
    public void AgregarInicio(Object Obj)
    {
        Lista.AddFirst(Obj);
    }
      public void Enlistar(Object Obj)
    {
        Lista.Enlist(Obj);
    }
    public void AgregarFinal(Object Obj)
    {
        Lista.AddLast(Obj);
    }    
    public String Imprimir()
    {
        return Lista.ToString();
    }
    public void Borrar(Object Obj)
    {
        Lista.Delete(Obj);
    }
  public int Size()
  {
     return Lista.Size();
  }
  public void InsertarEnPosicion(int Posicion, Object Obj)
  {
      Lista.InsertarEnPosicion(Posicion, Obj);
  }
}
