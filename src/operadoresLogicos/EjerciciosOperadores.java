package operadoresLogicos;

public class EjerciciosOperadores {

	public static void main(String[] args) {
		/*&& operador And  devuelve true si ambas expresiones son verdaderas 
		 || operador or devuelve true si almenos una de las dos condiciones se cumple
		 ! operador not si la expresion booleana es flase devuelve true y viceversa */

		
		//&& and
		
		int anios = 5;
		
		boolean esInfante = true; 
		
		boolean costoInfante = anios <= 12 && esInfante;
		
		System.out.println("¿Es peque?: " + costoInfante);
		
		String cliente = "Cliente123";
		String credenciales = "fortakisfuego123";
		
		boolean credencialCorrecta = cliente.equals("cliente123")|| credenciales.equals("fortakisfuego123");
		
		System.out.println("Las creden sí son válidas " + credencialCorrecta);
		
		
		//|| or
		
		double costoPasaje = 380.50;
		boolean credenInapam = false;
		int edad =58;
		
		boolean descuentoAdultoMayor = edad >= 60 || credenInapam;
		
		System.out.println("¿Tiene descuento?: $"+ costoPasaje);
		
		
		//! not
		
		boolean avionDespega = true;
		boolean asientosConDescuento = !avionDespega;
		
		System.out.println("Tenemos asientos con descuento?: " + asientosConDescuento);
		
		
			int costoBoleto=350;
			int capacidadTotal= 62; //asientos
			int asignadosAncianos=4; //destinados a adultxs mayores
			int asignadosEstudiantes=6; //a estudiantes
			//descuento a inapam es de 35%
 			//a estudiantes 30%
 			 //* 
			
			
			
 			double maxCompra = ((asignadosAncianos*(costoBoleto*0.65))+(asignadosEstudiantes*(costoBoleto*0.70)+((capacidadTotal-asignadosAncianos)-asignadosEstudiantes)*costoBoleto));
 			System.out.println("La venta total de un autobus con 4 Ancianos y 6 estudiantes es: $"+ maxCompra);
 					
 				
		
		
	}

}
