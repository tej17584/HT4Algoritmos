
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Clase MAin donde todo corre
 * @author Jose Tejada
 * @author Andres Urizar
 * @version 1.0
 */
public class MainCalc {
    
	public static void main(String[] arg) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
                Scanner sc = new Scanner(System.in);

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(
					"datos.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			// Lectura del ficheroSi
			String linea;
			String lineaOperacion = "";
			while ((linea = br.readLine()) != null)
				lineaOperacion = lineaOperacion + linea;
			// System.out.println(lineaOperacion);
			// System.out.println(calculadora.getMiStack());
                        boolean x = true;
                        while(x){
                            System.out.println("Menú de opciones");
                            System.out.println("1. Arraylist");
                            System.out.println("2. Vector");
                            System.out.println("3. Lista Single");
                            System.out.println("4. Lista Circular");
                            System.out.println("5. Lista Doble");
                            System.out.println("6. Salir");
                            int op =  sc.nextInt();
                            if((op<1)||(op>6)){  //Opcion de validacion
                                System.out.println("La opción que seleccionó no se encuentra en el menú");
                            }else
                            if(op==6){   //Opcion si quiere salir del programa
                                System.out.println("Gracias por utilizar nuestra calculadora");
                                x = false;
                            }else{    //Opcion si eligio alguna de las opciones
                                switch (op) {
                                    case 1:
                                        {
                                           
                                            Calc C1= Calc.getCalc("1");
                                            double result = C1.operar(lineaOperacion);
                                            if (Double.isNaN(result)) {
                                                System.out.println("La operación no devuelve un resultado válido o no puede llevarse a cabo.");
                                            } else {
                                                System.out.println("Resultado: " + C1.operar(lineaOperacion));
                                            }                   break;
                                        }
                                    case 2:
                                        {
                                            Calc C2 = Calc.getCalc("2");
                                            double result = C2.operar(lineaOperacion);
                                            if (Double.isNaN(result)) {
                                                System.out.println("La operación no devuelve un resultado válido o no puede llevarse a cabo.");
                                            } else {
                                                System.out.println("Resultado: " + C2.operar(lineaOperacion));
                                            }                   break;
                                        }
                                    case 3:
                                        {
                                            Calc C3 = Calc.getCalc("3");
                                            double result = C3.operar(lineaOperacion);
                                            if (Double.isNaN(result)) {
                                                System.out.println("La operación no devuelve un resultado válido o no puede llevarse a cabo.");
                                            } else {
                                                System.out.println("Resultado: " + C3.operar(lineaOperacion));
                                            }                   break;
                                        }
                                    case 4:
                                    {
                                        Calc C4= Calc.getCalc("4");
                                        double result = C4.operar(lineaOperacion);
                                        if (Double.isNaN(result)) {
                                                System.out.println("La operación no devuelve un resultado válido o no puede llevarse a cabo.");
                                            } else {
                                                System.out.println("Resultado: " + C4.operar(lineaOperacion));
                                            }                   break;
                                    }
                                    case 5:
                                    { 
                                        Calc C5= Calc.getCalc("5");
                                        double result = C5.operar(lineaOperacion);
                                        if (Double.isNaN(result)) {
                                                System.out.println("La operación no devuelve un resultado válido o no puede llevarse a cabo.");
                                            } else {
                                                System.out.println("Resultado: " + C5.operar(lineaOperacion));
                                            }                   break;
                                        
                                    }
                                    default:
                                        break;
                                }
                                System.out.println("Desea realizar otro calculo? 1. Si 2.No");
                                int op1 = sc.nextInt();
                                if((op1>2)||(op1<1)){
                                    System.out.println("No eligió ninguna de las opciones, se tomara como un No");
                                    System.out.println("Gracias por utilizar nuestra calculadora");
                                    x=false;
                                }else
                                if(op1==2){
                                    System.out.println("Gracias por utilizar nuestra calculadora");
                                    x=false;
                                }
                            }
                        }
                        

		} catch (IOException e) {
		} /*
			 * finally { // En el finally cerramos el fichero, para asegurarnos // que se
			 * cierra tanto si todo va bien como si salta // una excepcion. try { if (null
			 * != fr) { fr.close(); } } catch (IOException e2) { } }
			 */
	}
}
