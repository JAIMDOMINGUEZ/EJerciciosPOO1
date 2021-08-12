public class TestRaza{
    public static void main(String args[]){
        Perro p = new Perro("Solovino",Raza.PASTOR_ALEMAN);
        Perro pp = new Perro("Fido",Raza.BOXER);
        System.out.println(p);
        System.out.println(pp);
        float total = p.getRaza().getPrecioBase()+pp.getRaza().getPrecioBase();
        
    }

}