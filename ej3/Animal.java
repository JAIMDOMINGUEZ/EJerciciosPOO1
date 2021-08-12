public class Animal{
    private int raza;
    private String nombre;
    public Animal(int raza,String nombre){
        this.nombre = nombre;
        this.raza = raza;

    }
    public String getDatos(){
        return nombre+"\t"+raza;
    }
    

}