import java.util.Scanner;
public class Ej4 {
/*4) Lee un número por teclado e indica si es divisible 
 * entre 2 (resto = 0). Si no lo es, también debemos indicarlo.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner scr = new Scanner(System.in);
		System.out.println("Ingrese un número");
		numero = scr.nextInt();
		
		if(numero%2==0){
			System.out.println("El número"+" "+numero+" " +"es divisible entre 2");
		}
		else{
			System.out.println("El número"+" "+numero+" " +"no es divisible entre 2");
		}
		scr.close();
	}

}
