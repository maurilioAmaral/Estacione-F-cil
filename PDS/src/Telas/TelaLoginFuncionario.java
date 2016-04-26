package Telas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Codigo.ControleFuncionario;
import ConexaoBancoDados.ConexaoBD;



public class TelaLoginFuncionario extends JFrame implements ActionListener{
	ControleFuncionario func = new ControleFuncionario();
	ConexaoBD conect = new ConexaoBD();
	
	JButton botaoCadastrar;
	JButton botaoCancelar;
	JLabel labelSenha;
	JLabel labelLogin;
	JTextField textSenha;
	JTextField textLogin;
	public TelaLoginFuncionario(){
	tela();
	botoes();
	eventos();
	conect.conectar();
		
		
	}
	public void botoes(){
		botaoCadastrar = new JButton("Cadastrar");
		botaoCancelar = new JButton("Cancelar");
		labelSenha = new JLabel("Nome");
		labelLogin = new JLabel("Login");
		textSenha = new JTextField(15);
		textLogin = new JTextField(15);
		add(labelSenha);
		add(textSenha);
		add(labelLogin);		
		add(textLogin);
		add(botaoCancelar);			
		add(botaoCadastrar);
	}
	public void tela(){
		setSize(350,150);
		setVisible(true);
		setLayout(new GridLayout(3,2));
		setLocationRelativeTo(null);
	}
	
	public void eventos(){
	botaoCadastrar.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == botaoCadastrar){
					String login = textLogin.getText();
					String senha  = textSenha.getText();
				func.InserirDadosFuncionario(login, senha);
			}
			
		}
	});
	botaoCancelar.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == botaoCancelar){
			textSenha.setText("");
			textLogin.setText("");
			}
			
		}
	});
	}
	public void actionPerformed(ActionEvent e) {
		
	
	
		
	}
	public static void main(String[] args) {
		new TelaLoginFuncionario();
	}
	

}
