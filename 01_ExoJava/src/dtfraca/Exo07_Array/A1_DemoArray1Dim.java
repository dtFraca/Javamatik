package dtfraca.Exo07_Array;

public class A1_DemoArray1Dim {

	/**
	 * Demo Array a UNE dimension myArray[x]
	 * 1. L'index du premier element est tjs 0
	 * 2. Un array ne peut contenir que les donnees de MEME datatype
	 * 2013-02-04 - Tri
	 */
	public static void main(String[] args) {
		//----------------------------------------
		// 1: Array dont les éléments sont initialise during runtime 
		//----------------------------------------
		//System.out.println("DEMO #1");
		String[] aAddr = new String[4]; //un array de 4 éléments
		aAddr[0] = "765 rue de la Perpète";
		aAddr[1] = "48750"; //ATTN, la valeur ressemble a un nombre mais en fait c'est un string (on ne peut pas faire de Maths sur cette valeur)
		aAddr[2] = "St Paumé de Provence";
		aAddr[3] = "FRANCE";
		
		System.out.printf( "Index\t\tValeur\n" ); 
		for (int kk = 0; kk < aAddr.length; kk++) {
			System.out.printf("aAddr[%2d] =\t%s\n", kk, aAddr[kk]);
		}
		
		//----------------------------------------
		// 2: Array initialise directement au moment de la declaration
		//----------------------------------------
		//System.out.println("DEMO #2");
		int[] aNombres = { 32, 651, 8, -195, 1446, 90, 654, -5 };

		System.out.println();
		System.out.printf( "Index\t\tValeur\n" ); 

		int iTotal = 0;
		for (int kk = 0; kk < aNombres.length; kk++) {
			System.out.printf("aNombre[%2d] =\t%6d\n", kk, aNombres[kk]);
			
			//calculer la somme totale
			iTotal += aNombres[kk] ; // iTotal = iTotal + aNombre[kk]
		}
		System.out.printf("TOTAL =\t\t\t%6d <- TOTAL\n", iTotal);
		
		
		//----------------------------------------
		// Demo class java.util.Arrays 
		//----------------------------------------
		
		//Copy array: aCopyNombres[] sera identique que aNombres[]
		int[] aCopyNombres = new int[ aNombres.length ];
		System.arraycopy(aNombres, 0, aCopyNombres, 0, aNombres.length );
		
		// Trier les elements par valeurs croissant
		java.util.Arrays.sort(aCopyNombres);
		
		System.out.println();
		for (int kk = 0; kk < aCopyNombres.length; kk++) {
			System.out.printf("aCopyNombres[%2d] =\t%6d\n", kk, aCopyNombres[kk]);		
		}	
		
	}

}
