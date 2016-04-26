package Codigo;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import ConexaoBancoDados.ConexaoBD;
	
	
	public class ControleCarro {
		
		public void InserirDadosCarro(String modelo,String placa,double horaEntrada,double horaSaida,double valorPagar ){
					
			ConexaoBD conectado = new ConexaoBD();
			String mensagemErro = "erro";
			try{
				Connection conn = (Connection) conectado.conectar();
				Statement state = (Statement) conn.createStatement();
				String mySql = "INSERT INTO estacionamento.veiculo VALUES('"+modelo+"','"+placa+"','"+horaEntrada+"','"+horaSaida+"','"+valorPagar+"')";
				boolean res = state.execute(mySql);
				JOptionPane.showMessageDialog(null,(!res)?"dados inseridos com sucesso!!!":"");
				state.close();
				conectado.fecharBancoDados();
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
			
		}
	}

	
	



