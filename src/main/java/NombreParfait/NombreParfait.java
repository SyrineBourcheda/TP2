package NombreParfait;

public class NombreParfait {
	/**
	 * verifier si un nombre est parfait ou non 
	 * @param n le nombre à vérifier 
	 * @return vrai si le nombre est parfait
	 * 		   faux sinon
	 */
	public static boolean nombreParfaitVerif(int n) {
		int somme=0;
		for (int i=1;i<n;i++) {
			if (n%i==0) {
				somme+=i;
			}
		}
		if (somme == n)
			return true;
		else 
			return false;
				
	}


}
