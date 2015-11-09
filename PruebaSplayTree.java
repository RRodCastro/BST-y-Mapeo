/**
 * Integrantes: Rodrigo Castro #14092
 * Hugo Noriega #14097

 * 
 
 */


import static org.junit.Assert.*;

import org.junit.Test;


public class PruebaSplayTree {

	@Test
	public void testAdd() {
		Splay obj = new Splay();
		
		Word palabra = new Word("Caminar","Verbo" );
		obj.add(palabra);
		
          if(!obj.get(palabra).equals(palabra)){
			
			fail("Error");
		} 

	}

	
	public void testGet() {
	Splay obj = new Splay();
		
		Word palabra = new Word("Caminar","Verbo" );
		obj.add(palabra);
		
          try{
        	  palabra = (Word) obj.get(palabra);
		} 
          catch (ClassCastException e){
        	  fail ("Error");
          }
	}

}
