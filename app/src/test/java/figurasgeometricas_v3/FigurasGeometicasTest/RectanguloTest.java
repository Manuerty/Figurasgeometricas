package figurasgeometricas_v3.FigurasGeometicasTest;


import figurasgeometricas_v3.FigurasGeometricas.Rectangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectanguloTest {

    @Test
    public void testCalcularArea() {
        Rectangulo rectangulo = new Rectangulo("Test Rectangle", 5, 3);
        float expectedArea = 5 * 3;
        assertEquals(expectedArea, rectangulo.calcularArea());
    }

    @Test
    public void testGetSetBase() {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase(7);
        assertEquals(7, rectangulo.getBase());
    }

    @Test
    public void testGetSetAltura() {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAltura(4);
        assertEquals(4, rectangulo.getAltura());
    }
}
