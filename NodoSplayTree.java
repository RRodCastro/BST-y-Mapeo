
/**
 * Integrantes: Rodrigo Castro #14092
 * Hugo Noriega #14097
 * Se realiza la implemnetacion del Red Black Tree con la implementacion del WORDSET
 * 
 * Consultado en el capitulo 14.5 Splay Tree del Libro JAVA Strucutre
 * 
 * Clase generica de un Nodo normal, con la variante de la nueva implmenetacion para 
 * El splay Tree
 */


public class NodoSplayTree<E extends Comparable> {
	   // Parametros
	   private E value;            // valor
	   private NodoSplayTree<E> left;   // hijo izquierdo
	   private NodoSplayTree<E> right;  // hijo derecho

	   
	   // Construcctor, Setters y Getters.
        public NodoSplayTree( E val)
        {
            value  = val;
        }

		public E getValue() {
			return value;
		}

		public void setValue(E value) {
			this.value = value;
		}

		public NodoSplayTree<E> getLeft() {
			return left;
		}

		public void setLeft(NodoSplayTree<E> left) {
			this.left = left;
		}

		public NodoSplayTree<E> getRight() {
			return right;
		}

		public void setRight(NodoSplayTree<E> right) {
			this.right = right;
		}
	
}
