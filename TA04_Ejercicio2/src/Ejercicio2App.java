
public class Ejercicio2App {

	public static void main(String[] args) {
		
		int N = 7;
		double A = 4.2;
		char C = 'c';
		
		double suma = N+A;
		double resta = A-N;
		int valorNumericoC = Character.getNumericValue(C);
		
		System.out.println("El valor de la variable N="+N);
		System.out.println("El valor de la variable A="+A);
		System.out.println("El valor de la variable C="+C);
		System.out.println("El valor de la suma de N y A es ="+suma);
		System.out.println("El valor de la diferencia de A y N es ="+resta);
		System.out.println("El valor numerico del caracter c es ="+valorNumericoC);
		
	}

}
