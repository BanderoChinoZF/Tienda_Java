package tienda;

import java.util.LinkedList;
import java.util.List;

public class Principal {
    
   final static Cliente[] clientes = {(new Cliente("Araveli","Cruz","wdcfaevgrbthn","Frecuente")),
                                       (new Cliente("Ingrid","Mariano","wgraehts","General")),
                                       (new Cliente("Luis","Sarniento","agrehtreath","Platino")),
                                       (new Cliente("Dulce","Villalobos","adwreagth","Frecuente"))};
    
    
   final static Empleado[] empleados = {(new Empleado("Hector","Zaraoza",56,96,"vfegrtyhu")),
                                         (new Empleado("Jhoavanny","Farrera",985,95,"ythhy")),
                                         (new Empleado("Daniel","Lopez",5,58,"huj"))};
    
    
   public static void main(String[] args)
    {              
        Joyeria j1 = new Joyeria(clientes,empleados);
        /*j1.imprimirClientes();
        System.out.println();
        
        j1.ordenaClientes();
        System.out.println();
        
        j1.modificarCliente();
        System.out.println();
        
        j1.imprimirEmpleados();
        System.out.println();
        
        j1.ordenaEmpleados();
        System.out.println();
        
        j1.modificarEmpleado();
        System.out.println();*/
        
        for(int i=0;i<empleados.length;i++)
        {
            j1.guardarEmpleados(empleados[i].toString());            
        }
    }
    
}
