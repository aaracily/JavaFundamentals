import java.util.Scanner;
public class Ej7 {
/*7) Pide por teclado dos n�mero y genera 10 n�meros aleatorios entre esos n�meros. 
Usa el m�todo Math.random para generar un n�mero entero aleatorio (recuerda el casting de double a int).*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instancia de la clase scanner que recibe informaci�n que el usuario ingresa
		Scanner scn= new Scanner(System.in);
		//funci�n que imprime en consola
		System.out.println("Introduzca dos n�meros : ");
		int num1;//declara variable
		int num2;
		num1 = scn.nextInt();//variable que almacena los datos ingresados por usuario
		num2 = scn.nextInt();
		scn.close();
		for (int i=0; i<10; i++){
			int numRand = (int)(Math.random()*(num1-num2)+num2);//formula que calcula numero aleatorio con casting 
		    System.out.println(numRand);
		}
	    
		
	}

}
