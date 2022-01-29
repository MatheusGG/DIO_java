import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import java.util.Iterator;


public class ExemploMap {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		
		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares);
		
		System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
		carrosPopulares.put("gol", 16.1);
		System.out.println(carrosPopulares);
		
		System.out.println("\nConfira se o modelo tucson está no dicionário: " +
							carrosPopulares.containsKey("tucson"));
		
		System.out.println("\nExiba o consumo do uno: " +
							carrosPopulares.get("uno"));
		
		// Métodos que não podem ser executados
		System.out.println("Exiba o terceiro modelo adicionado");
		
		System.out.println("\nExiba os modelos: ");
		Set<String> modelos =  carrosPopulares.keySet();
		System.out.println(modelos);
		
		System.out.println("\nExiba o consumo do carros: ");
		Collection<Double> consumos = carrosPopulares.values();
		System.out.println(consumos);
		
		System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
		double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";
		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
			}
		}
		
		System.out.println("Exiba o modelo menos econômico e seu consumo: ");
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		String modeloMenosEficiente = "";
		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if(entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
			}
		}
		
		System.out.println("Exiba a soma dos consumos");
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("Exiba a soma dos consumos: " + soma);
		
		System.out.println("\nExiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));
		
		System.out.println("\n" + carrosPopulares);
		System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next().equals(15.6)) iterator1.remove();
		}
		System.out.println(carrosPopulares);
		
		System.out.println("\nExiba todos os itens na ordem em que foram informados: ");
		Map<String, Double> carrosPopularesLinked = new LinkedHashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopularesLinked);
		
		
		System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
		Map<String, Double> carrosPopularesTree = new TreeMap<>(carrosPopularesLinked);
		System.out.println(carrosPopularesTree);
		
		System.out.println("\nApague o dicionário de carros: ");
		carrosPopulares.clear();
		System.out.println(carrosPopulares);
		
		System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
		
		
		

	}

}
