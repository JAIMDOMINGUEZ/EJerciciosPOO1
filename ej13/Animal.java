public class Animal extends Thread{
    String nombre;
    public Animal(String nombre,int prioridad){
        this.nombre = nombre;
        super.setPriority(prioridad);
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hola "+nombre);
        }
        System.out.println("Llego la "+nombre);
    }
}
