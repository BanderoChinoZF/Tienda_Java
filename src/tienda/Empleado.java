package tienda;

public class Empleado implements Comparable {
    
    private String nombre;
    private String ap_p;
    private int telefono;
    private int salario_M;
    private String direccion;
    
    public Empleado(String nombre,String ap_p,int telefono,int salario_M,String direccion)
    {
        this.nombre = nombre;
        this.ap_p = ap_p;
        this.telefono = telefono;
        this.salario_M = salario_M;
        this.direccion = direccion;
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
    
    public void setTelefono(int tel)
    {
        this.telefono = tel;
        
    }
    public int getTelefono()
    {
        return telefono;
    }
    
    public void setSalario(int s)
    {
        this.salario_M = s;        
    }
    public int getSalario()
    {
        return salario_M;        
    }
    
    public void setDireccion(String direcc)
    {
        this.direccion = direcc;
    }
    public String getDireccion()
    {
        return direccion;        
    }
    
    @Override
    public String toString() 
    {
        return "Cliente ----> |" + nombre + "| |" + ap_p +"| |"+ direccion + "| |" + telefono + "| |" + salario_M +"|";
    }

    @Override
    public int compareTo(Object o) 
    {
        //hacemos un casting del objeto pasado como argumento
        Empleado p = (Empleado) o;
 
        //comparamos el nombre de este objeto con el nombre del otro objeto
        return this.nombre.compareTo(p.getNombre());
    }
    
}
