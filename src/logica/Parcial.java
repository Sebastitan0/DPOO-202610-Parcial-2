package logica;

public class Parcial {
	
	public int potencia (int b, int e) throws Exception {
		if (e < 0) {
			throw new Exception("El numero exponente no puede ser negativo");
		}
		
		if ( b==0 && e == 0) {
			throw new Exception("No se puede elever 0 a la 0");
		}
		
		int respuesta = 1;

		for (int i = 0; i < e; i++) {
		    int x = respuesta * b;

		    if (b != 0 && x / b != respuesta) {
		        throw new Exception("Debido a que el resultado es entero, no es posible que " + b + "^" + e + " > 2147483647");
		    }

		    respuesta = x;
		}

		return respuesta;
	} 	
}



