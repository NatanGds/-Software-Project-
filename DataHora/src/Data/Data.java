package Data;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = validaDia(dia);
		this.mes = validaMes(mes);
		this.ano = validaAno(ano);
	}
	
	public void incrementaDia() {
		dia++;
	}
	
	public void incrementaMes() {
		mes++;
	}
	
	public void incrementaAno() {
		ano++;
	}
	
	public String mostraData() {
		return String.format("%02d/%02d/%04d", dia,mes,ano);
	}
	
	public int validaDia(int dia) {
		if(dia <= 0 || dia>= 31 ) 
		return 1;
		else return dia;
	}
	
	public int validaMes(int mes) {
		if(mes <= 0 || mes>= 12 ) 
		return 1;
		else return mes;
	}
	
	public int validaAno(int ano) {
		if(ano <= 0) 
		return 1;
		else return ano;
	}
}
