package figurasgeometricas_v3.FigurasGeometricas;

public interface Drawable {
    public void draw();

    default void applyTheme(){
        throw new UnsupportedOperationException("Operacion applyTheme sin implementar");
    }
}
