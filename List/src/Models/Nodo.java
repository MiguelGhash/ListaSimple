/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author salas
 */
public class Nodo 
{
    private Object Data;
    private Nodo Link;

    public Nodo(Object Data) 
    {
        this.Data = Data;
    }
    

    public Object getData()
    {
        return Data;
    }

    public void setData(Object Data)
    {
        this.Data = Data;
    }

    public Nodo getLink()
    {
        return Link;
    }

    public void setLink(Nodo Link)
    {
        this.Link = Link;
    }      
}