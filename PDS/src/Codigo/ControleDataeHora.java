package Codigo;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Hora {
	  public static void main(String[] args) {
		  Date data = new Date();		 
		  SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		  SimpleDateFormat horaFormatada = new SimpleDateFormat("hh:mm");
		  String dataPronta =  dataFormatada.format(data);		  
		  String horaPronta = horaFormatada.format(data);
		  System.out.println("data "+dataPronta);
		  System.out.println("hora "+horaPronta);
		  
	}

}
