package dataHora;

public class Hora {
	private byte hora;
	private byte minuto;
	
	public Hora(byte hora, byte minuto) {
		this.hora = validaHora(hora);
		this.minuto = validaMinuto(minuto);
	}
	
	public Hora() {
		hora = 0;
		minuto = 0;
	}
	
	public void incrementaHora() {
		hora++;
	}
	
	public void incrementaMinuto() {
		minuto++;
	}
	
	public String mostraHora() {
		return String.format("%02d:%02d", hora,minuto);
	}

	public byte validaHora(byte hora) {
		if(hora <= 0 || hora>=24) return 1;
		else return hora;
	}
	
	public byte validaMinuto(byte minuto) {
		if(minuto <= 0 || minuto>=60) return 1;
		else return minuto;
	}
}