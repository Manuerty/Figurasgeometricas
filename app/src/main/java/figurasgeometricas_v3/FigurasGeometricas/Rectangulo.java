package figurasgeometricas_v3.FigurasGeometricas;

public class Rectangulo extends FiguraGeometrica implements Drawable {
    private float base;
    private float altura;

    public Rectangulo(){
        super();
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(float base, float altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String nombre, float base, float altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public float getBase(){
        return this.base;
    }

    public void setBase(float base){
        this.base = base;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    @Override
    public float calcularArea(){
        return this.base * this.altura;
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
