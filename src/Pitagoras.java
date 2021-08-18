import java.util.*;
public class Pitagoras{
	public double calcularH(int catA, int catB){
		double hipotenusa, calculo;
		calculo=((catA*catA)+(catB*catB));
		hipotenusa = Math.sqrt(calculo);
		return hipotenusa;
	}
	public void Calculando(){
		Scanner scr = new Scanner(System.in);//para entrada de datos desde consola 
		double catA , catO ,calculo, hipo; //define variables 
		System.out.println("Ingrese valor de cateto opuesto");
		catO = scr.nextDouble();
		System.out.println("Ingrese valor de cateto adyacente");
		catA = scr.nextDouble();
		scr.close();
		calculo = ((catA*catA)+(catO*catO));
		hipo = Math.sqrt(calculo); // de la librería Math seleccionar método sqrt para expresar la raíz cuadrada
		System.out.println("El valor de la hipotenusa es:"+" "+hipo);
	}
	
}
