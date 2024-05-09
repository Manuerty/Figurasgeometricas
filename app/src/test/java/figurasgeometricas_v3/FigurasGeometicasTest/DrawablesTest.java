package figurasgeometricas_v3.FigurasGeometicasTest;

import figurasgeometricas_v3.FigurasGeometricas.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DrawablesTest {
    private static List<Drawable> figuras;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {

        figuras = new ArrayList<>();

        Elipse elipse = new Elipse("elipse", 3, 4);
        Circulo circulo = new Circulo("círculo", 5);
        Cuadrado cuadrado = new Cuadrado("cuadrado", 2);
        Rectangulo rectangulo = new Rectangulo("rectángulo", 4, 5);

        figuras.add(elipse);
        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(rectangulo);

        assertEquals(figuras.size(), 4);

    }

    @Test
    public void figuras_incluidas_en_ArrayList_figuras(){
        assertEquals(figuras.size(), 4);
    }


    @Test
    public void testDibujarDrawables() {

        // Dibujemos las figuras

        Drawables.dibujarDrawables(figuras);

        // Las interfaces son un tipo de dato
        // figura es drawable pero no todo drawable es una figura
    }

    @Test
    public void testPolimorfismo(){

        Drawable circulito = new Circulo("círculo", 5);

        assertTrue(circulito instanceof Drawable);
        assertTrue(circulito instanceof Circulo);

        // vista Drawable de circulito => acceso al metodo draw de la interfaz e implementado!

        circulito.draw();

        // vista Drawable de circulito => acceso al metodo applyTheme de la interfaz e implementado!

        circulito.applyTheme();

        // circulito.area(); // no compila: como circulito es de tipo Drawable, no dispone del método area()

        Circulo vistaCirculo;
        vistaCirculo = (Circulo) circulito;

        assertEquals(Math.PI * Math.pow(5, 2), vistaCirculo.calcularArea(), 0.1);
    }

    @Test
    public void testAplicarTema(){

        Drawables.aplicarTema(figuras);

    }
}
