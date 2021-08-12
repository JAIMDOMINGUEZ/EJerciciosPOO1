public class Perro{
    private String nombre;
    private Raza raza;
    Perro(String nombre, Raza raza){
        this.nombre = nombre;
        this.raza = raza;
    }
    public String getNombre(){
        return nombre;
    }
    public Raza getRaza(){
        return raza;
    }
    public String toString(){
        return nombre+""+raza.getTipo()+"Precio Base"+raza.getPrecioBase();
    }
}