package Telas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Codigo.ArrayXml;
import Codigo.Funcionario;

public class TelaLoginFuncionario extends JFrame implements ActionListener{
	
	JButton botaoCadastrar;
	JButton botaoCancelar;
	JLabel labelNome;
	JLabel labelLogin;
	JTextField textNome;
	JTextField textLogin;
	public TelaLoginFuncionario(){
	tela();
	botoes();
	eventos();
		
		
	}
	public void botoes(){
		botaoCadastrar = new JButton("Cadastrar");
		botaoCancelar = new JButton("Cancelar");
		labelNome = new JLabel("Nome");
		labelLogin = new JLabel("Login");
		textNome = new JTextField(15);
		textLogin = new JTextField(15);
		add(labelNome);
		add(textNome);
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
					
				
			}
			
		}
	});
	botaoCancelar.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == botaoCancelar){
			textNome.setText("");
			textLogin.setText("");
			}
			
		}
	});
	}
	public void actionPerformed(ActionEvent e) {
		
	
	
		
	}
	

}
