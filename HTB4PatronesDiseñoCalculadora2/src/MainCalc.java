
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 */
public class MainCalc {
    
	public static void main(String[] arg) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(
					"datos.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			Calc calculadora = new Calc("1");
			// Lectura del ficheroSi
			String linea;
			String lineaOperacion = "";
			while ((linea = br.readLine()) != null)
				lineaOperacion = lineaOperacion + linea;
			// System.out.println(lineaOperacion);
			// System.out.println(calculadora.getMiStack());
			double result = calculadora.operar(lineaOperacion);
			if (Double.isNaN(result)) {
				System.out.println("La operación no devuelve un resultado válido o no puede llevarse a cabo.");
			} else {
				System.out.println("Resultado: " + calculadora.operar(lineaOperacion));
			}

		} catch (IOException e) {
		} /*
			 * finally { // En el finally cerramos el fichero, para asegurarnos // que se
			 * cierra tanto si todo va bien como si salta // una excepcion. try { if (null
			 * != fr) { fr.close(); } } catch (IOException e2) { } }
			 */
	}
}
