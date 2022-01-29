import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		List<Double> notas = new ArrayList<Double>();
		// List<tipo> lista = new ArrayList<>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		System.out.println(notas.toString());
		
		System.out.println("\nExibindo a posição da nota 5.0: " + notas.indexOf(5.0));
		
		System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
		notas.add(4, 8.0);
		System.out.println(notas);
		
		System.out.println("\nSubstitua a nota 5.0 pela nota 6.0");
		notas.set(notas.indexOf(5.0), 6.0);
		System.out.println(notas);
		
		System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5.0));
		System.out.println("Confira se a nota 6.0 está na lista: " + notas.contains(6.0));
		
		System.out.println("\nExiba todas as notas na ordem eme que foram informados: ");
		for (Double nota : notas) System.out.print(nota + " - ");
		for (int i = 0; i < notas.size(); i++) System.out.print(notas.get(i) + " - ");
		
		System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
		System.out.println(notas.toString());
		
		System.out.println("\nExiba a menor nota: " + Collections.min(notas));
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		System.out.println("\nExiba a soma de valores: " );
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Soma = " + soma);
		
		System.out.println("\nExiba a média das notas: " + (soma / notas.size()));
		
		System.out.println("\nRemova a nota 0:");
		notas.remove(0.0);
		System.out.println(notas);
		
		System.out.println("\nRemova a nota na posição 0");
		notas.remove(0);
		System.out.println(notas);
		
		System.out.println("\n Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1 .hasNext()) {
			Double next = iterator1.next();
			if(next < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		System.out.println("\nApague a lista: ");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());
		
	}
}
