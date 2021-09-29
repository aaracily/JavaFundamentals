import java.util.Scanner;
public class Ej6 {
/*6) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia 
laboral o no. Usa un switch para ello.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		String dia;
		System.out.println("Ingrese un día de la semana");
		dia= src.nextLine();
		src.close();
		
		switch (dia){
		 case "domingo":
		 case "sábado":
			 System.out.println("Disfruta, es día de descanso");
			 break;
		 case "viernes":
		 case "jueves":
		 case "miercoles":
		 case "martes":
		 case "lunes":
			 System.out.println("Disfruta, es día laboral");
		 
		 break;
		 default: System.out.println("Ops,Algo falló!Ingrese un día de la semana");
		 break;
		 
		}
	}

}
