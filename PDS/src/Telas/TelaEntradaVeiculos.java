package Telas;


import java.awt.Component;
import java.awt.Event;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Codigo.ControleCarro;
import Codigo.ControleDataeHora;
import ConexaoBancoDados.ConexaoBD;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class TelaEntradaVeiculos extends JFrame implements ActionListener{
	ControleDataeHora controleData = new ControleDataeHora();
	ConexaoBD conexao = new ConexaoBD();
	ControleCarro carroControl = new ControleCarro();
	
	JLabel labelModelo;
	JTextField textModelo;
	JLabel labelPlaca;
	JTextField textPlaca;
	JLabel labelHoraEntrada;
	JTextField textHodaEntrada;
	JLabel labelHoraSaida;
	JLabel labelValorPagar;		
	JTextField textHodaSaida;
	JTextField textValor;
	JLabel labelData;
	JTextField textData;
	JButton botaocadastrar;	
	JButton botaosair;
	
	public TelaEntradaVeiculos(){
		
		ajusteTela();
		botoes();
		eventos();
		conexao.conectar();
		
	}
	public void ajusteTela(){
		
		setSize(500,300);
		setVisible(true);
		setResizable(false);		
		setLayout(new GridLayout(7,2));
		setTitle("Cadastro de veiculos");
		setLocationRelativeTo(null);
				
	}
	public void botoes(){
		
		labelModelo = new JLabel("Modelo");
		textModelo = new JTextField(12);
		labelPlaca = new JLabel("Placa");
		textPlaca = new JTextField(12);	
		textHodaEntrada = new JTextField(12);
		labelHoraEntrada = new JLabel("Hora de Entrada");
		textHodaSaida =  new JTextField(12);
		labelHoraSaida = new JLabel("Hora de Saida");
		textHodaSaida= new JTextField(12);
		labelValorPagar = new JLabel("Valor a Pagar");
		labelData = new JLabel("Data");
		textData = new JTextField(12);
		textValor = new JTextField(12);
		botaocadastrar = new JButton("Cadastrar");	
		botaosair = new JButton("sair");
		add(labelModelo);
		add(textModelo);
		add(labelPlaca);
		add(textPlaca);
		add(labelHoraEntrada);
		add(textHodaEntrada);
		add(labelHoraSaida);
		add(textHodaSaida);
		add(labelData);
		add(textData);
		add(labelValorPagar);
		add(textValor);
		add(botaocadastrar);
		add(botaosair);
		textHodaSaida.setEnabled(false);
		textValor.setEnabled(false);
//		textHodaEntrada.setEnabled(false);
//		textData.setEnabled(false);
		textHodaEntrada.setText(controleData.getHoraPronta());
		textData.setText(controleData.getDataPronta());

	}
		public void eventos(){
			
				
			botaosair.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {

					if(e.getSource() == botaosair){
						dispose();
						
					}
				}
			});
			botaocadastrar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
				
		if(e.getSource() == botaocadastrar){
			

			textModelo.setText("");					
			textPlaca.setText("");
			textHodaEntrada.setText("");
			textHodaSaida.setText("");
			textValor.setText("");
			textData.setText("");
			

				}		
			}
	
			});
			
		}
	
	public JLabel getLabelnome() {
		return labelModelo;
	}
	public void setLabelnome(JLabel labelnome) {
		this.labelModelo = labelnome;
	}

	public JTextField getTextnome() {
		return textModelo;
	}
	public void setTextnome(JTextField textnome) {
		this.textModelo = textnome;
	}
	
	public JButton getBotaocadastrar() {
		return botaocadastrar;
	}
	public void setBotaocadastrar(JButton botaocadastrar) {
		this.botaocadastrar = botaocadastrar;
	}
	
	public JButton getBotaosair() {
		return botaosair;
	}
	public void setBotaosair(JButton botaosair) {
		this.botaosair = botaosair;
	}
	public JLabel getLabelPlaca() {
		return labelPlaca;
	}
	public void setLabelPlaca(JLabel labelPlaca) {
		this.labelPlaca = labelPlaca;
	}
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	
	public JLabel getLabelModelo() {
		return labelModelo;
	}
	public void setLabelModelo(JLabel labelModelo) {
		this.labelModelo = labelModelo;
	}
	public JLabel getLabelHoraEntrada() {
		return labelHoraEntrada;
	}
	public void setLabelHoraEntrada(JLabel labelHoraEntrada) {
		this.labelHoraEntrada = labelHoraEntrada;
	}
	public JLabel getLabelHoraSaida() {
		return labelHoraSaida;
	}
	public void setLabelHoraSaida(JLabel labelHoraSaida) {
		this.labelHoraSaida = labelHoraSaida;
	}
	public JLabel getLabelValorPagar() {
		return labelValorPagar;
	}
	public void setLabelValorPagar(JLabel labelValorPagar) {
		this.labelValorPagar = labelValorPagar;
	}
	public JTextField getTextPlaca() {
		return textPlaca;
	}
	public void setTextPlaca(JTextField textPlaca) {
		this.textPlaca = textPlaca;
	}
	public JTextField getTextModelo() {
		return textModelo;
	}
	public void setTextModelo(JTextField textModelo) {
		this.textModelo = textModelo;
	}
	public JTextField getTextHodaEntrada() {
		return textHodaEntrada;
	}
	public void setTextHodaEntrada(JTextField textHodaEntrada) {
		this.textHodaEntrada = textHodaEntrada;
	}
	public JTextField getTextHodaSaida() {
		return textHodaSaida;
	}
	public void setTextHodaSaida(JTextField textHodaSaida) {
		this.textHodaSaida = textHodaSaida;
	}
	public JTextField getTextValor() {
		return textValor;
	}
	public void setTextValor(JTextField textValor) {
		this.textValor = textValor;
	}
	
	public JLabel getLabelData() {
		return labelData;
	}
	public void setLabelData(JLabel labelData) {
		this.labelData = labelData;
	}
	public JTextField getTextData() {
		return textData;
	}
	public void setTextData(JTextField textData) {
		this.textData = textData;
	}
//	public static void main(String[] args) {
//		new TelaEntradaVeiculos();
//	}
}
