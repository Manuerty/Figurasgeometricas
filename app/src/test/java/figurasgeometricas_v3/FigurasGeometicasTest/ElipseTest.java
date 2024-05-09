package figurasgeometricas_v3.FigurasGeometicasTest;

import figurasgeometricas_v3.FigurasGeometricas.Elipse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElipseTest {

    @Test
    public void testCalcularArea() {
        Elipse elipse = new Elipse("Test Elipse", 5, 3);
        float expectedArea = (float) (Math.PI * 5 * 3);
        assertEquals(expectedArea, elipse.calcularArea());
    }

    @Test
    public void testGetSetSemiejeMayor() {
        Elipse elipse = new Elipse();
        elipse.setSemiejeMayor(7);
        assertEquals(7, elipse.getSemiejeMayor());
    }

    @Test
    public void testGetSetSemiejeMenor() {
        Elipse elipse = new Elipse();
        elipse.setSemiejeMenor(4);
        assertEquals(4, elipse.getSemiejeMenor());
    }
}

