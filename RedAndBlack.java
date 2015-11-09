


/**
 * Integrantes: Rodrigo Castro #14092
 * Hugo Noriega #14097
 * Se realiza la implemnetacion del Red Black Tree con la implementacion del WORDSET
 * 
 * Consultado en el capitulo 14.7 Red Black Tree del Libro JAVA Strucutre
 */

// Se utiliza la implementacion del WordSet subido a blackboard que viene siendo la interfaz para la implementaacion de palabras
public class RedAndBlack implements WordSet {

	
	// Se crea un nuevoArbol, con la instancia de una palabra la cual viene siendo la lectura de archivo
	private ArbolRedBlack<Word> nuevoArbol;
	
	
	// Constructor del RedAndBlack, con la instancia de palabra
	// se utilizara para ver si contiene la palabra
	
	public RedAndBlack()
	{
		nuevoArbol = new ArbolRedBlack<Word>();
	}
	
	
	
	public Word get(Word palabra) {
		
		// Se crear una variable que devuelve 1 o 0 para ver si la palabra se encuentra
		boolean seEncontro = nuevoArbol.contains(palabra);
		
		
		if (!seEncontro) {
			return null;
			
			
			
			
		}
		else {
			
			
			
			
			return nuevoArbol.get(palabra);
		}
		
	}
	
	
	public void add(Word wordObject) {
		
		
		boolean seEncontro = nuevoArbol.contains(wordObject);
		
		// Cuando se encunetra se utiliza el nuevo arbol para insertar palabra por medio de implementacion de RedBlackTree
		if(seEncontro) return;
		nuevoArbol.put( wordObject);
		
	}


}
