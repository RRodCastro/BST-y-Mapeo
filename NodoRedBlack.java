/**
 * Integrantes: Rodrigo Castro #14092
 * Hugo Noriega #14097
 * Se realiza la implemnetacion del Red Black Tree con la implementacion del WORDSET
 * 
 * Consultado en el capitulo 14.7 Red Black Tree del Libro JAVA Strucutre
 */


public class NodoRedBlack<E  extends Comparable<E>> {
        private E val;         
        private NodoRedBlack left, right; 
        private int color;     
        
        
        public NodoRedBlack(E val, int color) {
            this.val = val;
            this.color = color;
            
        }
        
    	public NodoRedBlack getLeft() {
			return left;
		}
    	
    	public NodoRedBlack getRight() {
			return right;
		}


		public void setRight(NodoRedBlack right) {
			this.right = right;
		}


		public int getColor() {
			return color;
		}


		public void setColor(int color) {
			this.color = color;
		}


		public void setLeft(NodoRedBlack left) {
			this.left = left;
		}


		public E getVal() {
			return val;
		}


		public void setVal(E val) {
			this.val = val;
		}


	


	
    }
