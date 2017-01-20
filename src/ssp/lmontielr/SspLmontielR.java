/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp.lmontielr;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SspLmontielR {

    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) { System.out.println("Calculadora IMC");
        // Paso 1. Declaración de variable (identificadores)
            double w, l, imc;
            String eIMC;
            // En la siguente linea le indico a Java que utilizaré// un teclado
            Scanner keyboard=new Scanner(System.in);
            // Paso 2. Asignar valores a la variable.
            System.out.println("Intorduce la peso");
            w=keyboard.nextDouble();
            System.out.println("Introduce la estatura");
            l=keyboard.nextDouble();
                        // Paso 3. Resolver el problema.
            imc= w/ Math.pow(l,2);
            // 3.1 Evaluamos IMC.
            if(imc>25){             
            eIMC="Sobrepeso";
                    } else if(imc<19){
                        eIMC="Desnutrición";
                    } else{
                        eIMC="Normal";
                    }
                   // Paso 4. Mostrar el resultado
                   System.out.println("peso="+w);
                   System.out.println("Estatura="+l);
                   System.out.println("IMC="+imc);
                   System.out.println(eIMC);
                  
            
                    
    }
    
}
