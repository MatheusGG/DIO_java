package excecoes;

import javax.swing.JOptionPane;

public class UncheckedException {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Numerador: ");
		String b = JOptionPane.showInputDialog("Numerador: ");
		
		try {
			@SuppressWarnings("unused")
			int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
			System.out.println("Resultado: ");			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro" + e.getMessage());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Impossível dividir por zero" + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Chegou no finally");
		}
		
	}
	
	public static int dividir(int a, int b) { return a / b; }

}
