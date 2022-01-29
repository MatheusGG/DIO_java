import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

	public static void main(String[] args) {
		
		@SuppressWarnings("serial")
		List<Gato> gatos = new ArrayList<>(){{
			add(new Gato("Jon", 18, "preto"));
			add(new Gato("Simba", 6, "listrado"));
		}};
		
		System.out.println(gatos);
		
		gatos.add(new Gato("Ruan", 12, "amarelo"));
		
		System.out.println(gatos);
		
		System.out.println("\n--\tOrdem Inserção\t--");
		System.out.println(gatos);
		
		System.out.println("\n--\tOrdem Aletória\t--");
		Collections.shuffle(gatos);
		System.out.println(gatos);
		
		System.out.println("\n--\tOrdem Natural(Nome)\t--");
		Collections.sort(gatos);
		System.out.println(gatos);
		
		System.out.println("\n--\tOrdem Natural(Idade)\t--");
		Collections.sort(gatos, new ComparatorIdade());
		System.out.println(gatos);
		
		System.out.println("\n--\tOrdem cor\t--");
		//gatos.sort(new ComparatorCor());
		Collections.sort(gatos, new ComparatorCor());
		System.out.println(gatos);
		
		System.out.println("\n--\tOrdem Nome/Cor/Idade\t--");
		gatos.sort(new ComparatorNomeCorIdade());
		System.out.println(gatos);
		
	}

}

class Gato implements Comparable<Gato>{
	private String nome;
	private int idade;
	private String cor;
	
	public Gato(String nome, int idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "{" + 
				"nome='" + nome + "\'" +
				", idade=" + idade +
				", cor='" + cor + "\'" +
				"}";	
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
}

class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato gato1, Gato gato2) {
		return Integer.compare(gato1.getIdade(), gato2.getIdade());
	}
	
	
}

class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato gato1, Gato gato2) {
		return gato1.getCor().compareToIgnoreCase(gato2.getCor());
	}
	
	
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato gato1, Gato gato2) {
		int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
		if (nome != 0) return nome;
	
		int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
		if (cor != 0) return cor;
		
		return Integer.compare(gato1.getIdade(), gato2.getIdade());
	}
	
	
}
