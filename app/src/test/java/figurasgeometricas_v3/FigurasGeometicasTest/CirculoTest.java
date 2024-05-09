package figurasgeometricas_v3.FigurasGeometicasTest;

import figurasgeometricas_v3.FigurasGeometricas.Circulo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CirculoTest {

    @Test
    public void testCalcularArea() {
        Circulo circulo = new Circulo("Test Circle", 5);
        float expectedArea = (float) (Math.PI * Math.pow(5, 2));
        assertEquals(expectedArea, circulo.calcularArea());
    }

    @Test
    public void testGetSetRadio() {
        Circulo circulo = new Circulo();
        circulo.setRadio(7);
        assertEquals(7, circulo.getRadio());
    }
}

