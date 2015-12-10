/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrefactorizacioncod;

/**
 *
 * @author plago-bergonpazos
 */
public class ExamenRefactorizacionCOD {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean primo = false;

    public static void main(String[] args) {
        int digito = 3;
        int numeroDigitos = 0;
        if (digito <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contador = 0;

            numeroDigitos = devolverContador(aux, contador);

            if (numeroDigitos == digito) {
                if (i < 4) {
                    primo = true;
                } else {
                    if (i % 2 == 0) {
                        primo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int k = (i - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        contador1 = primoDivisible(i1, k, i, contador1);

                        if (contador1 == 1) {
                            primo = true;
                        }
                    }
                }

                if (primo == true) {
                    System.out.println(i);
                }
            }
        }
    }

    public static int primoDivisible(int i1, int k, int i, int contador1) {
        
        while (i1 <= k) {
            if (i % i1 == 0) {
                contador1++;
            
            }i1 += 2;
            if (contador1 == 2) {
                i1 = k + 1;
            }
        }
        return contador1;
    }

    public static int devolverContador(int aux, int contador) {
        while (aux != 0) {
            aux = aux / 10;
            contador++;
        }
        return contador;
    }
    
    

}
