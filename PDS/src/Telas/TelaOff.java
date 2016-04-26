package Telas;
//import package BD;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Codigo.ArrayXml;
import Codigo.Cliente;

public class TelaOff extends JFrame implements ActionListener{
	Cliente cliente = new Cliente();
	ArrayXml coco = new ArrayXml();

	JLabel labelnome;
	JLabel labelrg;
	JTextField textnome;
	JTextField textrg;
	JButton botaocancelar;
	JButton botaosalvar;
	
	public TelaOff(){
		ajusteTelaCadastro();
		adicionarBotoes();
		eventos();
	}
	public void ajusteTelaCadastro(){
		setSize(500,150);
	    setVisible(true);
		setLayout(new GridLayout(4,2));
		setTitle("cadastro");
//		dispose();
		setLocationRelativeTo(null);
		
	}
	public void adicionarBotoes(){
		labelnome = new JLabel("nome");
		labelrg = new JLabel("rg");
		textnome = new JTextField(15);			
		textrg = new JTextField(15);		
		botaocancelar = new JButton("cancelar");
		botaosalvar = new JButton("salvar");
		add(labelnome);
		add(textnome);
		add(labelrg);		
		add(textrg);
		add(botaocancelar);
		add(botaosalvar);
				
	}
	public void eventos(){
		
		
		
		textnome.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
//				cliente.setNome(textnome.getText());
				
			}
			
			});
			textrg.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
//					System.out.println(""+cliente.getRg());
					
				}
			
		});
						
		botaocancelar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			if(e.getSource() == botaocancelar);
		    dispose();
				
			}
		});
		botaosalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == botaosalvar);
//				ArrayXml.meuXml.add(cliente);
				cliente.setNome(textnome.getText());
				cliente.setRg(textrg.getText());
				coco.meuXml.add(cliente);
//				System.out.println(""+textnome.getName());
				System.out.println("nome " +coco.meuXml.get(0).getNome()+"rg "+coco.meuXml.get(0).getRg());
//				for(int i=0; i<ArrayXml.meuXml.size();i++){
//					ArrayXml.meuXml.add(cliente);
//			JOptionPane.showMessageDialog(null," cadastro salvo com sucesso" +ArrayXml.meuXml.get(i).getNome());
//					JOptionPane.showMessageDialog(null,""ArrayXml.meuXml.get(index));
//			}
				
			}
		});
		
	}


	public JLabel getLabelnome() {
		return labelnome;
	}
	public void setLabelnome(JLabel labelnome) {
		this.labelnome = labelnome;
	}
	public JLabel getLabelrg() {
		return labelrg;
	}
	public void setLabelrg(JLabel labelrg) {
		this.labelrg = labelrg;
	}
	public JTextField getTextnome() {
		return textnome;
	}
	public void setTextnome(JTextField textnome) {
		this.textnome = textnome;
	}
	public JTextField getTextrg() {
		return textrg;
	}
	public void setTextrg(JTextField textrg) {
		this.textrg = textrg;
	}
	public JButton getBotaosalvar() {
		return botaosalvar;
	}
	public void setBotaosalvar(JButton botaosalvar) {
		this.botaosalvar = botaosalvar;
	}
	public JButton getBotaocancelar() {
		return botaocancelar;
	}
	public void setBotaocancelar(JButton botaocancelar) {
		this.botaocancelar = botaocancelar;
	}
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	

}
