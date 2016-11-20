package traga_monedas;

import java.io.*;

public class Traga_monedas {

    public static void main(String[] args) {
        
        
        
        
        Ruleta Ruleta1 = new Ruleta();
        Ruleta Ruleta2 = new Ruleta();
        Ruleta Ruleta3 = new Ruleta();
        
        Ruleta1.Crear();
        Ruleta2.Crear();
        Ruleta3.Crear();
        
        Ruleta1.Girar();
    }
}
