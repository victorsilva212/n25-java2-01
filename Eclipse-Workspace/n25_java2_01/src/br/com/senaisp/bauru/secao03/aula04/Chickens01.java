package br.com.senaisp.bauru.secao03.aula04;

public class Chickens01 {

	public static void main(String[] args) {
		int totalEggs = 0;
		int eggsPerChicken = 4/*5*/, chickenCount = 8/*3*/;
		//1° dia
		totalEggs += eggsPerChicken * chickenCount++; // 15 / 32
		//2° dia
		totalEggs += eggsPerChicken * chickenCount; // 15 + 20 / 36
		//3° dia
		chickenCount/=2; // animal come metade das galinhas - 4
		totalEggs += eggsPerChicken * chickenCount; // 15 + 20 + 10 // 32+36+16 = 84
		//imprimir o total
		
		System.out.println(totalEggs);
	}

}
