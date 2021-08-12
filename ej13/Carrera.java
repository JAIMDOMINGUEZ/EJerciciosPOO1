public class Carrera{
   
    public static void main(String[] args) {
        Animal tortuga = new Animal("Tortuga",1);
        Animal liebre = new Animal("Liebre",10);
        tortuga.start();
        liebre.start();
        liebre.setPriority(Thread.MIN_PRIORITY);
        System.out.println(liebre.getPriority());
        liebre.setPriority(Thread.MAX_PRIORITY);
        try {
            liebre.sleep(1000);
        } catch (Exception e) {
            System.err.println(e);        }     
    }
}