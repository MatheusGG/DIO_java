import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		
		System.out.println("\n--\tOrdem Aleatória\t--");
		Map<String, Livro> meusLivros = new HashMap<>(){{
			put("Hawkin, Steohen", new Livro("It", 256));
			put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
			put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));			
		}};
		for(Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		System.out.println("\n--\tOrdem Inserção\t--");
		Map<String, Livro> meusLivrosLinked = new LinkedHashMap<>(){{
			put("Hawkin, Steohen", new Livro("It", 256));
			put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
			put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));			
		}};
		for(Map.Entry<String, Livro> livro : meusLivrosLinked.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		System.out.println("\n--\tOrdem alfabética autores\t--");
		Map<String, Livro> meusLivrosTree = new TreeMap<>(meusLivros);			
		for(Map.Entry<String, Livro> livro : meusLivrosTree.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		System.out.println("\n--\tOrdem alfabética nomes dos livros\t--");
		Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
		meusLivros3.addAll(meusLivros.entrySet());
		for(Map.Entry<String, Livro> livro : meusLivros3){
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		
	}
}

class Livro {
	private String nome;
	private Integer paginas;
	
	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" +
				"nome='" + getNome() +
				"', paginas=" + getPaginas() +
				"}";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Livro livro = (Livro) o;
		return nome.equals(livro.nome) && paginas.equals(livro.paginas);
	}
	
	
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}
	
}
