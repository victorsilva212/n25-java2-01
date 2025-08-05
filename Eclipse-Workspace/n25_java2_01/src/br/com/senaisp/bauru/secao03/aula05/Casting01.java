package br.com.senaisp.bauru.secao03.aula05;

public class Casting01 {

	public static void main(String[] args) {
		//Isso dá erro porque o byte vai de -128 a 127
		//byte bVlr = 128;
		short sVlr = 128;
		//Mostrando o short convertido para byte
		System.out.println("Isso vai dar erro na conversão: " + ( (byte) sVlr ));
		byte bVlr = 127;
		bVlr++; //iria para 128, mas o limite do byte é -128 a 127
		System.out.println("Isso vai extrapolar o limite de byte" + bVlr);
		short a, b, c;
		a = 1 ;
		b = 2 ;
		c = (short) (a + b) ;
	}

}
