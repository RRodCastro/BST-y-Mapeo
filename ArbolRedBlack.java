

/**
 * Integrantes: Rodrigo Castro #14092
 * Hugo Noriega #14097
 * Se realiza la implemnetacion del Red Black Tree con la implementacion del WORDSET
 * 
 * Consultado en el capitulo 14.7 Red Black Tree del Libro JAVA Strucutre
 */

// SE implementa el comparable de objeto E (parametro el cual servira para poder comparar las palabras/


public class ArbolRedBlack<E extends Comparable<E>> {
	
	
	// Se crear un atributo del tipo Nodo del Arbol RedBlack
    private NodoRedBlack rutaNodo;    

    
    
    
    
    
    
    private NodoRedBlack Tree 
    
    
    (NodoRedBlack nuevoNodo, E valor) { 
  
    	// Cuando se encuentra un nulo en el arbol
    	
        if (nuevoNodo == null) 
        	
        	
        	
        	
        	return 
        			
        
     
        			
       // Se envia el parametro 1 para que se genere
        // un nuevo arbol rojo 
        new NodoRedBlack(valor, 1);

        
        // Se toma el valor y se guarda en el comparador, luego
        // Se compara ese valor para ver donde se insertar el nuevo nodo
        // Puede ser a la derecha o a la izq
        // Depende del valor del compardor
        
        int comparador = valor.compareTo((E) nuevoNodo.getVal());
        
        // Se insetar el nodo hacia la izquierda cuando es menor a cero
        if  (comparador < 0) 
        	// Se utiliza la implementacion de la clase NodoRed Black
        	
        	
        	nuevoNodo.setLeft(Tree(nuevoNodo.getLeft(), valor));
        else if (comparador > 0) 
        	nuevoNodo.setRight(Tree(nuevoNodo.getRight(), valor)) ; 
        else             
        	nuevoNodo.setVal(valor); 
        
        
  
        if((nuevoNodo.getRight() !=null) && (nuevoNodo.getLeft()!=null))       
        	if ((nuevoNodo.getRight().getColor()==1) && (nuevoNodo.getLeft().getColor()==0))     
        		nuevoNodo = girarIzquierda(nuevoNodo);
	     
        if((nuevoNodo.getLeft()!=null) && nuevoNodo.getLeft().getLeft() !=null)   
	        if ((nuevoNodo.getLeft().getColor()==1)  &&  (nuevoNodo.getLeft().getLeft().getColor()==1))  
	        	nuevoNodo = girarDerecha(nuevoNodo);
        
        if((nuevoNodo.getRight() !=null) && (nuevoNodo.getLeft()!=null))  
	        if ((nuevoNodo.getLeft().getColor()==1)  &&  (nuevoNodo.getRight().getColor()==1))     
	        	Change(nuevoNodo);
        
     

        return nuevoNodo; 
    }   
    
    private void Change(NodoRedBlack nodo) {
    	if (nodo.getColor()==0)
    		nodo.setColor(1);
    	else
    		nodo.setColor(0);
    	
    	if (nodo.getLeft().getColor()==0)
    		nodo.getLeft().setColor(1);
    	else
    		nodo.getLeft().setColor(0);
    	
    	if (nodo.getRight().getColor()==0)
    		nodo.getRight().setColor(1);
    	else
    		nodo.getRight().setColor(0);
        
    }


   
   
   

 

   // Funcion que devuelve si un valor esta en el arbol
    public boolean contains(E val) {
    	if (get(val) == null) // Se llama a la funcion get, la cual devuelve null si no lo encontro.
    		return false;
        return true;
    }

 // Metodo que ingresa un nuevo valor
  

    


  
   

    // MEtodo que gira a la derecha un arbol, y devuelve el nuevo arbol
    private NodoRedBlack girarDerecha(NodoRedBlack nodo) {
    	NodoRedBlack nuevo = nodo.getLeft();
    	nodo.setLeft(nuevo.getRight());
    	nuevo.setRight(nodo);
    	nuevo.setColor(nuevo.getRight().getColor());
    	nuevo.getRight().setColor(1);
        return nuevo;
    }


    // MEtodo que gira a la izquierda un arbol, y devuelve el nuevo arbol
    private NodoRedBlack girarIzquierda(NodoRedBlack nodo){ 
    	NodoRedBlack nuevo = nodo.getRight();
    	nodo.setRight(nuevo.getLeft());
        nuevo.setLeft(nodo);
        nuevo.setColor(nuevo.getLeft().getColor());
        nuevo.getLeft().setColor(1);
        return nuevo;
    }
    
    
    public E get( E val) {
    	NodoRedBlack NodoARevisar = rutaNodo;
     
    	// Este ciclo revisa las posiciones del arbol, hasta que recorre las ramas donde podria estar el valor buscado.
    	while (NodoARevisar != null) {
    		
    		// Dependiendo de la comparacion, se va a la izquierda o derecha
            int comparacion = val.compareTo((E) NodoARevisar.getVal());
            
            if (comparacion < 0) 
            	NodoARevisar = NodoARevisar.getLeft(); // Se pone como nodo a revisar, al hijo izquierdo
            else if (comparacion > 0) 
            	NodoARevisar = NodoARevisar.getRight(); // Se pone como nodo a revisar, al hijo izquierdo
            else              
            	return (E) NodoARevisar.getVal(); // Cuando la comparacion es 0, se devuelve el valo encontrado.
        }
        return null;
    }

    // Metodo que cambia los colores de un nodo y de sus hijos.
 
    
    public void put(E val) {
    	// Se llama a una funcion que mete el valor, y balancea el arbol.
    	rutaNodo = Tree(rutaNodo, val);
    	rutaNodo.setColor(1);
    }
    
}
