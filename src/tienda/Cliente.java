package tienda;

public class Cliente implements Comparable{
    
    private String nombre;
    private String ap_p;
    private String direccion;
    private String tipo_cliente;
    
    public Cliente(String nombre, String ap_p, String direccion, String tipo_cliente)
    {
        this.nombre = nombre;
        this.ap_p = ap_p;
        this.direccion = direccion;
        this.tipo_cliente = tipo_cliente;
    }
    
    public void setNombre(String nom)
    {
        this.nombre = nom;        
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setApellido(String ap)
    {
        this.ap_p = ap;
    }
    
    public String getApellido()
    {
        return ap_p;
    }
    
    public void setDireccion(String direcc)
    {
        this.direccion = direcc;
    }
    
    public String getDireccion()
    {
        return direccion;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo_cliente = tipo;
    }
    
    public String getTipo()
    {
        return tipo_cliente;
    }
    
    @Override
    public String toString() 
    {
        return "Cliente ----> |" + nombre + "| |" + ap_p +"| |"+ direccion +"| |" + tipo_cliente +"|" ;
    }

    @Override
    public int compareTo(Object o) 
    {
        //hacemos un casting del objeto pasado como argumento
        Cliente p = (Cliente) o;
 
        //comparamos el nombre de este objeto con el nombre del otro objeto
        return this.nombre.compareTo(p.getNombre());
    }
    
}
