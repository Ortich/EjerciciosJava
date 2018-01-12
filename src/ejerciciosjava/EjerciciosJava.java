/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;
import java.util.Arrays;

/**
 *
 * @author Daniel Ortiz Vallejo
 */
public class EjerciciosJava {
    
    public int[] maximo(int[] listaNumeros){
	int[] numerosMaximos = new int[2];
	for(int i = 0; i<listaNumeros.length;i++){
	    if(numerosMaximos[0] < listaNumeros[i]){
		if(numerosMaximos[0]>numerosMaximos[1]){
		    numerosMaximos[1]= numerosMaximos[0];
		}
		numerosMaximos[0] = listaNumeros[i]; 
	    }
	    else if(numerosMaximos[1] < listaNumeros[i]){
		numerosMaximos[1] = listaNumeros[i]; 
	    }
	}
	return numerosMaximos;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	EjerciciosJava ejercicio1 = new EjerciciosJava();
	int [] listaNumeros = {150, 31,27, 2, 5, 99};
	System.out.println(Arrays.toString(ejercicio1.maximo(listaNumeros)));
	
	
    }
    
}

