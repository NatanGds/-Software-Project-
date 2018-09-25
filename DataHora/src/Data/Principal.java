package Data;

import dataHora.Hora;

public class Principal {

	public static void main(String[] args) {
		Hora hora = new Hora((byte)4,(byte)20);
		Hora horaZero = new Hora();
		hora.incrementaHora();
		hora.incrementaMinuto();
		
		System.out.println(hora.mostraHora());
		System.out.println(horaZero.mostraHora());
		
		
		Data data = new Data(0,0,0);
		System.out.println(data.mostraData());
	}
}