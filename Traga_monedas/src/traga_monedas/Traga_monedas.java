package traga_monedas;

import java.io.*;

public class Traga_monedas {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.print("Ingrese su Nombre: ");
        String nombre = br.readLine();
        Textos arc = new Textos();
                
        arc.Leer(nombre);
        if(true==arc.Leer(nombre))
        
        System.out.println("Ingrese la cantidad de monedas a apostar:\nA.- 1.\nB.- 2.\nC.- 3.\nD.- 5.");
        String Apuesta = br.readLine();
        
/*
        Ruleta Ruleta1 = new Ruleta();
        Ruleta Ruleta2 = new Ruleta();
        Ruleta Ruleta3 = new Ruleta();
        
        Ruleta1.Crear();
        Ruleta2.Crear();
        Ruleta3.Crear();
        
        Ruleta1.Girar();
        Ruleta2.Girar();
        Ruleta3.Girar();
*/
    }
}
