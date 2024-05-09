package figurasgeometricas_v3;

import figurasgeometricas_v3.FigurasGeometricas.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // test constructores

        Rectangulo rectanguloConstructorSuper = new Rectangulo(4, 5);
        Rectangulo rectanguloConstructorLocal = new Rectangulo("rectángulo", 4, 5);

        Circulo circuloConstructorSuper = new Circulo(5);
        Circulo circuloConstructorLocal = new Circulo("círculo", 5);

        Cuadrado cuadradoConstructorSuper = new Cuadrado(2);
        Cuadrado cuadradoConstructorLocal = new Cuadrado("cuadrado", 2);

        Elipse elipseConstructorSuper = new Elipse(3, 4);
        Elipse elipseConstructorLocal = new Elipse("elipse", 3, 4);

        // test herencia y polimorfismo

        List<FiguraGeometrica> figuras = new ArrayList<>(
                Arrays.asList(
                        rectanguloConstructorSuper,
                        rectanguloConstructorLocal,
                        circuloConstructorSuper,
                        circuloConstructorLocal,
                        cuadradoConstructorSuper,
                        cuadradoConstructorLocal,
                        elipseConstructorSuper,
                        elipseConstructorLocal
                )
        );

        for (FiguraGeometrica figura : figuras){
            System.out.println("Area del " + figura.getNombre() + " = " + figura.calcularArea());
        }

    }
}