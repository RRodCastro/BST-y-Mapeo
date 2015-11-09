/*
 * /* Programa , obtenido de blackboard, el cual fue subido como referencia
 * Integrantes: Rodrigo Castro #14092
 * Integrantes: Hugo Noriega #14097 
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 7
Autor: Eduardo Castellanos

Descripción: SimpleSet ejemplo con ArrayList.
*/
import java.util.ArrayList;

class SimpleSet implements WordSet
{
	private ArrayList<Word> base;
	
	public SimpleSet()
	{
		base = new ArrayList<Word>();
	}
	
	public Word get(Word word)
	{ 
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}
