import java.util.Scanner;

public class fecha {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Date calendario = new Date();
		Scanner input = new Scanner(System.in);
		Integer anio, mes, dia, decisor,N;
		
		System.out.println("Ingrese el Anio: ");
		anio = input.nextInt();
		System.out.println("Ingrese el Mes: ");
		mes = input.nextInt();
		System.out.println("Ingrese el Dia: ");
		dia = input.nextInt();

		calendario.setAnio(anio);
		calendario.setMes(mes);
		calendario.setDia(dia);
		calendario.defAnioBiciesto();
		calendario.logica();
		//calendario.aumentar();
		System.out.println("");
		
		
		
		System.out.println("Desea \n1)aumentar un dia\n2)disminuir un dia\n3)Disminuir N dias\n4)Ingrese N dias a sumar\\nOpcion: ");
		decisor = input.nextInt();
		
		switch(decisor) {
		case 1://1)aumentar un dia
			calendario.aumentar();
			calendario.logica();
			calendario.defAnioBiciesto();
			break;
		case 2://2)disminuir un dia
			calendario.disminuir();
			//calendario.logica();
			calendario.logicaInvertida();
			calendario.defAnioBiciesto();
			break;
			
		case 3:
			System.out.println("Ingrese N dias a disminuir:");
			N = input.nextInt();
			for(int i =1 ; i<=N ; i++) {
				calendario.disminuir();
				//calendario.logica();
				calendario.logicaInvertida();
				calendario.defAnioBiciesto();
			}
		break;
		case 4:
			System.out.println("Ingrese N dias a sumar:");
			N = input.nextInt();
			for(int i =1 ; i<=N ; i++) {
				calendario.aumentar();
				calendario.logica();
				calendario.defAnioBiciesto();
			}
			break;
			default:
				System.out.println("Opcion Invalida");
		}
		calendario.defAnioBiciesto();
//		System.out.println(calendario.isBiciesto());
		System.out.println(calendario.toString());
		// calendario.disminuir();

		//System.out.println(calendario.toString());
	}

}
