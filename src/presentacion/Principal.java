package presentacion;

import logica.Parcial;

public class Principal {

    public static void main(String[] args) {

        Parcial parcial = new Parcial();

        probar(parcial, 2, 3);          
        probar(parcial, 3, -3);         
        probar(parcial, 0, 0);   
        probar(parcial, 0, 2);
        probar(parcial, 46340, 2);
        probar(parcial, 46341, 2);
    }
    // 2.147.483.647 numero maximo
    // 2.147.395.600 46340 Me puse a probar numeros por curiosidad y despues de ese al cuadrado ya me lanza la excepcion
    
    public static void probar(Parcial parcial, int b, int e) {
        try {
            int resultado = parcial.potencia(b, e);
            System.out.println(resultado);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}