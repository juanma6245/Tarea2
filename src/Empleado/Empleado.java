package Empleado;


public class Empleado {
	
	static enum TipoEmpleado {VENDEDOR, ENCARGADO}
	
	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float HorasExtra) {
		float base = 0;
		if (tipo == TipoEmpleado.VENDEDOR) {
			base = 2000;
		} else if(tipo == TipoEmpleado.ENCARGADO) {
			base = 2500;
		}
		if (ventasMes >= 1000 && ventasMes < 1500) {
			base += 100;
	 	} else if(ventasMes >= 1500) {
	 		base += 200;
	 	}
		if (HorasExtra > 0) {
			base += HorasExtra*30;
		}
		
		return base;
	}
	
	public static float calculoNominaNeta(float nominaBruta) {
		float retencion = 0;
		if(nominaBruta >= 2100 && nominaBruta < 2500) {
			retencion = 0.15f;
		} else if (nominaBruta >= 2500) {
			retencion = 0.18f;
		}
		
		float response = nominaBruta * (1-retencion);
		
		return response;
	}
}
