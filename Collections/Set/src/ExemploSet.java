import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
	
	public static void main(String[] args) {
		
		System.out.println("Crie um conjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas.toString());
		
		//Set n�o possue indice
		//System.out.println("Exiba a posi��o da nota 5.0");
		//System.out.println("Adicione na lista a nota 8.0 na posi��o 4: ");
		//System.out.println("Substitua nota 5.0 pela 6.0: ");
		//System.out.println("Exiba a terceira nota adicionada");
		//System.out.println("Remover nota na posi��o 0");
		
		System.out.println("Confira se a nota 5.0 est� no conjunto: " + notas.contains(5d));
		
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> iterator =  notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma dos valores: " + soma);
		
		System.out.println("Exiba a m�dia das notas: " + (soma / notas.size()));
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0.0);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba na lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) iterator.remove();
		}
		System.out.println(notas);
		
		System.out.println("Exiba todas as notas na ordem em que foram informados: ");
		// set do tipo linked Hash permite saber a ordem em que os elementos foram inseridos
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println(notas2);
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		// set do tipo treeset permite que sejam exibidos os valores em ordem crescente
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("Apague todo o conjunto");
		notas.clear();
		
		System.out.println("Confira se o conjunto est� vazio: " + notas.isEmpty());
		System.out.println("Confira se o conjunto 2 est� vazio: " + notas2.isEmpty());
		System.out.println("Confira se o conjunto 3 est� vazio: " + notas3.isEmpty());
		
	}

}
