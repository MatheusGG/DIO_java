import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@SuppressWarnings("unused")
public class ExercicioTemperatura {

	public static void main(String[] args) {
		
		Random tempAleatoria = new Random();
		
		@SuppressWarnings("serial")
		List<Temperatura> temperaturas = new ArrayList<>() {{
			add(new Temperatura("Janeiro", 1, tempAleatoria.nextDouble()));
			add(new Temperatura("Fevereiro", 2, tempAleatoria.nextDouble()));
			add(new Temperatura("Março", 3, tempAleatoria.nextDouble()));
			add(new Temperatura("Abril", 4, tempAleatoria.nextDouble()));
			add(new Temperatura("Maio", 5, tempAleatoria.nextDouble()));
		}};
		
		temperaturas.add(new Temperatura("Junho", 6, tempAleatoria.nextDouble()));
		
		System.out.println(temperaturas);
		
		int i = 0;
		double media = 0;
		while(i < 6) {
			double temp = temperaturas.get(i).getTemperatura();
			media += temp;
			i++;
		}
		
		media /= 6;
		for(int j = 0; j < 6; j++) {
			double temp = temperaturas.get(j).getTemperatura(); 
			if(temp > media) System.out.print(temperaturas.get(j) + ", ");
		}
	
	}
	
	
}

class Temperatura {
	private String mes;
	private int numMes;
	private double temperatura;
	
	public Temperatura(String mes, int numMes, double temperatura) {
		super();
		this.mes = mes;
		this.numMes = numMes;
		this.temperatura = temperatura;
	}

	public String getMes() {
		return mes;
	}

	public int getNumMes() {
		return numMes;
	}

	public double getTemperatura() {
		return temperatura;
	}

	@Override
	public String toString() {
		return this.numMes + " - " +
				this.mes;
	}
	
	
	
	
	
}