package figurasgeometricas_v3.FigurasGeometricas;



public class Circulo extends FiguraGeometrica implements Drawable {

    private float radio;

    public Circulo(){
        super();
        this.radio = 0;
    }

    public Circulo(float radio){
        super();
        this.radio = radio;
    }

    public Circulo(String nombre, float radio){
        super(nombre);
        this.radio = radio;
    }

    public float getRadio(){
        return this.radio;
    }

    public void setRadio(float radio){
        this.radio = radio;
    }

    @Override
    public float calcularArea(){
        return (float) (Math.PI * Math.pow(this.radio, 2));
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
