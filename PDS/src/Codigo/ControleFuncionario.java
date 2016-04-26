package Codigo;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import ConexaoBancoDados.ConexaoBD;


public class ControleFuncionario {

	public void InserirDadosFuncionario(String login,String senha ){
		
		ConexaoBD conectado = new ConexaoBD();
		conectado.conectar();
		String mensagemErro = "erro";
		try{
			Connection conn = (Connection) conectado.conectar();
			Statement state = (Statement) conn.createStatement();
			String mySql = "INSERT INTO estacionamento.funcionario VALUES('"+senha+"','"+login+"')";
			System.out.println(mySql);
			boolean res = state.execute(mySql);
			JOptionPane.showMessageDialog(null,(!res)?"dados inseridos com sucesso!!!":"");
			state.close();
			conectado.fecharBancoDados();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		
	}
}
