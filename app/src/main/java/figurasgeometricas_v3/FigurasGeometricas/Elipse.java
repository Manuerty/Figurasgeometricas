package figurasgeometricas_v3.FigurasGeometricas;

public class Elipse extends FiguraGeometrica implements Drawable {
    private float semiejeMayor;
    private float semiejeMenor;

    public Elipse(){
        super();
        this.semiejeMayor = 0;
        this.semiejeMenor = 0;
    }

    public Elipse(float semiejeMayor, float semiejeMenor){
        super();
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }

    public Elipse(String nombre, float semiejeMayor, float semiejeMenor){
        super(nombre);
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }

    public float getSemiejeMayor(){
        return this.semiejeMayor;
    }

    public void setSemiejeMayor(float semiejeMayor){
        this.semiejeMayor = semiejeMayor;
    }

    public float getSemiejeMenor(){
        return this.semiejeMenor;
    }

    public void setSemiejeMenor(float semiejeMenor){
        this.semiejeMenor = semiejeMenor;
    }

    @Override
    public float calcularArea(){
        return (float) (Math.PI * this.semiejeMayor * this.semiejeMenor);
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
