package Codigo;
import java.util.Date;
import java.text.SimpleDateFormat;


public class ControleDataeHora {
	
	 Date data = new Date();		 
	  SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
	  SimpleDateFormat horaFormatada = new SimpleDateFormat("hh:mm");
	  String dataPronta =  dataFormatada.format(data);		  
	  String horaPronta = horaFormatada.format(data);
	public String getDataPronta() {
		return dataPronta;
	}
	public void setDataPronta(String dataPronta) {
		this.dataPronta = dataPronta;
	}
	public String getHoraPronta() {
		return horaPronta;
	}
	public void setHoraPronta(String horaPronta) {
		this.horaPronta = horaPronta;
	}
}
