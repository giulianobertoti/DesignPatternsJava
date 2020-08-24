

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class View implements ActionListener, Observer {
	private Subject model;
	private controllerInterface controller;
	private String temperature = "0";
	private String humidity = "0";
	private String pressure = "0";
	
	JFrame frame;
	JPanel panelBotoes;
	JPanel panelDados;
	JPanel panelTemp;
	JPanel panelPres;
	JPanel panelHumi;
	JLabel labelTemp;
	JLabel labelPres;
	JLabel labelHumi;
	JLabel tempText;
	JLabel presText;
	JLabel humiText;
	JButton assinar;
	JButton cancelar;
	
	public View(Subject mo, controllerInterface co) {
		this.model = mo;
		this.controller = co;
	}
	
	
	public void createView(){
		
		frame = new JFrame("Estação Meteorológica");
		panelBotoes = new JPanel();
		panelDados = new JPanel();
		panelTemp = new JPanel();
		panelPres = new JPanel();
		panelHumi = new JPanel();
		assinar = new JButton("Assinar Clima");
		cancelar = new JButton("Cancelar Assinatura");
		labelTemp = new JLabel();
		labelPres = new JLabel();
		labelHumi = new JLabel();
		tempText = new JLabel("Temperatura");
		presText = new JLabel("Pressão");
		humiText = new JLabel("Humidade");
		
		
		assinar.addActionListener(this);
		cancelar.addActionListener(this);
		
		panelBotoes.add(assinar);
		panelBotoes.add(cancelar);
		panelTemp.add(tempText);
		panelTemp.add(labelTemp);
		panelPres.add(presText);
		panelPres.add(labelPres);
		panelHumi.add(humiText);
		panelHumi.add(labelHumi);
		panelDados.add(panelTemp);
		panelDados.add(panelPres);
		panelDados.add(panelHumi);
		frame.getContentPane().add(BorderLayout.SOUTH, panelBotoes);
		frame.getContentPane().add(BorderLayout.CENTER, panelDados);
		
		labelTemp.setText(temperature);
		labelHumi.setText(humidity);
		labelPres.setText(pressure);
		
		
		frame.setSize(300, 150);
		frame.setVisible(true);
		
	}

	public void update(String temp, String humi, String press) {
        temperature = temp;
        humidity = humi;
		pressure = press;
        
		display();
	}

	public void display() {
		
		labelTemp.setText(temperature);
		labelPres.setText(humidity);
		labelHumi.setText(pressure);
		
	}
	
	public void habilitarBotaoAssinar(){
		
		assinar.setEnabled(true);
		
	}
	
	public void desabilitarBotaoAssinar(){
		
		assinar.setEnabled(false);
		
	}
	
	
	public void habilitarBotaoCancelar(){
		
		cancelar.setEnabled(true);
		
	}
	
	public void desabilitarBotaoCancelar(){
		
		cancelar.setEnabled(false);
		
	}
	
	public void actionPerformed(ActionEvent event){
		if (event.getSource() == assinar){
				controller.assinar();
		}
		if (event.getSource() == cancelar){
				controller.cancelar();
		}
	}
}
