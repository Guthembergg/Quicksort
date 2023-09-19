package test2;


	public class quick {
	    public static void main(String[] args) {
	        int[] array = {12, 4, 5, 6, 7, 3, 1, 15};
	        
	        System.out.println("Array originale:");
	        for (int numero : array) {
	            System.out.print(numero + " ");
	        }
	        System.out.println();
	        
	        quicksort(array, 0, array.length - 1);
	        
	        System.out.println("Array ordinato:");
	        for (int numero : array) {
	            System.out.print(numero + " ");
	        }
	    }
	    
	    public static void quicksort(int[] array, int basso, int alto) {
	        if (basso < alto) {
	            int pv = partiziona(array, basso, alto);
	            
	            // Ricorsivamente ordiniamo le due sottoparti
	            quicksort(array, basso, pv - 1);
	            quicksort(array, pv + 1, alto);
	        }
	    }
	    
	    public static int partiziona(int[] array, int basso, int alto) {
	        int pv = array[alto];
	        int i = (basso - 1);
	        
	        for (int j = basso; j < alto; j++) {
	            if (array[j] < pv) {
	                i++;
	                
	                // Scambia array[i] e array[j]
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	        
	        // Scambia array[i+1] e array[alto] (o il pivot)
	        int temp = array[i + 1];
	        array[i + 1] = array[alto];
	        array[alto] = temp;
	        
	        return i + 1;
	    }}
