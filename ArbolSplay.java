

/**
 * Integrantes: Rodrigo Castro #14092
 * Hugo Noriega #14097
 * Se realiza la implemnetacion del Red Black Tree con la implementacion del WORDSET
 * 
 * Consultado en el capitulo 14.5 Splay Tree del Libro JAVA Strucutre
 * 
 * Codigo de referencia en el capitulo 14.5 de Java Strucutre
 */



// Se implementa el arbol con el comparable
public class ArbolSplay<E extends Comparable>
	{

	// Primero se declara  el Nodo con nulo y se guarda en un empty para poder hacer referenica a este despues
	  private NodoSplayTree<E> empty = new NodoSplayTree<E>( null );
	  
	  
	// Se encunetra la raiz para por medio de la ruta de la palabra
	  
	  
    private NodoSplayTree<E> ruta ;
  
 // Se genera el consutructor
    // La ruta al inicio debe ser nulo, ya que no se ha localizado nada
    
    
    
  public ArbolSplay( )
	    {
	  
	  	// NodoInicial = nulo 
	  
	    	ruta = empty;
	    }

	    
	   

	   


	    
	    
	    


	   // Reordenacion Arbol, referencia al codigo planteado en el capitulo 14.5 de Java Structure
	    private NodoSplayTree<E> splay( E val, NodoSplayTree<E> arbol )
	    {
	    	// Se crean arboles temporales que luego forman el nuevo
	    	NodoSplayTree<E> izquierda, derecha, cabeza;
	        cabeza  = new NodoSplayTree<E>( null );
	        cabeza.setLeft(empty);
	        cabeza.setRight(empty);
	        izquierda = cabeza;
	        derecha = cabeza;
	        empty.setValue(val);   

	        // Ciclo que termina cuando el arbol termina de reordenarse, cuando el valor que se quiere esta en la raiz.
	        // El arbol analizado cambia con cada hiro.
	        while(true)
	        {
	            int compareResult = val.compareTo( arbol.getValue() );   
	            if( compareResult < 0 )
	            {
	                if( val.compareTo( arbol.getLeft().getValue() ) < 0 )
	                	arbol = Left( arbol ); // giro a la izquierda
	                if( arbol.getLeft() == empty ) 
	                    break;
	                
	                derecha.setLeft(arbol);
	                derecha = arbol;
	                arbol = arbol.getLeft();
	            }
	            else if( compareResult > 0 )
	            {
	                if( val.compareTo( arbol.getRight().getValue() ) > 0 )
	                	arbol = Right( arbol );
	                if( arbol.getRight() == empty )
	                    break;
	               
	                izquierda.setRight(arbol);
	                izquierda = arbol;
	                arbol = arbol.getRight();
	            }
	            else
	                break;
	        }    

	        // Se rearma el arbol con los arboles temporales.
	        izquierda.setRight(arbol.getLeft());
	        derecha.setLeft(arbol.getRight());
	        arbol.setLeft(cabeza.getRight());
	        arbol.setRight(cabeza.getLeft());
	        return arbol;
	    }
	    
	    
	    // En este metodo se simula cunado se mete un nodo al arbol, dependiendo del valor ingresado o leido
	    public void put( E val )
	    {
	    	
	    	// Se crea un nuevo nodo que tiene el valor a ingresar.
	    	NodoSplayTree<E> nuevoNodo = new NodoSplayTree<E>(val);
            nuevoNodo.setLeft(empty); 
    		nuevoNodo.setRight(empty);

    		// Si la raiz esta vacia
            if( ruta == empty )
            {
            	ruta = nuevoNodo; // Ese nodo se vuelve la raiz
            	 
            }
	        else
	        {
	        	
	            
	            
	            int compareResult = val.compareTo( ruta.getValue() );
	            
	            if( compareResult < 0 )
	            {
	            	// Se mueve la raiz a la derecha del nuevo nodo, y la izquierda de la raiz a la izquierda del nodo
	                nuevoNodo.setLeft(ruta.getLeft());
	                nuevoNodo.setRight(ruta);
	                ruta.setLeft(empty);
	                ruta = nuevoNodo;
	                
	                ruta = splay( val, ruta );
	            }
	            else
	            if( compareResult > 0 )
	            {
	            	// Se mueve la raiz a la izquierda del nuevo nodo, y la derecha de la raiz a la derecha del nodo
	                nuevoNodo.setRight(ruta.getRight());
	                nuevoNodo.setLeft(ruta);
	                ruta.setRight(empty);
	                ruta = nuevoNodo;
	                ruta = splay( val, ruta );
	            }
	            else
	                return;   
	        }
	    }

	   
	    
	    // Cuando encuentra el parametro
	    // se retorna un left, es decir 
	    
	   // el arbol se voltea hacia la izquierda
	    public NodoSplayTree<E> Left( NodoSplayTree<E> arbol )
	    
	    
	    
	    {
	    	NodoSplayTree<E> nuevoSplay = arbol.getLeft();
	        arbol.setLeft(nuevoSplay.getRight());
	        nuevoSplay.setRight(arbol);
	        return nuevoSplay;
	    }

	    
	    // Metodo que hace que un arbol gire hacia la derecha, y se devuelve un nuevo arbol
	    public NodoSplayTree<E> Right( NodoSplayTree<E> arbol )
	    {
	    	NodoSplayTree<E> nuevoSplay = arbol.getRight();
	    	
	    	
	    	
	    	
	    	
	        arbol.setRight(nuevoSplay.getLeft());
	        
	        
	        
	        nuevoSplay.setLeft(arbol);
	        return nuevoSplay;
	    }

	    
		
		
	  // Autogenretad
		public NodoSplayTree<E> getRoot() {
			return ruta;
		}

		public void setRoot(NodoSplayTree<E> ruta) {
			this.ruta = ruta;
		}
		

		// Se revisa si el valor esta contenido en el arobl
			    public boolean ContieneElNodo( E valor)
			    {
			    	
			    	// Primero retorno falsa si esta vacio
			    	
			    	
			        if( ruta == empty)
			        	
			        	
			        	
			        	
			            return false;
			        
			       // Luego mediante la ruta, busca por la implementacion del Splay el valor de la ruta 
			        ruta = splay( valor, ruta );
			        
			        return ruta.getValue().compareTo(valor) == 0;
			    }

		
	    
	    
	}
	
