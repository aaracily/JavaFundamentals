import java.util.Scanner;
public class Ej6 {
/*6) Crea una aplicaci�n que nos pida un d�a de la semana y que nos diga si es un dia 
laboral o no. Usa un switch para ello.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		String dia;
		System.out.println("Ingrese un d�a de la semana");
		dia= src.nextLine();
		src.close();
		
		switch (dia){
		 case "domingo":
		 case "s�bado":
			 System.out.println("Disfruta, es d�a de descanso");
			 break;
		 case "viernes":
		 case "jueves":
		 case "miercoles":
		 case "martes":
		 case "lunes":
			 System.out.println("Disfruta, es d�a laboral");
		 
		 break;
		 default: System.out.println("Ops,Algo fall�!Ingrese un d�a de la semana");
		 break;
		 
		}
	}

}
