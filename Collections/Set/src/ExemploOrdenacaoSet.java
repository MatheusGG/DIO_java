import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		
		System.out.println("\n--\tOrdem Aleatória\t--");
		Set<Serie> minhasSeries = new HashSet<>(){{
			add(new Serie("Game of Thrones", "fantasia", 60));
			add(new Serie("Dark", "drama", 60));
			add(new Serie("The Office", "comedia", 40));
			add(new Serie("Peacemaker", "comedia", 50));
		}};
		
		for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " +
															serie.getGenero() + " - " +
															serie.getTempoEpisodio());

		System.out.println("\n--\tOrdem Inserção\t--");
		Set<Serie> minhasSeriesLinked = new LinkedHashSet<>(){{
			add(new Serie("Game of Thrones", "fantasia", 60));
			add(new Serie("Dark", "drama", 60));
			add(new Serie("The Office", "comedia", 40));
			add(new Serie("Peacemaker", "comedia", 50));
		}};
		
		for (Serie serie : minhasSeriesLinked) System.out.println(serie.getNome() + " - " +
															serie.getGenero() + " - " +
															serie.getTempoEpisodio());
		
		System.out.println("\n--\tOrdem Natural (TempoEpisodio)\t--");
		Set<Serie> minhasSeriesTree = new TreeSet<>(minhasSeriesLinked); 
		for (Serie serie : minhasSeriesTree) System.out.println(serie.getNome() + " - " +
				serie.getGenero() + " - " +
				serie.getTempoEpisodio());
		
		System.out.println("\n--\tOrdem Natural (Nome/Gênero/TempoEpisodio)\t--");
		Set<Serie> minhasSeries1 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		minhasSeries1.addAll(minhasSeries);
		for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - " +
				serie.getGenero() + " - " +
				serie.getTempoEpisodio());
	}

}


class Serie implements Comparable <Serie>{
	
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
			
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	public String getNome() {
		return nome;
	}
	public String getGenero() {
		return genero;
	}
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" +
				"nome='" + getNome() +
				"', genero='" + getGenero() +
				"', tempoEpisodio=" + getTempoEpisodio();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, tempoEpisodio);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Serie serie = (Serie) o;
		return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
	}
	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0) return tempoEpisodio;
		return this.getGenero().compareTo(serie.getGenero());
	}
	
	
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
	
	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if (nome != 0) return nome;
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if (genero != 0) return genero;
		
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
	}
	
}
