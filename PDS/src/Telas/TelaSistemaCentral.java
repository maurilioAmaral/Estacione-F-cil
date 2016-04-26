package Telas;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import sun.font.TextLabel;

public class TelaSistemaCentral extends JFrame implements ActionListener{


	JButton entradaCarro;
	JButton saidaCarro;
	JButton listagemCarro;
	JButton botaosair;
	JLabel labelEntradaVeiculos;
	JLabel labelListagemVeiculos;
	JLabel labelRemoverVeiculos; 
	
	
	
	public TelaSistemaCentral(){
		tela();
		botoes();
		eventos();
	}
	public void tela(){
		setLayout(new GridLayout(4,2));

		setSize(600,250);
		setVisible(true);
		setLocationRelativeTo(null);
		
				
	}
	public void botoes(){
		entradaCarro = new JButton("Entrada");
		saidaCarro = new JButton("Saida");
		listagemCarro = new JButton("Listagem");
		botaosair = new JButton("Sair");
		labelEntradaVeiculos = new JLabel("Entrada de Veículos");
		labelRemoverVeiculos = new JLabel("Saída de Veículos");
		labelListagemVeiculos = new JLabel("Listagem de Veículos");
		add(labelEntradaVeiculos);
		add(entradaCarro);
		add(labelRemoverVeiculos);
		add(saidaCarro);
		add(labelListagemVeiculos);
		add(listagemCarro);
		add(botaosair);
	}
	
	
	public static void main(String[] args) {
		new TelaSistemaCentral();
	}
	public void eventos(){
		entradaCarro.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == entradaCarro){
					new TelaEntradaVeiculos();
				}
			}
		});
		
		botaosair.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			if(e.getSource() == botaosair){
				System.exit(0);

				
			}
				
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		
		
	}
	public JButton getEntradaCarro() {
		return entradaCarro;
	}
	public void setEntradaCarro(JButton entradaCarro) {
		this.entradaCarro = entradaCarro;
	}
	public JButton getSaidaCarro() {
		return saidaCarro;
	}
	public void setSaidaCarro(JButton saidaCarro) {
		this.saidaCarro = saidaCarro;
	}
	public JButton getListagemCarro() {
		return listagemCarro;
	}
	public void setListagemCarro(JButton listagemCarro) {
		this.listagemCarro = listagemCarro;
	}
	@Override
	public String toString() {
		return "TelaSistemaCentral [entradaCarro=" + entradaCarro + "]";
	}

}
