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
	    } else {								//Cuando los dias de la semana lleguen a 7, hace un salto de línea
		System.out.println();
		System.out.print("XX ");
		diasSemana = 1;
	    }
	}
	for (int i = 0; i < calendario.length; i++) {				//Ahora imprime los 31 días del mes
	    if (diasSemana < 7) {						//A los 9 primeros les pone un 0 por delante
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
	for (int i = diasSemana; i < 7; i++) {					//Una vez termine, pinta 'XX' hasta que termine la semana
	    System.out.print("XX ");
	}
	System.out.println();
    }
    
    /**
     * Este método irá mirando palabras en una matriz e irá comparándolas. Si cambia
     * una, y solo una de las letras, en cada par, dará verdadero. Si no, dá falso.
     * 
     * @param escalera Entrada de la Matriz de palabras
     * @return Verdadero si es la escalera.
     */
    public boolean escaleraDePalabras(char[][] escalera) {
	boolean esEscalera = true;						//Primero declaramos el boolean que nos dira si es escalera o no y lo inicializamos a True
	int letrasDiferentes;							//Ahora declaramos un int para contar las letras que difieren entre pares de palabras.
	for (int fila = 0; fila < escalera.length - 1; fila++) {		//Ahora recorremos las palabras
	    letrasDiferentes = 0;						//Establecemos las letras diferentes a 0
	    if (escalera[fila].length == escalera[fila + 1].length) {		//Y ahora solo compararemos si la longitud de las palabras es la misma.
		for (int columna = 0; columna < escalera[fila].length; columna++) {
		    if (escalera[fila][columna] != escalera[fila + 1][columna]) {//Si alguna letra difiere, sumara 1 a letrasDiferentes.
			letrasDiferentes++;
		    }
		    if (letrasDiferentes > 1) {					//Si difieren mas de una letra, entonces no es una escalera.
			esEscalera = false;
		    }
		}
	    } else {
		System.out.println("Las palabras tienen distinta longitud");
	    }
	}
	return esEscalera;
    }
    
    /**
     * Este método recorrerá una cadena de ADN y hará un cálculo de los errores que hay en ella
     * siguiendo estas pautas:
     * - Si la 'A' no casa con la 'T' o viceversa: 1 fallo
     * - Si la 'C' no casa con la 'G' o viceversa: 1 fallo
     * - Si cualquiera de las letras casa con un espacio vacío : 2 fallos
     * 
     * @param cadenaADN La matriz que contendrá la 
     * @return Da el número de fallos en la cadena de ADN
     */
    public int adn(char[][] cadenaADN) {
	int fallos = 0;//Inicializamos un int para contar los fallos
	if (cadenaADN[0].length == cadenaADN[1].length) {//Ahora hacemos la comprobacion de la longitud de las cadenas, TIENEN  que ser iguales
	    for (int fila = 0; fila < cadenaADN[0].length; fila++) {//Hacemos el recorrido de las cadenas para ir comprobando los fallos
		fallos += hazComprobacion(cadenaADN[0][fila], cadenaADN[1][fila]);//Ahora llama a otro método para comprobar los fallos que tiene y los suuma al contador de fallos
	    }
	}
	else{//Si la cadena no tiene la misma longitud nos lo dirá por consola.
	    System.out.println("Las cadenas no son válidas");
	}
	return fallos;
    }
    
    /**
     * Este método nos dará los fallos de los pares de la cadena de ADN siguiendo las pautas dadas.
     * Recibirá dos char que comparará y nos dará el número de fallos que debería.
     * 
     * @param nucleotido1 Char de la primera cadena
     * @param nucleotido2 Char de la segunda cadena
     * @return El número de fallos del par  de Char
     */
    public int hazComprobacion(char nucleotido1, char nucleotido2) {
	int numFallo = 0;//Primero inicializa los fallos a 0
	if (nucleotido1 == nucleotido2 && nucleotido1 != '-') {			//Ahora comprueba si los nucleotidos son iguales
	    numFallo++;
	    return numFallo;
	}
	if (nucleotido1 == '-' || nucleotido2 == '-') {				//Aquí comprueba si hay algún par vacío 
	    numFallo = 2;
	    return numFallo;
	}
										//Para el resto de comprobaciones transforma las 'A' en 'T' y las 'G' en 'C' para luego compararlas 
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
	if (nucleotido1 != nucleotido2) {					//Ahora las compara, si no son iguales, suma 1 fallo.
	    numFallo++;
	}
	return numFallo;

    }
    
    /**
     * Este método recibe un camión y una caja, y te dice si cabe la caja en el camión.
     * Este método buscará sitios libres para poner la caja. Una vez encontrados verá si puede 
     * meter la caja. Para ello se apoyará en un método adicional que hará las comprobaciones.
     * 
     * @param camion Es una matriz con las cajas que están en el camión.
     * @param ancho Un int de la anchura de la caja
     * @param alto Un int con la altura de la caja
     * @return Te devuelve si puede meterse o no.
     */
    public boolean cabeUnaCaja(boolean[][] camion, int ancho, int alto) {
	boolean cabe = false;							//Declaro un boolean que nos dirá si cabe o no la caja
	if(camion.length < ancho || camion.length <alto){			//Primero compruebo que la caja no sea mas grande que el camión
	    return false;							//Si lo es devuelvo falso directamente.
	}
	if(camion[0].length < ancho || camion[0].length <alto){
	    return false;
	}
	for (int altoCamion = 0; altoCamion < camion.length; altoCamion++) {	//Ahora voy recorriendo el camión
	    for (int anchoCamion = 0; anchoCamion < camion[0].length; anchoCamion++) {
		if (camion[altoCamion][anchoCamion] == false) {			//Si encuentro un sitio sin cajas, compruebo si me cabe.
		    cabe = cabeCajaAux(camion, anchoCamion, altoCamion, ancho, alto);
		    if (cabe) {							//Si me cabe la caja, devuelvo true y termino el proceso.
			return cabe;
		    }
		}
	    }
	}
	return cabe;
    }

    /**
     * Este metodo comprueba si la caja cabe en las coordenadas dadas.
     * Si no cabe en un sentido, se prueba en el otro. Si no cabe en ninguno de 
     * los dos, pasa a devolver falso.
     * 
     * @param camion Matriz con el camión y las cajas que tiene. 
     * @param posXCamion Pos X donde irá la caja
     * @param posYCamion PosY donde irá la caja
     * @param anchoCaja Ancho de la caja
     * @param altoCaja Alto de la caja
     * @return Devuelve un boolean diciendo si cabe o no.
     */
    public boolean cabeCajaAux(boolean[][] camion, int posXCamion, int posYCamion, int anchoCaja, int altoCaja) {
	boolean cabe = true;//Declaramos el boolean que nos dirá si cabe o no.
	if (posYCamion + altoCaja <= camion.length && posXCamion + anchoCaja <= camion[0].length) {//Ahora comprobamos que la caja no se salga del ca,ion
	    for (int posY = posYCamion; posY < posYCamion + altoCaja; posY++) {//Ahora va recorriendo el hueco
		for (int posX = posXCamion; posX < posXCamion + anchoCaja; posX++) {
		    if (camion[posY][posX]) {//Si encuentra un hueco ocupado, entonces no cabe y pasaremos a girar la caja
			cabe = false;
		    }
		}
	    }
	} else {
	    cabe = false;
	}
	if (!cabe) {//Ahora vamos a dar la vuelta a la caja, y hacemos lo mismo que arriba, pero con la caja girada
	    cabe = true;
	    if (posYCamion + anchoCaja <= camion.length && posXCamion + altoCaja <= camion[0].length) {
		for (int posY = posYCamion; posY < posYCamion + anchoCaja; posY++) {
		    for (int posX = posXCamion; posX < posXCamion + altoCaja; posX++) {
			if (camion[posY][posX]) {
			    cabe = false;
			}
		    }
		}
	    }else {
	    cabe = false;}
	}
	return cabe;
    }
    
    /**
     * Este método comprueba si la segunda palabra está también en la primera. 
     * Si es así, devolverá la posición en la que se encuentra en forma de int, 
     * si no, devuelve -1.
     * 
     * @param str1 Primera palabra
     * @param str2 Segunda palabra
     * @return La posicion de la segunda palabra en la primera o -1 si no está
     */
    public int strStr(String str1, String str2){
	int posicion = 0;							//Primero declaramos un int para guardar la posicion de la palabra
	boolean encontrado = false;						//Ahora declaramos el boolean que nos dirá si está la palabra o no.
//	str1 = str1.toUpperCase();						//Si lo queremos no Key Sensitive solo tenemos que descomentar esto 
//	str2 = str2.toUpperCase();
	if(str1.length() == 0 ||str2.length() == 0){				//Si alguna de las dos palabras se encuentra vacía, retornará el -1
	    posicion = -1;
	    System.out.println("Una de las dos palabras esta vacía, por lo que no hago la comprobacion");
	    return posicion;
	}//Ahora que nos hems quitado la excepción, pasamos a la chicha.
	else if(str1.length()>= str2.length()){//Primero comprobamos que 
	    for(int i = 0; i < str1.length(); i++){
		if(str1.charAt(i)==str2.charAt(0)&&!encontrado){
		    posicion = i;
		    encontrado = buscaString(str1, str2, i);
		    if(!encontrado){
			posicion = -1;
		    }
		}	    
	    }
	}
	else{
	    posicion = -1;
	    System.out.println("La segunda palabra es más grande que la segunda, por lo tanto no puede estar dentro de la primera");
	}
	return posicion;
    }
    
    private boolean buscaString(String str1, String str2, int pos){
	boolean encontrado = true;
	if(pos+ str2.length() <=str1.length()){
	    for(int i = 0; i<str2.length();i++){
	        if(str2.charAt(i)!=str1.charAt(pos+i)){
		    encontrado = false;
	     }
	    }
	}
	else{
	    encontrado = false;
	}
	return encontrado;
    }
    /**
     * codingbat.com
     * Consider the leftmost and righmost appearances of some value in an array.
     * We'll say that the "span" is the number of elements between the two inclusive. 
     * A single value has a span of 1. Returns the largest span found in the 
     * given array. (Efficiency is not a priority.)
     * @param nums Array a comprobar
     * @return El Span Maximo
     */
    private int maxSpan(int[] nums) {
	int maxSpan = 1;
	int contador;
	if(nums.length == 0){
	    return 0;
	}
	for(int i = 0; i <nums.length; i++){
	    contador =0;
	    for(int j = i; j<nums.length; j++){
		contador++;
		if(nums[i] == nums[j]&& maxSpan<contador){
		    maxSpan = contador;
		}
	    }
	}
    return maxSpan;
    }
    
    public int[] fix34(int[] nums) {
	int[] arrayFinal = new int [nums.length];
	int posicionAux;
	boolean encontrado;
	for(int i = 0; i<nums.length; i++){
	    encontrado = false;
	    if(nums[i]==3){
		arrayFinal[i] = nums[i];
		posicionAux = i;
		while (posicionAux+1<nums.length&&!encontrado){
		    if(nums[posicionAux]!=4){
			posicionAux++;
			encontrado = false;
		    }
		    else if(arrayFinal[posicionAux] != 0){
			posicionAux ++;
			encontrado = false;
		    }
		    else{
			encontrado = true;
		    }
		}
		if(nums[posicionAux]!=4){
		    posicionAux = i;
		    while(nums[posicionAux]!=4 &&posicionAux>=0){
			posicionAux--;
			if(posicionAux>0){
			    if(nums[posicionAux-1]==3){
				posicionAux--;
			    }
			}
		    }
		}
		arrayFinal[i+1] = nums[posicionAux];
		arrayFinal[posicionAux]= nums[i+1];
		i++;
	    }
	    else if(nums[i]==4 && arrayFinal[i] == 0){
		arrayFinal[i] = nums[i];
	    }
	    else if(nums[i]!=4){
		arrayFinal[i] = nums[i];
	    }    
	}
	return arrayFinal;
    }
    
   /**
    * Given two arrays of ints sorted in increasing order, outer and inner, 
    * return true if all of the numbers in inner appear in outer. The best 
    * solution makes only a single "linear" pass of both arrays, taking 
    * advantage of the fact that both arrays are already in sorted order.
    * @param outer
    * @param inner
    * @return 
    */
    public boolean linearIn(int[] outer, int[] inner){
	boolean encontrado;
	int contador = 0;
	for(int i = 0; i<inner.length; i++){
	    encontrado = false;
	    for(int j = 0; j<outer.length && !encontrado; j++){
		if(inner[i] == outer[j]){
		    contador++;
		    encontrado = true;
		}
	    }
	}
	return inner.length==contador;
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
	char[][] cadenaDiferentesTamaños = {
	    {'T', 'A', 'A', 'T', 'A', 'A'},
	    {'T', 'T', 'T', 'A', 'T', 'T','A'}
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
	System.out.println("Cadenas Diferentes - 0");
	System.out.println(ejercicio1.adn(cadenaDiferentesTamaños));

	System.out.println("------------------------------------------------------------------------");
	//Pruebas para Mudanzas
	boolean[][] camion = {
	    {true, true, true, false, false, false, false, true},
	    {true, true, true, false, false, false, false, true},
	    {true, true, true, false, false, false, false, true},
	    {true, true, true, false, false, false, false, true},
	    {true, true, true, true, true, true, true, true}
	};
	System.out.println(ejercicio1.cabeUnaCaja(camion, 4, 4));
	
	System.out.println("------------------------------------------------------------------------");
	//Pruebas para StrStr
	System.out.println("patataHolapatta, Hola");
	System.out.println(ejercicio1.strStr("patataHolapatta", "Hola"));
	System.out.println("patataHolapatta, Hoa");
	System.out.println(ejercicio1.strStr("patataHolapatta", "Hoa"));
	System.out.println("patataHolapatta,lksdfskdjfdsjkghdkjgh");
	System.out.println(ejercicio1.strStr("patataHolapatta", "lksdfskdjfdsjkghdkjgh"));
	System.out.println("patataHolapatta, ");
	System.out.println(ejercicio1.strStr("patataHolapatta", ""));
	System.out.println(", Hola");
	System.out.println(ejercicio1.strStr("", "Hola"));
	System.out.println("patataHol, Hola");
	System.out.println(ejercicio1.strStr("patataHol", "Hola"));
	System.out.println("1234, 2345");
	System.out.println(ejercicio1.strStr("1234", "2345"));
	System.out.println("patataHoñapatata, Hoña");
	System.out.println(ejercicio1.strStr("patataHoñapatata", "Hoña"));
	System.out.println("patataHoñapatata, Hona");
	System.out.println(ejercicio1.strStr("patataHoñapatata", "Hona"));
	
	System.out.println("------------------------------------------------------------------------");
	//Pruebas spanMaximo
	int[] nums ={3, 9, 9};
	System.out.println(ejercicio1.maxSpan(nums));
	
	System.out.println("------------------------------------------------------------------------");
	//Pruebas fix34
//	int[] fixed ={1,2,3,1,2,4};
//	System.out.println("1, 2, 3, 1, 2, 4");
//	System.out.println(Arrays.toString(ejercicio1.fix34(fixed)));
//	System.out.println();
//	int[] fixed2 ={1,2,3,1,4,3,2,4};
//	System.out.println("1, 2, 3, 1, 4, 3, 2, 4");
//	System.out.println(Arrays.toString(ejercicio1.fix34(fixed2)));
//	System.out.println();
	int[] fixed3 ={5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5};
	System.out.println("5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5");
	System.out.println(Arrays.toString(ejercicio1.fix34(fixed3)));
	System.out.println();
	
	System.out.println("------------------------------------------------------------------------");
	//Pruebas LinearIn
	int[] linear1 = {-1, 0, 3, 3, 3, 10, 12};
	int[] linear2 = {0, 3, 12, 14};
	System.out.println(ejercicio1.linearIn(linear1, linear2));
	
    }

}
