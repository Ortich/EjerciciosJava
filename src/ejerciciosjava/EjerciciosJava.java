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
	//Puede tambien iniciarse de la siguiente manera: int [] numerosMaximos = {0,0};
	for(int i = 0; i<listaNumeros.length;i++){
	    if(numerosMaximos[0] < listaNumeros[i]){
		numerosMaximos[1]= numerosMaximos[0];
		numerosMaximos[0] = listaNumeros[i]; 
	    }
	    else if(numerosMaximos[1] < listaNumeros[i]){
		numerosMaximos[1] = listaNumeros[i]; 
	    }
	}
	return numerosMaximos;
    }
    
    public boolean palindromo(String frase){
    boolean palindromo = true;
    String fraseSimple= frase.replaceAll("\\W","");
    for(int i = 0; i < fraseSimple.length();i++){
	if(fraseSimple.charAt(i)!=fraseSimple.charAt(fraseSimple.length()-i-1)&& palindromo==true){
	    palindromo = false;
	}
    }
    return palindromo;
    }
    
    public void ejemplosString(){
	String cadena1 = "Acaso hubo buhos aca";
	//Para buscar un eslavon concreto de la cadena
	System.out.println(cadena1.charAt(7));
	System.out.println(cadena1.charAt(0));
	System.out.println(cadena1.charAt(cadena1.length()-1));
	//Para buscar una ristra de cadenas en concreto
	System.out.println(cadena1.substring(6, 9));
	System.out.println(cadena1.substring(11, 16));
	System.out.println(cadena1.substring(11,cadena1.length()));
	System.out.println(cadena1.substring(6));
	//Array por palabras, dado que lo que separan las palabras es un espacio,
	//el split lo marcara el " "(Espacio en blanco)
	String[] arrayPalabras = cadena1.split(" ");
	System.out.println(arrayPalabras[2]);
	System.out.println(arrayPalabras[0]);
	//Funciones de busqueda 
	System.out.println(cadena1.indexOf('h')); //Posicion de la primera aparicion de la h
	System.out.println(cadena1.indexOf('z'));//si no encuentra la letra pone -1
	System.out.println(cadena1.indexOf("buho"));//Busca tambien por palabras
	System.out.println(cadena1.indexOf("culo"));//tambien puede buscar palabras que no estan y sale -1
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	EjerciciosJava ejercicio1 = new EjerciciosJava();
	//Pruebas para maximo
	int [] listaNumeros = {150, 31,27, 2, 5, 99};
	System.out.println(Arrays.toString(ejercicio1.maximo(listaNumeros)));

	//Pruebas para ejemplosString
	ejercicio1.ejemplosString();
	
	//Pruebas para palindromo
	System.out.println(ejercicio1.palindromo("acaso hubo buhos aca"));
	
    }
    
}

