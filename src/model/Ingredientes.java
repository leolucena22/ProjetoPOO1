package model;

import java.util.ArrayList;
import java.util.List;

public class Ingredientes {
	
	public static double total = 0;
	
	float[] paes = {0.25f, 0.30f, 0.70f, 1.30f};
	float[] queijos = {1.50f, 1.80f, 2.00f, 3.00f, 3.50f};
	float[] carnesPorco = {0.50f, 1.00f, 1.30f, 1.60f, 1.80f, 2.00f};
	float[] verduras = {0.30f, 0.45f, 0.50f};
	float[] molhos = {0.50f, 0.50f, 0.70f, 1.00f, 1.50f};
	float[] outros = {1.00f, 1.00f};
	
	static List<Double> ingredientesValores = new ArrayList<Double>();
	
	static List<String> ingredientesNomes = new ArrayList<String>();
	
	public static double calculaTotal2(double preco) {
		
		ingredientesValores.add(preco);
		double total = 0;
		
		return total += ingredientesValores.get(ingredientesValores.size() - 1);
	}
	
	public static double calculaTotal(double total2) {
		total += calculaTotal2(total2);
		
//		System.out.println(total);
//		
//		System.out.println(ingredientesValores);
		
		return total;
	}
	
	public static void adicionarProdutos(String nome) {
		ingredientesNomes.add(nome);
	}
	
	public static List<String> exibeProdutos() {
		// System.out.println(ingredientesNomes);
		return ingredientesNomes;
	}
	
	public static String imprimeTotal() {
		return String.valueOf(total);
	}
	
}
