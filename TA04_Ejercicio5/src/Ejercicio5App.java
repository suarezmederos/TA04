
public class Ejercicio5App {

	public static void main(String[] args) {
		
		int A=1;
		int B=2;
		int C=3;
		int D=4;
		
		B=C;
		C=A;
		A=D;
		D=B;
		System.out.println("El valor de B al tomar el de C  es ="+B);
		System.out.println("El valor de C al tomar el de A  es ="+C);
		System.out.println("El valor de A al tomar el de D  es ="+A);
		System.out.println("El valor de D al tomar el de B  es ="+B);
	}

}
