package Triangle;

public class Triangle {

	/**
	 * Vérifie si les longueurs a, b et c correspondent à un triangle valide.
	 * 
	 * @param a La longueur du premier côté du triangle.
	 * @param b La longueur du deuxième côté du triangle.
	 * @param c La longueur du troisième côté du triangle.
	 * @return 0 si le triangle est invalide, 
	 * 		   1 si le triangle est équilatéral, 
	 * 		   2 si le triangle est isocèle et 
	 * 		   3 si le triangle est valide quelconque.
	 */
	public static int triangle(double a, double b, double c) {
		//Triangle Invalide
		if (a<=0 || b<=0 || c<=0 || a+b<=c || a+c<=b || b+c<=a)
			return 0;
		//Triangle equilateral
		if (a==b && b==c)
			return 1;
		//Triangle isocele
		if (a==b || b==c || a==c)
			return 2;
		//Triangle quelconque"
		else 
			return 3;
		
				
	}

}
