package tienda;

import java.util.Arrays;
import java.io.*;
import javax.swing.JOptionPane;

public class Joyeria {
    
    private Cliente[] clientes;
    private Cliente[] auxClientes;
    private Empleado[] empleados;
    private int eleccion;
    
    public Joyeria(Cliente[] clientes, Empleado[] empleados)
    {
        this.clientes = clientes;
        this.empleados = empleados;
    }
    
    public void setClientes(Cliente[] cli)
    {
        this.clientes = cli;
    }
    
    public Cliente[] getClientes()
    {
        return clientes;
    }
    
    public void setEmpleados(Empleado[] em)
    {
        this.empleados = em;        
    }
    
    public Empleado[] getEmpleados()
    {
        return empleados;
    }
    
    public void imprimirClientes()
    {
        for(int i=0;i<clientes.length;i++)
        {
            System.out.println("Cliente--> "+ (i+1) +" "+ clientes[i].getNombre() + " " 
                                            + clientes[i].getApellido()+ " " + clientes[i].getTipo());
        }
        
    }
    
    public void imprimirEmpleados()
    {
        for(int i=0;i<empleados.length;i++)
        {
            System.out.println("Empleado--> "+ (i+1) +" "+ empleados[i].getNombre() + " " 
                                            + empleados[i].getApellido()+ " " + empleados[i].getTelefono());
        }
        
    }
    
    public void ordenaEmpleados()
    {
        System.out.println("En Orden Alfabetico:");
        
        Arrays.sort(empleados);
        
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
    
    
    public void ordenaClientes()
    {
        System.out.println("En orden natural:");
        
        Arrays.sort(clientes);
        
        for (Cliente p : clientes) {
            System.out.println(p);
        }
    }
    
    public void modificarCliente()
    {
        String r = JOptionPane.showInputDialog(null,"Ingresa el nombre de un cliente: ","MODIFICAR DATOS",JOptionPane.INFORMATION_MESSAGE);
        
        for(int i=0;i<clientes.length;i++)
        {
            if(clientes[i].getNombre().equalsIgnoreCase(r))
            {
                String cadena = "El cliente " + clientes[i].getNombre() + " que dato desea modificar de el ? \n" + 
                                "1.- Nombre \n"
                              + "2.- Apellido \n"
                              + "3.- Direccion \n"
                              + "4.- Tipo de Cliente";
                
                try{
                    
                    eleccion = Integer.parseInt(JOptionPane.showInputDialog(null,cadena,
                                                                          " QUE DESEAS HACER? ",JOptionPane.INFORMATION_MESSAGE));
                    
                   }catch(NumberFormatException e)
                   {
                       JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", "ALERTA!", JOptionPane.ERROR_MESSAGE);
                   }
                
                switch(eleccion)
                {
                    case 1:
                        String nom = JOptionPane.showInputDialog(null,"Ingresa el nuevo nombre :",
                                                                     "MODIFICAR NOMBRE",JOptionPane.INFORMATION_MESSAGE);
                        clientes[i].setNombre(nom);
                        System.out.println(clientes[i].toString());
                    case 2:
                        String ap = JOptionPane.showInputDialog(null,"Ingresa el nuevo apellido : ",
                                                                     "MODIFICAR APELLIDO",JOptionPane.INFORMATION_MESSAGE);
                        clientes[i].setApellido(ap);
                        System.out.println(clientes[i].toString());
                    case 3:
                        String di = JOptionPane.showInputDialog(null,"Ingresa la nueva direccion: ",
                                                                     "MODIFICAR DIRECCION",JOptionPane.INFORMATION_MESSAGE);
                        clientes[i].setDireccion(di);
                        System.out.println(clientes[i].toString());
                    case 4:
                        String tipo = JOptionPane.showInputDialog(null,"Ingresa el nuevo tipo de cliente: ",
                                                                     "MODIFICAR TIPO DE CLIENTE",JOptionPane.INFORMATION_MESSAGE);
                        clientes[i].setTipo(tipo);
                        System.out.println(clientes[i].toString());
                    
                }
                
            }
            
        }
    }
    
    public void modificarEmpleado()
    {
        String r = JOptionPane.showInputDialog(null,"Ingresa El Nombre De Un Empleado: ","MODIFICAR DATOS",JOptionPane.INFORMATION_MESSAGE);
        
        for(int i=0;i<empleados.length;i++)
        {
            if(empleados[i].getNombre().equalsIgnoreCase(r))
            {
                String cadena = "Del Empleado " + empleados[i].getNombre() + " Que Dato Desea Modificar? \n" + 
                                "1.- Nombre \n"
                              + "2.- Apellido \n"
                              + "3.- Direccion \n"
                              + "4.- Telefono \n"
                              + "5.- Salario Mensual";
                
                try{
                    
                    eleccion = Integer.parseInt(JOptionPane.showInputDialog(null,cadena,
                                                                          " QUE DESEAS HACER? ",JOptionPane.INFORMATION_MESSAGE));
                    
                   }catch(NumberFormatException e)
                   {
                       JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", "ALERTA!", JOptionPane.ERROR_MESSAGE);
                   }
                
                switch(eleccion)
                {
                    case 1:
                        String nom = JOptionPane.showInputDialog(null,"Ingresa el nuevo nombre :",
                                                                     "MODIFICAR NOMBRE",JOptionPane.INFORMATION_MESSAGE);
                        empleados[i].setNombre(nom);
                        System.out.println(clientes[i].toString());
                    case 2:
                        String ap = JOptionPane.showInputDialog(null,"Ingresa El Nuevo Apellido : ",
                                                                     "MODIFICAR APELLIDO",JOptionPane.INFORMATION_MESSAGE);
                        empleados[i].setApellido(ap);
                        System.out.println(clientes[i].toString());
                    case 3:
                        String di = JOptionPane.showInputDialog(null,"Ingresa La Nueva Direccion: ",
                                                                     "MODIFICAR DIRECCION",JOptionPane.INFORMATION_MESSAGE);
                        empleados[i].setDireccion(di);
                        System.out.println(clientes[i].toString());
                    case 4:
                        try
                        {
                            int telefono = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa El Nuevo N° De Telefono: ",
                                                                         "MODIFICAR TELEFONO",JOptionPane.INFORMATION_MESSAGE));
                            empleados[i].setTelefono(telefono);
                        }catch(NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", "ALERTA!", JOptionPane.ERROR_MESSAGE);
                        }
                        
                        System.out.println(empleados[i].toString());
                        
                    case 5:
                        try
                        {
                            int salario = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa El Nuevo Salario: ",
                                                                         "MODIFICAR SALARIO MENSUAL",JOptionPane.INFORMATION_MESSAGE));
                            empleados[i].setSalario(salario);                        
                        }catch(NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", "ALERTA!", JOptionPane.ERROR_MESSAGE);
                        }
                        
                        System.out.println(empleados[i].toString());
                    
                }
                
            }
            
        }
    }
    
    public void guardarEmpleados(String datos)
    {
        File f;
        f = new File("datosEmpleados");
        
        try
        {
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write(datos);
            
            wr.close();
            bw.close();
        }catch(IOException e)
        {
            
        }
    }
    
}
