package br.com.senaisp.bauru.secao03.aula06;

import javax.swing.JOptionPane;

class Exercício01 {

	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null,
                "Olá, paticipante, e bem vindo ao programa de namoro favorito da América",
                "Bem vindo, participante!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
		
		 String questão01 = (String)JOptionPane.showInputDialog(null,
	                "Qual é seu nome?",
	                "Questão 1",
	                JOptionPane.QUESTION_MESSAGE,
	                null, //ícone
	                null, //Opções de escolha
	                "String"); //opção default
		 //Solicitar para o usuário seu time favorito - selecionar de uma lista de times
		 //Essa lista deve ter pelo menos 5 nomes - Sugestão: Corinthians, São Paulo, Santos
		 //Noroeste, Palmeiras, Vasco...
		 
		 String[] acceptableValues = {"Corinthians", "Noroeste", "Palmeiras", "Santos", "São Paulo"};
	        String questão02 = (String)JOptionPane.showInputDialog(null,
	                "Qual seu time favorito?",
	                "Questão 2",
	                2,
	                null,
	                acceptableValues,
	                acceptableValues[1]);
		 
		
	}

}
