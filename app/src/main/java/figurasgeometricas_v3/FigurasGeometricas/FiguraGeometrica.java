package figurasgeometricas_v3.FigurasGeometricas;

public abstract class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(){
        this.nombre = "Unknown";
    };

    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    };

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public abstract float calcularArea();
}
