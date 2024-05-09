package figurasgeometricas_v3.FigurasGeometicasTest;

import org.junit.jupiter.api.Test;
import figurasgeometricas_v3.FigurasGeometricas.Cuadrado;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuadradoTest {

    @Test
    public void testCalcularArea() {
        Cuadrado cuadrado = new Cuadrado("Test Square", 5);
        float expectedArea = 5 * 5; // Equivalent to Math.pow(5, 2)
        assertEquals(expectedArea, cuadrado.calcularArea() );
    }

    @Test
    public void testGetSetLado() {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(7);
        assertEquals(7, cuadrado.getLado());
    }
}
