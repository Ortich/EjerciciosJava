/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Arrays;

/**
 * Esta clase está hecha para práticar los arrays.
 *
 * @author Daniel Ortiz Vallejo
 */
public class EjerciciosJava {

    /**
     * Este método busca los numeros máximos de un array de clase int.
     *
     * @param listaNumeros[] Este es el array a comprobar.
     * @return Devuelve los dos números máximos.
     */
    public int[] maximo(int[] listaNumeros) {
	int[] numerosMaximos = new int[2];					//Array para guardar los máximos
	//Puede tambien iniciarse de la siguiente manera: int [] numerosMaximos = {0,0};
	for (int i = 0; i < listaNumeros.length; i++) {				//Con esto recorremos los arrays
	    if (numerosMaximos[0] < listaNumeros[i]) {				//Con este primer if comprobamos si es mayor el número,
		numerosMaximos[1] = numerosMaximos[0];				//si lo es lo guardamos, y elanterior lo pasamos a segunda posición.
		numerosMaximos[0] = listaNumeros[i];
	    } else if (numerosMaximos[1] < listaNumeros[i]) {			//Ahora comprobamos la segunda posicion,
		numerosMaximos[1] = listaNumeros[i];				// para asi guardar el segundo mayor.
	    }
	}
	return numerosMaximos;
    }

    /**
     * Este método nos dirá si el String que le pasamos es un palíndromo o no
     *
     * @param frase La frase a comprobar
     * @return Devolverá sí si es palíndromo
     */
    public boolean palindromo(String frase) {
	boolean palindromo = true;
	String fraseSimple = frase.toUpperCase();				//Primero comprobamos quitamos los posibles errores. 
	fraseSimple = fraseSimple.replaceAll("Á", "A");				//Para ello lo pasamos todo a mayúsculas,
	fraseSimple = fraseSimple.replaceAll("Ä", "A");				//quitamos acentos y reemplazamos la 'Ñ'.

	fraseSimple = fraseSimple.replaceAll("É", "E");
	fraseSimple = fraseSimple.replaceAll("Ë", "E");

	fraseSimple = fraseSimple.replaceAll("Í", "I");
	fraseSimple = fraseSimple.replaceAll("Ï", "I");

	fraseSimple = fraseSimple.replaceAll("Ó", "O");
	fraseSimple = fraseSimple.replaceAll("Ö", "O");

	fraseSimple = fraseSimple.replaceAll("Ú", "U");
	fraseSimple = fraseSimple.replaceAll("Ü", "U");

	fraseSimple = fraseSimple.replaceAll("Ñ", "n");

	fraseSimple = fraseSimple.replaceAll("\\W", "");			//Ahora quitamos el resto de símbolos que no sean letras.

	for (int i = 0; i < fraseSimple.length() / 2; i++) {			//Aquí recorremos el Array haciendo las comprobaciones.
	    if (fraseSimple.charAt(i) != fraseSimple.charAt(fraseSimple.length() - i - 1) && palindromo == true) {
		palindromo = false;
	    }
	}
	return palindromo;
    }

    /**
     * Este método sirve como práctica y ejemplo de Arrays del tipo char y
     * String.
     */
    public void ejemplosString() {
	String cadena1 = "Acaso hubo buhos aca";
	//Para buscar un eslavon concreto de la cadena
	System.out.println(cadena1.charAt(7));
	System.out.println(cadena1.charAt(0));
	System.out.println(cadena1.charAt(cadena1.length() - 1));
	//Para buscar una ristra de cadenas en concreto
	System.out.println(cadena1.substring(6, 9));
	System.out.println(cadena1.substring(11, 16));
	System.out.println(cadena1.substring(11, cadena1.length()));
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
     * Este método nos dirá si la palanbra a comprobar es un isograma
     *
     * @param palabra La palabra a comprobar
     * @return Devolverá Verdadero si es un Isograma, falso en el contrario.
     */
    public boolean isograma(String palabra) {
	boolean esIsograma = true;						//Primero declaramos el boolean que nos dirá si es un isograma.
	int letrasRepetidas;							//Ahora declaramos un int que contará las letras repetidas
	for (int i = 0; i < palabra.length(); i++) {				//Ahora haremos dos recorridos, en el primero cogemos una letra
	    letrasRepetidas = 0;						//Marcamos las repeticiones a 0
	    for (int j = 0; j < palabra.length(); j++) {				//Y recorremos la palabra en busca de repeticiones.
		if (palabra.charAt(i) == palabra.charAt(j)) {			//Si hay una repeticion, suma 1 a las repeticiones.
		    letrasRepetidas++;
		}
	    }
	    if (letrasRepetidas > 1) {						//Si las repeticiones son mas de 1, entonces no es un isograma.
		esIsograma = false;
	    }
	}

	return esIsograma;
    }

    /**
     * Este método imprimirá en pantalla un calendario teniendo en cuenta un
     * número de días por delante del mes. Todos los meses a immprimir son de 31
     * días.
     *
     * @param retraso Este parámetro recibirá los días que tiene por delante el mes.
     */
    public void calendario(int retraso) {
	int diasSemana = 0;							//Primero declaramos un contador de días de la semana,para saber cuando hacer un salto de linea
	String[] calendario = new String[31];					//Ahora hacemos un Array que usaremos a modo de contador.
	for (int i = 0; i < retraso; i++) {					//Pintamos los días por delante del mes
	    if (diasSemana < 7) {
		System.out.print("XX ");
		diasSemana++;
	    } else {//Cuando los dias de la semana lle
		System.out.println();
		System.out.print("XX ");
		diasSemana = 1;
	    }
	}
	for (int i = 0; i < calendario.length; i++) {
	    if (diasSemana < 7) {
		if (i < 9) {
		    System.out.print("0");
		}
		System.out.print((i + 1) + " ");
		diasSemana++;
	    } else {
		System.out.println();
		if (i < 9) {
		    System.out.print("0");
		}
		System.out.print((i + 1) + " ");
		diasSemana = 1;
	    }
	}
	for (int i = diasSemana; i < 7; i++) {
	    System.out.print("XX ");
	}
	System.out.println();
    }

    public boolean escaleraDePalabras(char[][] escalera) {
	boolean esEscalera = true;
	int letrasDiferentes;
	for (int fila = 0; fila < escalera.length - 1; fila++) {
	    letrasDiferentes = 0;
	    if (escalera[fila].length == escalera[fila + 1].length) {
		for (int columna = 0; columna < escalera[fila].length; columna++) {
		    if (escalera[fila][columna] != escalera[fila + 1][columna]) {
			letrasDiferentes++;
		    }
		    if (letrasDiferentes > 1) {
			esEscalera = false;
		    }
		}
	    } else {
		System.out.println("Las palabras tienen distinta longitud");
	    }
	}
	return esEscalera;
    }

    public int adn(char[][] cadenaADN) {
	int fallos = 0;
	if (cadenaADN[0].length == cadenaADN[1].length) {
	    for (int fila = 0; fila < cadenaADN[0].length; fila++) {
		fallos += hazComprobacion(cadenaADN[0][fila], cadenaADN[1][fila]);
	    }
	}
	return fallos;
    }

    public int hazComprobacion(char nucleotido1, char nucleotido2) {
	/*
	Este método recinirá dos char y hará comprobaciones de los fallos
	en los nucleotidos.
	 */
	int numFallo = 0;
	if (nucleotido1 == nucleotido2 && nucleotido1 != '-') {
	    numFallo++;
	    return numFallo;
	}
	if (nucleotido1 == '-' || nucleotido2 == '-') {
	    numFallo = 2;
	    return numFallo;
	}
	if (nucleotido1 == 'A') {
	    nucleotido1 = 'T';
	}
	if (nucleotido2 == 'A') {
	    nucleotido2 = 'T';
	}
	if (nucleotido1 == 'G') {
	    nucleotido1 = 'C';
	}
	if (nucleotido2 == 'G') {
	    nucleotido2 = 'C';
	}
	if (nucleotido1 != nucleotido2) {
	    numFallo++;
	}
	return numFallo;

    }

    public boolean cabeUnaCaja(boolean[][] camion, int ancho, int alto) {
	boolean cabe = false;
	for (int altoCamion = 0; altoCamion < camion.length; altoCamion++) {
	    for (int anchoCamion = 0; anchoCamion < camion[0].length; anchoCamion++) {
		if (camion[altoCamion][anchoCamion] == false) {
		    cabe = cabeCajaAux(camion, anchoCamion, altoCamion, ancho, alto);
		    if (cabe) {
			return cabe;
		    }
		}
	    }
	}
	return cabe;
    }

    public boolean cabeCajaAux(boolean[][] camion, int posXCamion, int posYCamion, int anchoCaja, int altoCaja) {
	boolean cabe = true;
	if (posYCamion + altoCaja <= camion.length && posXCamion + anchoCaja <= camion[0].length) {
	    for (int posY = posYCamion; posY < posYCamion + altoCaja; posY++) {
		for (int posX = posXCamion; posX < posXCamion + anchoCaja; posX++) {
		    if (camion[posY][posX]) {
			cabe = false;
		    }
		}
	    }
	} else {
	    cabe = false;
	}
	//Con este método dará la vuelta a la caja para ver si cabe en otro sentido
	if (!cabe) {
	    cabe = true;
	    if (posYCamion + anchoCaja <= camion.length && posXCamion + altoCaja <= camion[0].length) {
		for (int posY = posYCamion; posY < posYCamion + anchoCaja; posY++) {
		    for (int posX = posXCamion; posX < posXCamion + altoCaja; posX++) {
			if (camion[posY][posX]) {
			    cabe = false;
			}
		    }
		}
	    }
	}
	return cabe;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	EjerciciosJava ejercicio1 = new EjerciciosJava();
	//Pruebas para maximo
	int[] listaNumeros = {150, 31, 27, 2, 5, 99};
	System.out.println(Arrays.toString(ejercicio1.maximo(listaNumeros)));

	System.out.println("------------------------------------------------------------------------");
	//Pruebas para ejemplosString
	ejercicio1.ejemplosString();

	System.out.println("------------------------------------------------------------------------");
	//Pruebas para palindromo
	System.out.println("Acaso hubo buhos acá");
	System.out.println(ejercicio1.palindromo("Acaso hubo buhos aca"));

	System.out.println("DABALE ARROZ A LA ZORRA EL ABAD");
	System.out.println(ejercicio1.palindromo("DABALE ARROZ A LA ZORRA EL ABAD"));

	System.out.println("Allí por la tropa portado, traído a ese paraje de maniobras, "
		+ "una tipa como capitán usar boina me dejara, "
		+ "pese a odiar toda tropa por tal ropilla");
	System.out.println(ejercicio1.palindromo("Allí por la tropa portado, traído a ese paraje de maniobras, una tipa como capitán usar boina me dejara, pese a odiar toda tropa por tal ropilla"));

	System.out.println("Esto no es un palindrome");
	System.out.println(ejercicio1.palindromo("Esto no es un palindrome"));

	System.out.println("Pañoneto otenoñap");
	System.out.println(ejercicio1.palindromo("Pañoneto otenoñap"));

	System.out.println("------------------------------------------------------------------------");
	//Pruebas para isograma
	System.out.println("abc");
	System.out.println(ejercicio1.isograma("abc"));

	System.out.println("abca");
	System.out.println(ejercicio1.isograma("abca"));

	System.out.println("murciélago");
	System.out.println(ejercicio1.isograma("murciélago"));

	System.out.println("patata");
	System.out.println(ejercicio1.isograma("patata"));

	System.out.println("------------------------------------------------------------------------");
	//Pruebas para calendario
	ejercicio1.calendario(5);

	System.out.println("------------------------------------------------------------------------");
	//Pruebas para esEscalera
	char[][] listaPalabras = {
	    {'P', 'A', 'T', 'A'},
	    {'P', 'A', 'T', 'O'},
	    {'R', 'A', 'T', 'O'},
	    {'R', 'A', 'M', 'O'},
	    {'G', 'A', 'M', 'O'},
	    {'G', 'A', 'T', 'O'},
	    {'M', 'A', 'T', 'O'},};
	char[][] listaPalabras2 = {
	    {'P', 'A', 'T', 'A'},
	    {'P', 'O', 'T', 'O'},
	    {'R', 'A', 'T', 'O'},
	    {'R', 'A', 'M', 'O'},
	    {'G', 'A', 'M', 'O'},
	    {'G', 'A', 'T', 'O'},
	    {'M', 'A', 'T', 'O'},};

	System.out.println("Lista Verdadero");
	System.out.println(ejercicio1.escaleraDePalabras(listaPalabras));
	System.out.println("Lista Falso");
	System.out.println(ejercicio1.escaleraDePalabras(listaPalabras2));

	System.out.println("------------------------------------------------------------------------");
	//Pruebas para hazComprobacion
	System.out.println("A-A");
	System.out.println(ejercicio1.hazComprobacion('A', 'A'));
	System.out.println("A-T");
	System.out.println(ejercicio1.hazComprobacion('A', 'T'));
	System.out.println("T-A");
	System.out.println(ejercicio1.hazComprobacion('T', 'A'));
	System.out.println("G-C");
	System.out.println(ejercicio1.hazComprobacion('G', 'C'));
	System.out.println("C-G");
	System.out.println(ejercicio1.hazComprobacion('C', 'G'));
	System.out.println("A-G");
	System.out.println(ejercicio1.hazComprobacion('A', 'G'));
	System.out.println("A-C");
	System.out.println(ejercicio1.hazComprobacion('A', 'C'));
	System.out.println("T-G");
	System.out.println(ejercicio1.hazComprobacion('T', 'G'));
	System.out.println("T-C");
	System.out.println(ejercicio1.hazComprobacion('T', 'C'));
	System.out.println("G-A");
	System.out.println(ejercicio1.hazComprobacion('G', 'A'));
	System.out.println("--A");
	System.out.println(ejercicio1.hazComprobacion('-', 'A'));
	System.out.println("A--");
	System.out.println(ejercicio1.hazComprobacion('A', '-'));

	System.out.println("------------------------------------------------------------------------");
	//Pruebas para ADN
	char[][] cadenaADN1 = {
	    {'A', 'C', 'G', 'T'},
	    {'T', 'G', 'C', 'A'}
	};
	char[][] cadenaADN2 = {
	    {'A', '-', 'C', '-', 'G', '-', 'T', '-', 'A', 'C', 'G', 'T'},
	    {'T', 'T', 'G', 'G', 'C', 'C', 'A', 'A', 'T', 'G', 'C', 'A'}
	};
	char[][] cadenaADN3 = {
	    {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'},
	    {'T', 'T', 'T', 'A', 'T', 'T', 'T', 'T'}
	};
	char[][] cadenaADN4 = {
	    {'G', 'A', 'T', 'T', 'A', 'C', 'A'},
	    {'C', 'T', 'A', 'T', 'T', '-', 'T'}
	};
	char[][] cadenaADN5 = {
	    {'C', 'A', 'T', '-', 'T', 'A', 'G', '-', 'A', 'C', 'T'},
	    {'G', 'T', 'A', 'T', 'A', 'T', 'C', 'C', 'A', 'A', 'A'}
	};
	char[][] cadenaADN6 = {
	    {'-', '-', '-', '-', '-', '-', '-', '-'},
	    {'A', 'C', 'G', 'T', 'A', 'C', 'G', 'T'}
	};
	char[][] cadenaADN7 = {
	    {'T', 'A', 'A', 'T', 'A', 'A'},
	    {'A', 'T', 'T', 'A', 'T', 'T'}
	};
	char[][] cadenaADN8 = {
	    {'G', 'G', 'G', 'A', '-', 'G', 'A', 'A', 'T', 'A', 'T', 'C', 'T', 'G', 'G', 'A', 'C', 'T'},
	    {'C', 'C', 'C', 'T', 'A', 'C', 'T', 'T', 'A', '-', 'A', 'G', 'A', 'C', 'C', 'G', 'G', 'T'}
	};
	char[][] cadenaDesenlazada = {
	    {'T', '-', 'A', 'T', 'A', 'A'},
	    {'A', '-', 'T', 'A', 'T', 'T'}
	};
	char[][] cadenaIguales = {
	    {'T', 'A', 'A', 'T', 'A', 'A'},
	    {'T', 'T', 'T', 'A', 'T', 'T'}
	};

	System.out.println("Cadena 1 - 0");
	System.out.println(ejercicio1.adn(cadenaADN1));
	System.out.println("Cadena 2 - 8");
	System.out.println(ejercicio1.adn(cadenaADN2));
	System.out.println("Cadena 3 - 1");
	System.out.println(ejercicio1.adn(cadenaADN3));
	System.out.println("Cadena 4 - 3");
	System.out.println(ejercicio1.adn(cadenaADN4));
	System.out.println("Cadena 5 - 6");
	System.out.println(ejercicio1.adn(cadenaADN5));
	System.out.println("Cadena 6 - 16");
	System.out.println(ejercicio1.adn(cadenaADN6));
	System.out.println("Cadena 7 - 0");
	System.out.println(ejercicio1.adn(cadenaADN7));
	System.out.println("Cadena 8 - 6");
	System.out.println(ejercicio1.adn(cadenaADN8));
	System.out.println("Cadena Desenlazada - 2");
	System.out.println(ejercicio1.adn(cadenaDesenlazada));
	System.out.println("Cadena Iguales - 1");
	System.out.println(ejercicio1.adn(cadenaIguales));

	System.out.println("------------------------------------------------------------------------");
	//Pruebas para Mudanzas
	boolean[][] camion = {
	    {true, true, true, false, false, false, true, true},
	    {true, true, true, false, false, false, true, true},
	    {true, true, true, false, false, false, true, true},
	    {true, true, true, true, true, true, true, true},
	    {true, true, true, true, true, true, true, true}
	};
	System.out.println(ejercicio1.cabeUnaCaja(camion, 3, 2));
    }

}
