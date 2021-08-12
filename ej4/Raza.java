public enum Raza{
    PITBULL("Pitbull",300.0f),
    PASTOR_ALEMAN("Pastor aleman", 350.0f),
    BOXER("Boxer",150.0f);

    private String tipo;
    private float precioBase;

    private Raza(String tipo, float precioBase){
        this.tipo = tipo;
        this.precioBase = precioBase;
    }
    public String getTipo(){
        return tipo;
    }
    public float getPrecioBase(){
        return precioBase;
    }
}