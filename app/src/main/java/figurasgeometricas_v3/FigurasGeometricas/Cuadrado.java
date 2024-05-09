package figurasgeometricas_v3.FigurasGeometricas;

public class Cuadrado extends FiguraGeometrica implements Drawable {
    private float lado;

    public Cuadrado(){
        super();
        this.lado = 0;
    }

    public Cuadrado(float lado){
        super();
        this.lado = lado;
    }

    public Cuadrado(String nombre, float lado){
        super(nombre);
        this.lado = lado;
    }

    public float getLado(){
        return this.lado;
    }

    public void setLado(float lado){
        this.lado = lado;
    }

    @Override
    public float calcularArea(){
        return this.lado * this.lado; // Equivalente a Math.pow(this.lado, 2)
    }

    @Override
    public void draw() {
        System.out.println("Esto es un: " + this.getNombre());
    }

    @Override
    public void applyTheme(){
        System.out.println("Aplicado un tema chulo a: " + this.getNombre());
    }
}
