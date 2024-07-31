package Controller;
import Services.*;
import javax.swing.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NodeServices Lista = new NodeServices();
       String Menu[]={"Agregar","Agregar al Inicio","Mostrar","Total de elementos","Eliminar","Agregar en posición","Salir"};
       String Opt;
       String Dato = null;
       
       do
       {
         Opt=(String)JOptionPane.showInputDialog(null, "Selected option",
                      "Main Menu", 1, null, Menu, Menu[0]);
              switch(Opt)
              {
                 case "Agregar al Inicio":
                 Dato = JOptionPane.showInputDialog("Dame un dato para agregar al inicio de lista :D");
                 Lista.AgregarInicio(Dato);
                 break;
                 case "Mostrar":
                     JOptionPane.showMessageDialog(null, "Lista de datos agregados: "+ "\n" + Lista.Imprimir());
                 break;
                 case "Eliminar":
                     Dato = JOptionPane.showInputDialog(null,"Ingrese el Dato a borrar");
                     Lista.Borrar(Dato);
                     JOptionPane.showMessageDialog(null, "Dato borrado con éxito");
                 break;
                 case "Agregar":
                     Dato = JOptionPane.showInputDialog("Dame un dato para enlistar :D");
                     Lista.Enlistar(Dato);
                     break;
                 case "Total de elementos":
                    JOptionPane.showMessageDialog(null, "El total de datos en la lista es de: " + Lista.Size());
                    break;
                 case "Agregar en posición":
                     int Posicion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la posición donde desea agregar el dato"));
                     Dato = JOptionPane.showInputDialog("Dame un dato para agregar al inicio de lista :D");
                     Lista.InsertarEnPosicion(Posicion, Dato);
                     break;
                         
                 
              }
       } while(!Opt.equals("Salir"));
    }
    
}
