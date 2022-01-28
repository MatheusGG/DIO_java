package excecoes;

@SuppressWarnings("serial")
public class DivisaoNaoExataException extends Exception{

    @SuppressWarnings("unused")
	private int numerado;
    @SuppressWarnings("unused")
	private int denominador;

    public DivisaoNaoExataException(String message, int numerado, int denominador) {
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }
}